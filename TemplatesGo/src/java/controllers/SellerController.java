/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dbmanager.CartManager;
import dbmanager.CategoryManager;
import dbmanager.OrderManager;
import dbmanager.ReportManager;
import dbmanager.TemplateImageManager;
import dbmanager.TemplateManager;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import models.Category;
import models.Template;
import models.TemplateImage;
import models.User;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Thanh
 */
public class SellerController extends HttpServlet {
    public static final String SAVE_DIRECTORY = "uploads";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getPathInfo();
        CategoryManager cateManager = new CategoryManager();
        TemplateManager tempManager = new TemplateManager();
        TemplateImageManager tempImgManager = new TemplateImageManager();
        ReportManager reportManager = new ReportManager();
        if ("/dashboard".equals(path)) {
            HttpSession httpSession = request.getSession();
            User userSession = (User) httpSession.getAttribute("userSession");

            if (userSession == null || !userSession.getRole().equals("seller")) {
                response.sendRedirect(request.getContextPath() + "/User/login");
                return;
            }

            int pageNo = Integer.parseInt(request.getParameter("pageNo"));
            ArrayList<Category> cateList = cateManager.getCategoryList();
            int tempSize = tempManager.getSize(userSession.getId());
            List<Template> tempList = tempManager.getTemplatesBySellerId(userSession.getId(), (pageNo - 1) * 4, 4);
            HashMap<Integer, ArrayList<TemplateImage>> imgList = new HashMap();
            for (Template template : tempList) {
                imgList.put(template.getId(), tempImgManager.getImageList(template.getId()));
            }

            request.setAttribute("cateList", cateList);
            request.setAttribute("size", tempSize);
            request.setAttribute("tempList", tempList);
            request.setAttribute("imgList", imgList);

            request.getRequestDispatcher("/seller/sellerDashboard.jsp").forward(request, response);
        } 
//            else if ("/post".equals(path)) {
//            ArrayList<Category> cateList = cateManager.getCategoryList();
//            request.setAttribute("cateList", cateList);
//
//            request.getRequestDispatcher("/seller/postTemplate.jsp").forward(request, response);
//        } else if ("/add".equals(path)) {
//            ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
//            Map<String, List<FileItem>> filesMap = upload.parseParameterMap(request);
//
//            int sellerId = Integer.parseInt(filesMap.get("sellerId").get(0).getString());
//            String name = filesMap.get("name").get(0).getString();
//            int cateId = new Integer(filesMap.get("categoryId").get(0).getString());
//            String description = filesMap.get("description").get(0).getString();
//            String hostURL = filesMap.get("hostURL").get(0).getString();
//            List<FileItem> images = filesMap.get("images");
//            float price = new Float(filesMap.get("price").get(0).getString());
//            List<FileItem> sourceCode = filesMap.get("sourceCode");
//
//            /*int tempId = tempManager.postTemplate(new Template(sellerId,
//                    cateId,
//                    name,
//                    description,
//                    price,
//                    hostURL,
//                    "",
//                    new Date(System.currentTimeMillis()),
//                    new Date(System.currentTimeMillis()),
//                    0));*/
//            int tempId = tempManager.postTemplateAndReturnId(new Template(sellerId,
//                    cateId,
//                    name,
//                    description,
//                    price,
//                    hostURL,
//                    "",
//                    new Date(System.currentTimeMillis()),
//                    new Date(System.currentTimeMillis()),
//                    0));
//
//            try {
//                for (FileItem image : images) {
//                    int imgId = tempImgManager.insertImage(new TemplateImage(tempId, ""));
//                    File theDir = new File(Template.IMAGE_PATH + "/Template_" + tempId);
//                    if (!theDir.exists()) {
//                        theDir.mkdirs();
//                        try {
//                            Thread.sleep(2000);
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(SellerController.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                    String imgName = image.getName();
//                    String extension = imgName.substring(imgName.lastIndexOf("."), imgName.length());
//                    image.write(new File(Template.IMAGE_PATH + "/Template_" + tempId + "/img_" + imgId + extension));
//                    tempImgManager.updateImagePath(imgId, "/Template_" + tempId + "/img_" + imgId + extension);
//                }
//            } catch (Exception e) {
//            }
//
//            try {
//                sourceCode.get(0).write(new File(Template.SOURCE_CODE_PATH + "/Template_" + tempId + ".zip"));
//                tempManager.updateSourceCodePath(tempId, "/Template_" + tempId + ".zip");
//            } catch (Exception e) {
//            }
//
//            try {
//                Thread.sleep(1500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(SellerController.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            response.sendRedirect(request.getContextPath() + "/Seller/dashboard?pageNo=1");
//
//        } 
        
        
            else if ("/update".equals(path)) {
            ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
            Map<String, List<FileItem>> filesMap = upload.parseParameterMap(request);

            int pageNo = Integer.parseInt(filesMap.get("pageNo").get(0).getString());
            int templateId = Integer.parseInt(filesMap.get("templateId").get(0).getString());
            String name = filesMap.get("name").get(0).getString();
            int cateId = new Integer(filesMap.get("categoryId").get(0).getString());
            String description = filesMap.get("description").get(0).getString();
            String hostURL = filesMap.get("hostURL").get(0).getString();
            List<FileItem> images = filesMap.get("images");
            float price = new Float(filesMap.get("price").get(0).getString());
            List<FileItem> sourceCode = filesMap.get("sourceCode");

            Template temp = tempManager.getTemplateById(templateId);
            
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

            if (images != null && images.size() != 0) {
                if (images.size() == 1 && images.get(0).getName() == "") {

                } else {
                    //delete old images
                    ArrayList<TemplateImage> imgList = tempImgManager.getImageList(templateId);
                    for (TemplateImage img : imgList) {
                        String imgFilePath = fullSavePath + "/" + img.getPath();
                        System.out.println(imgFilePath);
                        File imgFile = new File(imgFilePath);
                        imgFile.delete();
                    }
                    tempImgManager.deleteTemplateImage(templateId);

                    //add new images to database
                    try {
                        for (FileItem image : images) {
                            int imgId = tempImgManager.insertImage(new TemplateImage(templateId, image.getName()));
                            
                            String imgName = image.getName();
                            image.write(new File(fullSavePath + "/" + imgName));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            if (sourceCode != null && sourceCode.size() != 0) {
                if (sourceCode.size() == 1 && sourceCode.get(0).getName() == "") {

                } else {
                    try {
                        //delete old source Code
                        File sourceCodeFile = new File(fullSavePath + "/" + temp.getSourceCodePath());
                        sourceCodeFile.delete();

                        //add new file
                        String sourceCodeName = sourceCode.get(0).getName();
                        sourceCode.get(0).write(new File(fullSavePath + "/" + sourceCodeName));
                        temp.setSourceCodePath(sourceCodeName);
                    } catch (Exception ex) {
                        Logger.getLogger(SellerController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

            temp.setName(name);
            temp.setCategoryId(cateId);
            temp.setDescription(description);
            temp.setHostUrl(hostURL);
            temp.setPrice(price);
            temp.setLastModifiedDate(new Date(System.currentTimeMillis()));
            tempManager.updateTemplate(temp);

            
            response.sendRedirect(request.getContextPath() + "/Seller/dashboard?pageNo=" + pageNo);
        } 
        else if ("/remove".equals(path)) {
            int templateId = Integer.parseInt(request.getParameter("id"));
            int pageNo = Integer.parseInt(request.getParameter("pageNo"));
            Template template = tempManager.getTemplateById(templateId);
            //delete  images
            String appPath = request.getServletContext().getRealPath("");
            appPath = appPath.replace('\\', '/');

            String fullSavePath = null;
            if (appPath.endsWith("/")) {
                fullSavePath = appPath + SAVE_DIRECTORY;
            } else {
                fullSavePath = appPath + "/" + SAVE_DIRECTORY;
            }
            
            ArrayList<TemplateImage> imgList = tempImgManager.getImageList(templateId);
            tempImgManager.deleteTemplateImage(templateId);
            for (TemplateImage img : imgList) {
                File imgFile = new File(fullSavePath + "/" + img.getPath());
                imgFile.delete();
            }
            //delete report
            reportManager.deleteByTemplate(templateId);
            //delete source code
            new File(fullSavePath + "/"  + template.getSourceCodePath()).delete();
            //delete cart
            CartManager cartManager = new CartManager();
            cartManager.deleteCartByTemplate(templateId);
            //delete order history
            new OrderManager().deleteOrderByTemplate(templateId);
            tempManager.deleteTemplateById(templateId);

            response.sendRedirect(request.getContextPath() + "/Seller/dashboard?pageNo=" + pageNo);
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
