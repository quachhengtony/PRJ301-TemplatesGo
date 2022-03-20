/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dbmanager.CartManager;
import dbmanager.OrderManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Order;
import models.Template;
import dbmanager.TemplateManager;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import models.User;
import models.Cart;
import dbmanager.OrderManager;
/**
 *
 * @author This PC
 */
public class OrderController extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String path = request.getPathInfo();
        if (path.equals("/insertHis")) {
             boolean check = true;
            try {
                HttpSession httpSession = request.getSession();
                TemplateManager template = new TemplateManager();
                User userSession = (User) httpSession.getAttribute("userSession");
                
                if (userSession == null) {
                    response.sendRedirect(request.getContextPath() + "/User/login");
                }
               

                OrderManager or = new OrderManager();

                CartManager cartManager = new CartManager();
                Cart cart = cartManager.getCart(userSession.getId());
               
                for (int id : cart.getTemplateList()) {
                    
                    long millis = System.currentTimeMillis();
                    java.sql.Date date = new java.sql.Date(millis);
                    check = or.insertOrder(id, template.getTemplateById(id).getSellerId(), userSession.getId(), date);
                }
                if (check != true) {
                    RequestDispatcher rd = request.getRequestDispatcher("/buyer/checkout.jsp");
                    rd.forward(request, response);
                   
                }else{
                    request.getRequestDispatcher("/Cart/purchase").forward(request, response);
                }

            } catch (Exception e) {
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
