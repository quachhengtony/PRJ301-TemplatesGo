/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dbmanager.CartManager;
import dbmanager.CategoryManager;
import dbmanager.ReportManager;
import dbmanager.TemplateManager;
import dbmanager.UserManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Cart;
import models.Template;
import models.User;

/**
 *
 * @author Thanh
 */
public class CartController extends HttpServlet {

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
        
        // addTemplate
        if(path.equals("/add")){
            try {
                HttpSession httpSession = request.getSession();
                User userSession = (User) httpSession.getAttribute("userSession");
                Integer buyerId = userSession.getId();
                String templateId = request.getParameter("templateId");
                
                if (buyerId != null && templateId != null) {
                    CartManager cartManager = new CartManager();
                    boolean isSuccessful = cartManager.insertCartItem(buyerId, Integer.parseInt(templateId));
                    if (isSuccessful) {
                        
                    }
                }
                request.getRequestDispatcher("/buyer/cart.jsp").forward(request, response);
            }catch(Exception e){
                
            }
        }    
        //viewCart
        else if(path.equals("/cart")){
            try {
                HttpSession httpSession = request.getSession();
                User userSession = (User) httpSession.getAttribute("userSession");
                //String buyerId = request.getParameter("buyerId");
                if (userSession == null ) {
                    response.sendRedirect(request.getContextPath() + "/User/login");
                }                    
                CartManager cartManager = new CartManager();
                
                Cart cart = cartManager.getCart(userSession.getId());
                ArrayList <Template> templateList = new ArrayList(); 
                
                for(int id:cart.getTemplateList()){
                    templateList.add(templateManager.getTemplateById(id));
                    
                }
                request.setAttribute("templateList", templateList);
                request.setAttribute("cart", cart);
                request.getRequestDispatcher("/buyer/cart.jsp").forward(request, response);
            } catch(Exception e){
                
            }
        }
        //removeTemplate
        else if(path.equals("/remove")){
            try{
                HttpSession httpSession = request.getSession();
                User userSession = (User) httpSession.getAttribute("userSession");
                Integer buyerId = userSession.getId();
                Integer templateId = new Integer(request.getParameter("templateId"));
                CartManager manager = new CartManager();
                boolean remove = manager.deleteCartItem(buyerId,templateId);

                request.setAttribute("temp-remove", remove);
                request.getRequestDispatcher("/buyer/cart.jsp").forward(request, response);
            }catch(Exception e){
                
            }               
        }
        //checkout?buyerId=2
        else if(path.equals("/checkout")){
            try{
                HttpSession httpSession = request.getSession();
                User userSession = (User) httpSession.getAttribute("userSession");
                Integer buyerId = userSession.getId();
                
                CartManager manager = new CartManager();
                Cart cart = manager.getCart(buyerId);
                ArrayList <Template> templateList = new ArrayList(); 
                
                for(int id:cart.getTemplateList()){
                    templateList.add(templateManager.getTemplateById(id));
                    
                }
                request.setAttribute("templateList", templateList);
                request.setAttribute("cart", cart);
                request.getRequestDispatcher("/buyer/checkout.jsp").forward(request, response);
            }catch(Exception e){
                
            }
        }    
        //purchase
        else if(path.equals("/purchase")){
            try{
                HttpSession httpSession = request.getSession();
                User userSession = (User) httpSession.getAttribute("userSession");
                Integer buyerId = userSession.getId();
                
                CartManager manager = new CartManager();
                boolean cart = manager.deleteCart(buyerId);

                request.setAttribute("purchase", cart);             
                response.sendRedirect(request.getContextPath()+"/User/login");
            }catch(Exception e){
                
            }
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
