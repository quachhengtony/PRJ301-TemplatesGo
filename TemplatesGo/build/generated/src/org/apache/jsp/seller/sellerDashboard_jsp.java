package org.apache.jsp.seller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sellerDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta name=\"generator\" content=\"\">\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:200,300,400,500,600,700\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <!-- HEADER =============================-->\r\n");
      out.write("        <header class=\"item header margin-top-0\">\r\n");
      out.write("            <div class=\"wrapper\">\r\n");
      out.write("                <nav role=\"navigation\" class=\"navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"navbar-header\">\r\n");
      out.write("                            <button data-target=\"#navbar-collapse-02\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\r\n");
      out.write("                                <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/home/jsp\" class=\"navbar-brand brand\"> templatesgo </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"navbar-collapse-02\" class=\"collapse navbar-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/home.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/seller/postTemplate.jsp\">Submit Template</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/buyer/cart.jsp\">Cart</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/buyer/checkout.jsp\">Checkout</a></li>\r\n");
      out.write("                                <li class=\"propClone dropdown\">\r\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                                        <img style=\"width: 18px;\" class=\"img-circle img-responsive\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/avatar.png\" alt=\"\"/>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/account.jsp\">Account</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Log out</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                \r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12 text-center\">\r\n");
      out.write("                            <div class=\"text-pageheader\">\r\n");
      out.write("                                <div class=\"subtext-image\" data-scrollreveal=\"enter bottom over 1.7s after 0.0s\">\r\n");
      out.write("                                    Dashboard Seller\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <!-- CONTENT =============================-->\r\n");
      out.write("        <section class=\"item content\">\r\n");
      out.write("            <div class=\"container toparea\">\r\n");
      out.write("                <div class=\"underlined-title\">\r\n");
      out.write("                    <div class=\"editContent\">\r\n");
      out.write("                        <h1 class=\"text-center latestitems\">SELLER DASHBOARD</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"wow-hr type_short\">\r\n");
      out.write("                        <span class=\"wow-hr-h\">\r\n");
      out.write("                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                            <i class=\"fa fa-star\"></i>\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div >\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <input type=\"text\" style=\"width: 50%; margin-left: 20%;\"  class=\"searchTerm\" placeholder=\"What are you looking for?\">\r\n");
      out.write("                        <button type=\"submit\" style=\"width: 4%\" class=\"searchButton\">\r\n");
      out.write("                            <i class=\"fa fa-search\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"button\"  style=\"background-color:antiquewhite; border-color:blue; color:black\" > SORT !</button>\r\n");
      out.write("                <div id=\"edd_checkout_wrap\" class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("                    <form id=\"edd_checkout_cart_form\" method=\"post\">\r\n");
      out.write("                        <div id=\"edd_checkout_cart_wrap\">\r\n");
      out.write("                            <table id=\"edd_checkout_cart\" class=\"ajaxed\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr class=\"edd_cart_header_row\">\r\n");
      out.write("                                        <th class=\"edd_cart_item_name\">\r\n");
      out.write("                                            Item Name\r\n");
      out.write("                                        </th>\r\n");
      out.write("                                        <th class=\"edd_cart_item_price\">\r\n");
      out.write("                                            Item Info\r\n");
      out.write("                                        </th>\r\n");
      out.write("                                        <th class=\"edd_cart_actions\">\r\n");
      out.write("                                            <br> Actions</br>\r\n");
      out.write("                                        </th>\r\n");
      out.write("\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    <tr class=\"edd_cart_item\" id=\"edd_cart_item_0_25\" data-download-id=\"25\">\r\n");
      out.write("                                        <td class=\"edd_cart_item_name\">\r\n");
      out.write("                                            <div class=\"edd_cart_item_image\">\r\n");
      out.write("                                                <img width=\"25\" height=\"25\" src=\"images/scorilo2-70x70.jpg\" alt=\"\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <span class=\"edd_checkout_cart_item_title\">Name: </span>\r\n");
      out.write("                                            <span class=\"edd_checkout_cart_item_title\">Category :  </span>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td class=\"edd_cart_item_price\">\r\n");
      out.write("                                            <br>Price : $11.99 </br>   \r\n");
      out.write("                                            <br> Sold : 99 </br> \r\n");
      out.write("                                            <br> Date Created: </br> \r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td class=\"edd_cart_actions\">\r\n");
      out.write("                                            <br><a class=\"edd_cart_remove_item_btn\" href=\"/Remove\">Remove</a></br> \r\n");
      out.write("                                            <br><a class=\"edd_cart_remove_item_btn\" href=\"/Update\">Update</a></br> \r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                                <tfoot>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </tfoot>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <!-- CALL TO ACTION =============================-->\r\n");
      out.write("        <section class=\"content-block\" style=\"background-color:#00bba7;\">\r\n");
      out.write("            <div class=\"container text-center\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-10 col-sm-offset-1\">\r\n");
      out.write("                        <div class=\"item\" data-scrollreveal=\"enter top over 0.4s after 0.1s\">\r\n");
      out.write("                            <h1 class=\"callactiontitle\"> Promote Items Area Give Discount to Buyers <span class=\"callactionbutton\"><i class=\"fa fa-gift\"></i> WOW24TH</span>\r\n");
      out.write("                            </h1>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <!-- FOOTER =============================-->\r\n");
      out.write("        <div class=\"footer text-center\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <p class=\"footernote\">\r\n");
      out.write("                        Connect with Scorilo\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <ul class=\"social-iconsfooter\">\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-phone\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-pinterest\"></i></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        &copy; 2017 Your Website Name<br/>\r\n");
      out.write("                        Scorilo - Free template by <a href=\"https://www.wowthemes.net/\">WowThemesNet</a>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- SCRIPTS =============================-->\r\n");
      out.write("        <script src=\"../js/jquery-.js\"></script>\r\n");
      out.write("        <script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"../js/anim.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
