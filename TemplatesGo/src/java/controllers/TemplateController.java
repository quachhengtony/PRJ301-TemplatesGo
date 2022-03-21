/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dbmanager.TemplateManager;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import models.Report;
import models.Template;
import models.User;

/**
 *
 * @author Tony Quach
 */
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50) // 50MB
public class TemplateController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public static final String SAVE_DIRECTORY = "uploads";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getPathInfo();
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);

        if (path.equals("/listing")) {
            try {
                int page = 1;
                int recordsPerPage = 6;
                if (request.getParameter("page") != null) {
                    page = Integer.parseInt(request.getParameter("page"));
                }

                String search = request.getParameter("search");
                String sort = request.getParameter("sort");
                String maxPrice = request.getParameter("maxPrice");
                String category = request.getParameter("category");

                TemplateManager templateManager = new TemplateManager();
                List<Template> templates = new ArrayList<>();
                int numberOfPages = 0;
                templates = templateManager.getTemplates((page - 1) * recordsPerPage, recordsPerPage);
                int numOfRecords = templateManager.getNumberOfRecords();
                numberOfPages = (int) Math.ceil(numOfRecords * 1.0 / recordsPerPage);

                if (search != null) {
                    templates.clear();
                    templates = templateManager.getTemplatesBySearchString(search, (page - 1) * recordsPerPage, recordsPerPage);
                }

                if (maxPrice != null) {
                    templates.clear();
                    templates = templateManager.getTemplatesByPrice(Integer.parseInt(maxPrice), (page - 1) * recordsPerPage, recordsPerPage);
                }

                if (category != null) {
                    templates.clear();
                    templates = templateManager.getTemplatesByCategory(Integer.parseInt(category), (page - 1) * recordsPerPage, recordsPerPage);
                }

                if (sort != null) {
                    switch (sort) {
                        case "latest":
                            templates.clear();
                            templates = templateManager.getTemplatesByLatest((page - 1) * recordsPerPage, recordsPerPage);
                            break;
                        case "oldest":
                            templates.clear();
                            templates = templateManager.getTemplatesByOldest((page - 1) * recordsPerPage, recordsPerPage);
                            break;
                        case "bestSeller":
                            templates.clear();
                            templates = templateManager.getTemplatesByPopularity((page - 1) * recordsPerPage, recordsPerPage);
                            break;
                        case "priceAscending":
                            templates.clear();
                            templates = templateManager.getTemplatesByPriceAscending((page - 1) * recordsPerPage, recordsPerPage);
                            break;
                        case "priceDescending":
                            templates.clear();
                            templates = templateManager.getTemplatesByPriceDescending((page - 1) * recordsPerPage, recordsPerPage);
                            break;
                    }
                }

                request.setAttribute("templates", templates);
                request.setAttribute("numberOfPages", numberOfPages);
                request.setAttribute("currentPage", page);
                request.getRequestDispatcher("/user/home.jsp").forward(request, response);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if (path.equals("/submit")) {
            HttpSession httpSession = request.getSession();
            User user = (User) httpSession.getAttribute("userSession");

            if (user == null || user.getRole().equals("buyer")) {
                response.sendRedirect(request.getContextPath() + "/Template/listing");
                return;
            }

            request.getRequestDispatcher("/seller/postTemplate.jsp").forward(request, response);
        }
        if (path.equals("/post")) {
            HttpSession httpSession = request.getSession();
            User user = (User) httpSession.getAttribute("userSession");

            if (user == null || user.getRole().equals("buyer")) {
                response.sendRedirect(request.getContextPath() + "/User/login");
                return;
            }

            try {
                String name = request.getParameter("name");
                String category = request.getParameter("category");
                String description = request.getParameter("description");
                String hostURL = request.getParameter("hostURL");
                String price = request.getParameter("price");

                if (name != null && category != null && description != null & hostURL != null && price != null) {
                    String appPath = request.getServletContext().getRealPath("");
                    appPath = appPath.replace('\\', '/');

                    String fullSavePath = null;
                    if (appPath.endsWith("/")) {
                        fullSavePath = appPath + SAVE_DIRECTORY;
                    } else {
                        fullSavePath = appPath + "/" + SAVE_DIRECTORY;
                    }

                    File fileSaveDir = new File(fullSavePath);
                    if (!fileSaveDir.exists()) {
                        fileSaveDir.mkdir();
                    }

                    String filePath = "";

                    TemplateManager templateManager = new TemplateManager();
                    int createdTemplateId = 0;
                    for (Part part : request.getParts()) {
                        String fileName = extractFileName(part);

                        if (fileName != null && fileName.length() > 0 && fileName.contains("zip")) {
                            filePath = fullSavePath + File.separator + fileName;
                            part.write(filePath);

                            if (user != null) {
                                Template template = new Template(user.getId(), 1, name.trim(), description.trim(), Float.parseFloat(price), hostURL.trim(), fileName, date, date, 0);
                                createdTemplateId = templateManager.postTemplateAndReturnId(template);
                                System.out.println("ID RETURNED: " + createdTemplateId);
                            }
                        }
                        if (fileName != null && fileName.length() > 0 && (fileName.contains("png") || fileName.contains("jpg"))) {
                            filePath = fullSavePath + File.separator + fileName;
                            part.write(filePath);

                            System.out.println("SAVING IMAGE... " + fileName + createdTemplateId);
                            templateManager.addTemplateImage(createdTemplateId, fileName);
                        }
                    }
                    response.sendRedirect(request.getContextPath() + "/Seller/dashboard?pageNo=1");
                }
            } catch (Exception e) {
                e.printStackTrace();
                request.setAttribute("errorMessage", "Error: " + e.getMessage());
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/seller/postTemplate.jsp");
                dispatcher.forward(request, response);
            }
        }

        if (path.equals("/detail")) {
            try {
                String id = request.getParameter("id");
                if (id != null) {
                    TemplateManager templateManager = new TemplateManager();
                    Template template = templateManager.getTemplateById(Integer.parseInt(id));
                    List<String> images = templateManager.getTemplateImages(Integer.parseInt(id));
                    String seller = templateManager.getTemplateSeller(template.getSellerId());
                    request.setAttribute("template", template);
                    request.setAttribute("images", images);
                    request.setAttribute("seller", seller);
                }
                request.getRequestDispatcher("/buyer/templateDetail.jsp").forward(request, response);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        if (path.equals("/report")) {
            HttpSession httpSession = request.getSession();
            User userSession = (User) httpSession.getAttribute("userSession");

            if (userSession == null || !userSession.getRole().equals("buyer")) {
                response.sendRedirect(request.getContextPath() + "/User/login");
                return;
            }

            try {
                String templateId = request.getParameter("templateId");
                String content = request.getParameter("content");
                if (templateId != null) {
                    Report report = new Report(Integer.parseInt(templateId), userSession.getId(), content.trim(), date, "Waiting");
                    TemplateManager templateManager = new TemplateManager();
                    if (templateManager.createReport(report)) {
                        response.sendRedirect(request.getContextPath() + "/Template/listing?detail=" + templateId);
                    }
                }
                request.getRequestDispatcher("/buyer/templateDetail.jsp").forward(request, response);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    private String extractFileName(Part part) {
        // form-data; name="file"; filename="C:\file1.zip"
        // form-data; name="file"; filename="C:\Note\file2.zip"
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                // C:\file1.zip
                // C:\Note\file2.zip
                String clientFileName = s.substring(s.indexOf("=") + 2, s.length() - 1);
                clientFileName = clientFileName.replace("\\", "/");
                int i = clientFileName.lastIndexOf('/');
                // file1.zip
                // file2.zip
                return clientFileName.substring(i + 1);
            }
        }
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
