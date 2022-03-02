package org.apache.jsp.authentication;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"generator\" content=\"\">\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:200,300,400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- HEADER =============================-->\n");
      out.write("        <header class=\"item header margin-top-0\">\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <nav role=\"navigation\" class=\"navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button data-target=\"#navbar-collapse-02\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\n");
      out.write("                                <i class=\"fa fa-bars\"></i>\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            </button>\n");
      out.write("                            <a href=\"index.jsp\" class=\"navbar-brand brand\"> TemplatesGo </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"navbar-collapse-02\" class=\"collapse navbar-collapse\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li class=\"propClone\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                <li class=\"propClone\"><a href=\"shop.jsp\">Shop</a></li>\n");
      out.write("                                <li class=\"propClone\"><a href=\"product.jsp\">Product</a></li>\n");
      out.write("                                <li class=\"propClone\"><a href=\"checkout.jsp\">Checkout</a></li>\n");
      out.write("                                <li class=\"propClone\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12 text-center\">\n");
      out.write("                            <div class=\"text-pageheader\">\n");
      out.write("                                <div class=\"subtext-image\" data-scrollreveal=\"enter bottom over 1.7s after 0.0s\">\n");
      out.write("                                    Join Our Awesome Marketplace\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- CONTENT =============================-->\n");
      out.write("        <section class=\"item content\">\n");
      out.write("            <div class=\"container toparea\">\n");
      out.write("                <div class=\"underlined-title\">\n");
      out.write("                    <div class=\"editContent\">\n");
      out.write("                        <h1 class=\"text-center latestitems\">Login</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"wow-hr type_short\">\n");
      out.write("                        <span class=\"wow-hr-h\">\n");
      out.write("                            <i class=\"fa fa-star\"></i>\n");
      out.write("                            <i class=\"fa fa-star\"></i>\n");
      out.write("                            <i class=\"fa fa-star\"></i>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("                        <div class=\"done\">\n");
      out.write("                            <div class=\"alert alert-success\">\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"alert\">×</button>\n");
      out.write("                                Your message has been sent. Thank you!\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <form method=\"post\" action=\"contact.php\" id=\"contactform\">\n");
      out.write("                            <div class=\"form\">\n");
      out.write("                                <input type=\"text\" name=\"email\" placeholder=\"Your E-mail Address *\" required>\n");
      out.write("                                <input type=\"password\" name=\"password\" placeholder=\"Your Password *\" minlength=\"8\" required>\n");
      out.write("                                <input type=\"submit\" id=\"submit\" class=\"clearfix btn\" value=\"Login\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- CALL TO ACTION =============================-->\n");
      out.write("    <section class=\"content-block\" style=\"background-color:#00bba7;\">\n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-10 col-sm-offset-1\">\n");
      out.write("                    <div class=\"item\" data-scrollreveal=\"enter top over 0.4s after 0.1s\">\n");
      out.write("                        <h1 class=\"callactiontitle\"> Promote Items Area Give Discount to Buyers <span class=\"callactionbutton\"><i class=\"fa fa-gift\"></i> WOW24TH</span>\n");
      out.write("                        </h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <!-- FOOTER =============================-->\n");
      out.write("    <div class=\"footer text-center\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <p class=\"footernote\">\n");
      out.write("                    Connect with TemplatesGo\n");
      out.write("                </p>\n");
      out.write("                <ul class=\"social-iconsfooter\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-phone\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-pinterest\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("                <p>\n");
      out.write("                    &copy; 2022 TemplatesGo<br/>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- SCRIPTS =============================-->\n");
      out.write("    <script src=\"js/jquery-.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/anim.js\"></script>\n");
      out.write("    <script src=\"js/validate.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
