/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dbmanager.OrderManager;
import dbmanager.TemplateManager;
import dbmanager.UserManager;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import models.Template;
import models.User;

/**
 *
 * @author Tony Quach
 */
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
        maxFileSize = 1024 * 1024 * 10, // 10MB
        maxRequestSize = 1024 * 1024 * 50) // 50MB
public class UserController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    public static final String SAVE_DIRECTORY = "avatars";

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

        if (path.equals("/register")) {
            try {
                HashMap<String, String> errors = new HashMap<String, String>();
                boolean hasError = false;

                String username = request.getParameter("username");
                String email = request.getParameter("email");
                String firstName = request.getParameter("firstName");
                String lastName = request.getParameter("lastName");
                String password = request.getParameter("password");
                String confirmPassword = request.getParameter("confirmPassword");
                String role = request.getParameter("role");

                if (username != null && email != null && firstName != null && lastName != null && password != null && confirmPassword != null && role != null) {
                    if (password.equals(confirmPassword) == false) {
                        errors.put("password", "Password and Confirm Password do not match.");
                        hasError = true;
                        request.setAttribute("errors", errors);
                        request.getRequestDispatcher("/authentication/register.jsp").forward(request, response);
                    }

                    if (password.isEmpty() || password.length() < 8) {
                        errors.put("password", "Password must be atleast 8 characters.");
                        hasError = true;
                        request.setAttribute("errors", errors);
                        request.getRequestDispatcher("/authentication/register.jsp").forward(request, response);
                    }

                    Pattern usernamePattern = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
                    if (usernamePattern.matcher(username).find()) {
                        errors.put("username", "Username cannot contains special characters.");
                        hasError = true;
                        request.setAttribute("errors", errors);
                        request.getRequestDispatcher("/authentication/register.jsp").forward(request, response);
                    }

                    Pattern emailPattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
                    if (!emailPattern.matcher(email).matches()) {
                        errors.put("email", "Email must be in valid format.");
                        hasError = true;
                        request.setAttribute("errors", errors);
                        request.getRequestDispatcher("/authentication/register.jsp").forward(request, response);
                    }

                    if (hasError == false) {
                        UserManager userManager = new UserManager();
                        User user = new User(username.trim(), firstName.trim(), lastName.trim(), email.trim(), password.trim(), "TemplatesGo_DefaultAvatar.jpg", role, date, false, null);

                        boolean addUserSuccess = userManager.addUser(user);
                        if (addUserSuccess) {
                            response.sendRedirect(request.getContextPath() + "/User/login");
                        }
                    }
                }
                request.getRequestDispatcher("/authentication/register.jsp").forward(request, response);
            } catch (Exception e) {
                System.out.println("\n>>> " + e);
            }

        }

        if (path.equals("/login")) {
            try {
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                if (email != null && password != null) {
                    UserManager userManager = new UserManager();
                    User user = userManager.getUser(email.trim(), password.trim());
                    if (user == null) {
                        request.setAttribute("loginErrorMsg", "Invalid username or password");
                    } else {
                        if (user.isBanStatus() && user.getUnbanDate().before(new Date(System.currentTimeMillis()))) {
                            userManager.unbanUser(user.getId());
                            user = userManager.getUser(email.trim(), password.trim());
                        }
                        if (user.isBanStatus() == false) {
                            HttpSession httpSession = request.getSession(true);
                            httpSession.setAttribute("userSession", user);
                            response.sendRedirect(request.getContextPath() + "/Template/listing");
                        } else {
                            request.setAttribute("loginErrorMsg", "Your account is banned till " + user.getUnbanDate());
                        }
                    }
                    
                } 
                request.getRequestDispatcher("/authentication/login.jsp").forward(request, response);
            } catch (Exception e) {
                System.out.println("\n>>> " + e);
            }
        }

        if (path.equals("/logout")) {
            try {
                HttpSession httpSession = request.getSession();
                httpSession.invalidate();
                response.sendRedirect(request.getContextPath() + "/User/login");
            } catch (Exception e) {
                System.out.println("\n>>> " + e);
            }
        }

        if (path.equals("/account")) {
            HttpSession httpSession = request.getSession();
            User userSession = (User) httpSession.getAttribute("userSession");

            if (userSession == null) {
                response.sendRedirect(request.getContextPath() + "/User/login");
                return;
            }

            UserManager userManager = new UserManager();
            User user = userManager.getUser(userSession.getEmail(), userSession.getPassword());
            request.setAttribute("user", user);
            request.getRequestDispatcher("/user/account.jsp").forward(request, response);
        }

        if (path.equals("/update")) {
            try {
                String id = request.getParameter("id");
                String username = request.getParameter("username");
                String firstName = request.getParameter("firstName");
                String lastName = request.getParameter("lastName");
                String password = request.getParameter("password");

                if (id != null && username != null && firstName != null && lastName != null && password != null) {
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
                    for (Part part : request.getParts()) {
                        String fileName = extractFileName(part);

                        if (fileName != null && fileName.length() > 0) {
                            filePath = fullSavePath + File.separator + fileName;
                            part.write(filePath);

                            UserManager userManager = new UserManager();
                            User updateUser = new User(Integer.parseInt(id), username.trim(), firstName.trim(), lastName.trim(), password.trim(), fileName);
                            userManager.updateUser(updateUser);

                            HttpSession httpSession = request.getSession();
                            httpSession.invalidate();
                        }
                    }

                    response.sendRedirect(request.getContextPath() + "/User/login");
                }
            } catch (Exception e) {
                System.out.println("\n>>> " + e);
            }
        }

        if (path.equals("/buyHistory")) {
            HttpSession httpSession = request.getSession();
            User userSession = (User) httpSession.getAttribute("userSession");

            if (userSession == null || !userSession.getRole().equals("buyer")) {
                response.sendRedirect(request.getContextPath() + "/User/login");
                return;
            }

            try {
                UserManager userManager = new UserManager();
                List<Template> templates = userManager.getBuyHistory(userSession.getId());
                if (templates != null) {
                    request.setAttribute("templates", templates);
                    request.getRequestDispatcher("/user/buyHistory.jsp").forward(request, response);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        if (path.equals("/sellHistory")) {
            HttpSession httpSession = request.getSession();
            User userSession = (User) httpSession.getAttribute("userSession");

            if (userSession == null || !userSession.getRole().equals("seller")) {
                response.sendRedirect(request.getContextPath() + "/User/login");
                return;
            }

            try {
                UserManager userManager = new UserManager();
                List<Template> templates = userManager.getSellHistory(userSession.getId());
                if (templates != null) {
                    List<User> buyers = userManager.getSellHistoryBuyers(userSession.getId());
                    if (buyers != null) {
                        request.setAttribute("templates", templates);
                        request.setAttribute("buyers", buyers);
                        request.getRequestDispatcher("/user/sellHistory.jsp").forward(request, response);
                    }
                }
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
