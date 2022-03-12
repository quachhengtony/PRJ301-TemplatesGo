package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"generator\" content=\"\">\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Roboto:200,300,400,500,600,700\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- HEADER =============================-->\r\n");
      out.write("<header class=\"item header margin-top-0\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\t<nav role=\"navigation\" class=\"navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<button data-target=\"#navbar-collapse-02\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\r\n");
      out.write("\t\t\t<i class=\"fa fa-bars\"></i>\r\n");
      out.write("\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<a href=\"index.jsp\" class=\"navbar-brand brand\"> SCORILO </a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"navbar-collapse-02\" class=\"collapse navbar-collapse\">\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"shop.jsp\">Shop</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"product.jsp\">Product</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"checkout.jsp\">Checkout</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"propClone\"><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-12 text-center\">\r\n");
      out.write("\t\t\t\t<div class=\"text-pageheader\">\r\n");
      out.write("\t\t\t\t\t<div class=\"subtext-image\" data-scrollreveal=\"enter bottom over 1.7s after 0.0s\">\r\n");
      out.write("\t\t\t\t\t\t Checkout\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<!-- CONTENT =============================-->\r\n");
      out.write("<section class=\"item content\">\r\n");
      out.write("<div class=\"container toparea\">\r\n");
      out.write("\t<div class=\"underlined-title\">\r\n");
      out.write("\t\t<div class=\"editContent\">\r\n");
      out.write("\t\t\t<h1 class=\"text-center latestitems\">MAKE PAYMENT</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"wow-hr type_short\">\r\n");
      out.write("\t\t\t<span class=\"wow-hr-h\">\r\n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i>\r\n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i>\r\n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"edd_checkout_wrap\" class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("\t\t<form id=\"edd_checkout_cart_form\" method=\"post\">\r\n");
      out.write("\t\t\t<div id=\"edd_checkout_cart_wrap\">\r\n");
      out.write("\t\t\t\t<table id=\"edd_checkout_cart\" class=\"ajaxed\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr class=\"edd_cart_header_row\">\r\n");
      out.write("\t\t\t\t\t<th class=\"edd_cart_item_name\">\r\n");
      out.write("\t\t\t\t\t\t Item Name\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"edd_cart_item_price\">\r\n");
      out.write("\t\t\t\t\t\t Item Price\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"edd_cart_actions\">\r\n");
      out.write("\t\t\t\t\t\t Actions\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t<tr class=\"edd_cart_item\" id=\"edd_cart_item_0_25\" data-download-id=\"25\">\r\n");
      out.write("\t\t\t\t\t<td class=\"edd_cart_item_name\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"edd_cart_item_image\">\r\n");
      out.write("\t\t\t\t\t\t\t<img width=\"25\" height=\"25\" src=\"images/scorilo2-70x70.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"edd_checkout_cart_item_title\">Audio Item - Single License</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"edd_cart_item_price\">\r\n");
      out.write("\t\t\t\t\t\t $11.99\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"edd_cart_actions\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"edd_cart_remove_item_btn\" href=\"#\">Remove</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t<tfoot>\r\n");
      out.write("\t\t\t\t<tr class=\"edd_cart_footer_row\">\r\n");
      out.write("\t\t\t\t\t<th colspan=\"5\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"edd-cart-saving-button edd-submit button \" id=\"edd-save-cart-button\" href=\"#\">Save Cart</a>\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"edd_cart_footer_row edd_cart_discount_row\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t<th colspan=\"5\" class=\"edd_cart_discount\">\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"edd_cart_footer_row\">\r\n");
      out.write("\t\t\t\t\t<th colspan=\"5\" class=\"edd_cart_total\">\r\n");
      out.write("\t\t\t\t\t\t Total: <span class=\"edd_cart_amount\" data-subtotal=\"11.99\" data-total=\"11.99\">$11.99</span>\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tfoot>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<div id=\"edd_checkout_form_wrap\" class=\"edd_clearfix\">\r\n");
      out.write("\t\t\t<form id=\"edd_purchase_form\" class=\"edd_form\" action=\"#\" method=\"POST\">\r\n");
      out.write("\t\t\t\t<fieldset id=\"edd_checkout_user_info\">\r\n");
      out.write("\t\t\t\t\t<legend>Personal Info</legend>\r\n");
      out.write("\t\t\t\t\t<p id=\"edd-email-wrap\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"edd-label\" for=\"edd-email\">\r\n");
      out.write("\t\t\t\t\t\tEmail Address <span class=\"edd-required-indicator\">*</span></label>\r\n");
      out.write("\t\t\t\t\t\t<input class=\"edd-input required\" type=\"email\" name=\"edd_email\" placeholder=\"Email address\" id=\"edd-email\" value=\"\">\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p id=\"edd-first-name-wrap\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"edd-label\" for=\"edd-first\">\r\n");
      out.write("\t\t\t\t\t\tFirst Name <span class=\"edd-required-indicator\">*</span>\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t<input class=\"edd-input required\" type=\"text\" name=\"edd_first\" placeholder=\"First name\" id=\"edd-first\" value=\"\" required=\"\">\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p id=\"edd-last-name-wrap\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"edd-label\" for=\"edd-last\">\r\n");
      out.write("\t\t\t\t\t\tLast Name </label>\r\n");
      out.write("\t\t\t\t\t\t<input class=\"edd-input\" type=\"text\" name=\"edd_last\" id=\"edd-last\" placeholder=\"Last name\" value=\"\">\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t<fieldset id=\"edd_purchase_submit\">\r\n");
      out.write("\t\t\t\t\t<p id=\"edd_final_total_wrap\">\r\n");
      out.write("\t\t\t\t\t\t<strong>Purchase Total:</strong>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"edd_cart_amount\" data-subtotal=\"11.99\" data-total=\"11.99\">$11.99</span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"edd_action\" value=\"purchase\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"edd-gateway\" value=\"manual\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"edd-submit button\" id=\"edd-purchase-button\" name=\"edd-purchase\" value=\"Purchase\">\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!-- CALL TO ACTION =============================-->\r\n");
      out.write("<section class=\"content-block\" style=\"background-color:#00bba7;\">\r\n");
      out.write("<div class=\"container text-center\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-sm-10 col-sm-offset-1\">\r\n");
      out.write("\t\t\t<div class=\"item\" data-scrollreveal=\"enter top over 0.4s after 0.1s\">\r\n");
      out.write("\t\t\t\t<h1 class=\"callactiontitle\"> Promote Items Area Give Discount to Buyers <span class=\"callactionbutton\"><i class=\"fa fa-gift\"></i> WOW24TH</span>\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<!-- FOOTER =============================-->\r\n");
      out.write("<div class=\"footer text-center\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<p class=\"footernote\">\r\n");
      out.write("\t\t\t\t Connect with Scorilo\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<ul class=\"social-iconsfooter\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-phone\"></i></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-pinterest\"></i></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t &copy; 2017 Your Website Name<br/>\r\n");
      out.write("\t\t\t\tScorilo - Free template by <a href=\"https://www.wowthemes.net/\">WowThemesNet</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- SCRIPTS =============================-->\r\n");
      out.write("<script src=\"js/jquery-.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/anim.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
