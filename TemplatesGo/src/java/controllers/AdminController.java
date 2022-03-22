/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.SellerController.SAVE_DIRECTORY;
import dbmanager.CartManager;
import dbmanager.CategoryManager;
import dbmanager.OrderManager;
import dbmanager.ReportManager;
import dbmanager.TemplateImageManager;
import dbmanager.TemplateManager;
import dbmanager.UserManager;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Category;
import models.Report;
import models.Template;
import models.TemplateImage;
import models.User;

/**
 *
 * @author Thanh
 */
public class AdminController extends HttpServlet {

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
        UserManager userManager = new UserManager();
        ReportManager reportManager = new ReportManager();
        TemplateManager templateManager = new TemplateManager();
        CategoryManager categoryManager = new CategoryManager();
        TemplateImageManager templateImageManager = new TemplateImageManager();

        if ("/userList".equals(path)) {
            HttpSession httpSession = request.getSession();
            User userSession = (User) httpSession.getAttribute("userSession");

            if (userSession == null || !userSession.getRole().equals("admin")) {
                response.sendRedirect(request.getContextPath() + "/Template/listing");
                return;
            }

            int pageNo = Integer.parseInt(request.getParameter("pageNo"));
            int userId = -1;
            if (request.getParameter("userId") != null) {
                userId = Integer.parseInt(request.getParameter("userId"));
            }

            int size = userManager.getSize();
            List<User> userList = userManager.getUserList((pageNo - 1) * 4, 4);
            if (userId > 0) {
                User user = userManager.getUser(userId);
                request.setAttribute("user", user);
            }

            for (User user : userList) {
                if (user.isBanStatus() && user.getUnbanDate().before(new Date(System.currentTimeMillis()))) {
                    userManager.unbanUser(user.getId());
                }
            }

            request.setAttribute("size", size);
            request.setAttribute("list", userList);

            request.getRequestDispatcher("/admin/accountList.jsp").forward(request, response);
        } else if ("/banUser".equals(path)) {
            HttpSession httpSession = request.getSession();
            User userSession = (User) httpSession.getAttribute("userSession");

            if (userSession == null || !userSession.getRole().equals("admin")) {
                response.sendRedirect(request.getContextPath() + "/Template/listing");
                return;
            }
            
            int pageNo = Integer.parseInt(request.getParameter("pageNo"));
            int userId = Integer.parseInt(request.getParameter("userId"));
            int numberBanDate = Integer.parseInt(request.getParameter("numberBanDate"));

            User updateUser = userManager.getUser(userId);
            updateUser.setBanStatus(true);
            updateUser.setUnbanDate(new Date(System.currentTimeMillis() + numberBanDate * 24 * 60 * 60 * 1000));

            userManager.updateBanUser(updateUser);

            response.sendRedirect(request.getContextPath() + "/Admin/userList?pageNo=" + pageNo);
        } else if ("/reportList".equals(path)) {
            HttpSession httpSession = request.getSession();
            User userSession = (User) httpSession.getAttribute("userSession");

            if (userSession == null || !userSession.getRole().equals("admin")) {
                response.sendRedirect(request.getContextPath() + "/Template/listing");
                return;
            }
            
            
            int pageNo = Integer.parseInt(request.getParameter("pageNo"));
            int userId = -1, templateId = -1;
            if (request.getParameter("userId") != null) {
                userId = Integer.parseInt(request.getParameter("userId"));
            }
            if (request.getParameter("templateId") != null) {
                templateId = Integer.parseInt(request.getParameter("templateId"));
            }
            List<Report> list;
            int size;
            if (request.getParameter("status") == null || "All".equals(request.getParameter("status"))) {
                list = reportManager.list((pageNo - 1) * 4, 4);
                size = reportManager.getSize();
            } else {
                String statusStr = request.getParameter("status");
                list = reportManager.list(statusStr, (pageNo - 1) * 4, 4);
                size = reportManager.getSize(statusStr);
            }

            HashMap<Integer, String> sellerNameList = new HashMap<>();
            HashMap<Integer, Integer> sellerIdList = new HashMap<>();
            HashMap<Integer, String> reporterNameList = new HashMap<>();
            HashMap<Integer, Integer> reporterIdList = new HashMap<>();
            for (Report report : list) {
                String sellerName = userManager.getSellerNameFromReport(report.getId());
                sellerNameList.put(report.getId(), sellerName);

                int sellerId = userManager.getSellerIdFromReport(report.getId());
                sellerIdList.put(report.getId(), sellerId);

                String reporterName = userManager.getReporterNameFromReport(report.getId());
                reporterNameList.put(report.getId(), reporterName);

                int reporterId = userManager.getReporterIdFromReport(report.getId());
                reporterIdList.put(report.getId(), reporterId);
            }
            if (userId > 0) {
                User user = userManager.getUser(userId);
                request.setAttribute("user", user);
            }
            if (templateId > 0) {
                Template template = templateManager.getTemplateById(templateId);
                request.setAttribute("template", template);
                String cateName = categoryManager.getCategory(template.getCategoryId()).getCategory();
                request.setAttribute("category", cateName);
                ArrayList<TemplateImage> imgList = templateImageManager.getImageList(templateId);
                request.setAttribute("imgList", imgList);
            }

            request.setAttribute("size", size);
            request.setAttribute("list", list);
            request.setAttribute("sellerNameList", sellerNameList);
            request.setAttribute("reporterNameList", reporterNameList);
            request.setAttribute("sellerIdList", sellerIdList);
            request.setAttribute("reporterIdList", reporterIdList);

            request.getRequestDispatcher("/admin/reviewReport.jsp").forward(request, response);
        } else if ("/updateReport".equals(path)) {
            int pageNo = Integer.parseInt(request.getParameter("pageNo"));
            String status = request.getParameter("action");
            int reportId = Integer.parseInt(request.getParameter("reportId"));
            Report report = reportManager.load(reportId);
            report.setStatus(status);
            reportManager.update(report);

            request.getRequestDispatcher("/Admin/reportList?pageNo=" + pageNo).forward(request, response);
        } else if ("/categoryManager".equals(path)) {
            List<Category> cateList = categoryManager.getCategoryList();

            request.setAttribute("cateList", cateList);

            request.getRequestDispatcher("/admin/categoryManager.jsp").forward(request, response);
        } else if ("/updateCategory".equals(path)) {
            int cateId = Integer.parseInt(request.getParameter("cateId"));
            String cateName = request.getParameter("cateName");
            Category cate = new Category(cateId, cateName);
            categoryManager.updateCategory(cate);
            response.sendRedirect(request.getContextPath() + "/Admin/categoryManager");
        } else if ("/addCategory".equals(path)) {
            String cateName = request.getParameter("cateName");
            Category cate = categoryManager.getCategory(cateName);
            if (cate != null) {
                request.setAttribute("errorMsg", "This category is already existed.");
                request.setAttribute("cateNameForm", cateName);
                request.getRequestDispatcher("/Admin/categoryManager").forward(request, response);
            } else {
                Category newCate = new Category(cateName);
                categoryManager.insertCategory(newCate);
                response.sendRedirect(request.getContextPath() + "/Admin/categoryManager");
            }
        } else if ("/deleteTemplate".equals(path)) {
            int pageNo = Integer.parseInt(request.getParameter("pageNo"));
            int tempId = Integer.parseInt(request.getParameter("temId"));
            
            Template template = templateManager.getTemplateById(tempId);
            //delete  images
            String appPath = request.getServletContext().getRealPath("");
            appPath = appPath.replace('\\', '/');

            String fullSavePath = null;
            if (appPath.endsWith("/")) {
                fullSavePath = appPath + SAVE_DIRECTORY;
            } else {
                fullSavePath = appPath + "/" + SAVE_DIRECTORY;
            }
            
            ArrayList<TemplateImage> imgList = templateImageManager.getImageList(tempId);
            templateImageManager.deleteTemplateImage(tempId);
            for (TemplateImage img : imgList) {
                File imgFile = new File(fullSavePath + "/" + img.getPath());
                imgFile.delete();
            }
            //delete report
            reportManager.deleteByTemplate(tempId);
            //delete source code
            new File(fullSavePath + "/"  + template.getSourceCodePath()).delete();
            //delete cart
            CartManager cartManager = new CartManager();
            cartManager.deleteCartByTemplate(tempId);
            //delete order
            new OrderManager().deleteOrderByTemplate(tempId);

            templateManager.deleteTemplateById(tempId);
            
            
            response.sendRedirect(request.getContextPath() + "/Admin/reportList?pageNo=" + pageNo);

        }

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
