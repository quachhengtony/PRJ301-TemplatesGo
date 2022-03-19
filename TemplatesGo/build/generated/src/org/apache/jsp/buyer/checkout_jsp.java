package org.apache.jsp.buyer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/buyer/../layout/navBar.jsp");
    _jspx_dependants.add("/buyer/../layout/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"../css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Roboto:200,300,400,500,600,700\" rel=\"stylesheet\">\r\n");
      out.write("<title>Checkout Page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- HEADER =============================-->\r\n");
      out.write("<header class=\"item header margin-top-0\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t\t\t\t\t<img width=\"25\" height=\"25\" src=\"../images/scorilo2-70x70.jpg\" alt=\"\">\r\n");
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
      out.write("\t\t\t\t\r\n");
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
      out.write("\t\t\t<form id=\"edd_purchase_form\" class=\"edd_form\" action=\"./InsertHis\" method=\"POST\">\r\n");
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
      out.write("                                <fieldset id=\"edd_checkout_user_info\">\r\n");
      out.write("\t\t\t\t\t<legend>Payment Method</legend>\r\n");
      out.write("\t\t\t\t\t<p id=\"edd-email-wrap\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"edd-label\" for=\"edd-email\">\r\n");
      out.write("\t\t\t\t\t\tCard Information <span class=\"edd-required-indicator\">*</span></label>\r\n");
      out.write("\t\t\t\t\t\t<input class=\"edd-input required\" type=\"email\" name=\"edd_email\" placeholder=\"1234 1234 1234 1234\" id=\"edd-email\" value=\"\">\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p id=\"edd-first-name-wrap\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"edd-label\" for=\"edd-first\">\r\n");
      out.write("\t\t\t\t\t\tName on Card <span class=\"edd-required-indicator\">*</span>\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t<input class=\"edd-input required\" type=\"text\" name=\"edd_first\" placeholder=\"Thanh Pham\" id=\"edd-first\" value=\"\" required=\"\">\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p id=\"edd-last-name-wrap\">\r\n");
      out.write("\t\t\t\t\t\t<label class=\"edd-label\" for=\"edd-last\">\r\n");
      out.write("\t\t\t\t\t\tCountry/Region <span class=\"edd-required-indicator\">*</span></label>\r\n");
      out.write("\t\t\t\t\t\t<input class=\"edd-input\" type=\"text\" name=\"edd_last\" id=\"edd-last\" placeholder=\"Viet Nam\" value=\"\">\r\n");
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
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- FOOTER =============================-->\r\n");
      out.write("    <div class=\"footer text-center\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <p class=\"footernote\">\r\n");
      out.write("                    Connect with TemplatesGo\r\n");
      out.write("                </p>\r\n");
      out.write("                <ul class=\"social-iconsfooter\">\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-phone\"></i></a></li>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-pinterest\"></i></a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <p>\r\n");
      out.write("                    &copy; 2022 TemplatesGo<br/>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- SCRIPTS =============================-->\r\n");
      out.write("<script src=\"../js/jquery-.js\"></script>\r\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"../js/anim.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("role");
    _jspx_th_c_set_0.setValue(new String("admin"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role == ''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <nav role=\"navigation\" class=\"navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top\">\r\n");
        out.write("        <div class=\"container\">\r\n");
        out.write("            <div class=\"navbar-header\">\r\n");
        out.write("                <button data-target=\"#navbar-collapse-02\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\r\n");
        out.write("                    <i class=\"fa fa-bars\"></i>\r\n");
        out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
        out.write("                </button>\r\n");
        out.write("                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/home.jsp\" class=\"navbar-brand brand\"> TEMPLATESGO </a>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div id=\"navbar-collapse-02\" class=\"collapse navbar-collapse\">\r\n");
        out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/home.jsp\">Home</a></li>\r\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/authentication/login.jsp\">Log in</a></li>\r\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/authentication/register.jsp\">Sign up</a></li>\r\n");
        out.write("                </ul>\r\n");
        out.write("            </div>\r\n");
        out.write("        </div>\r\n");
        out.write("    </nav>\r\n");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role == 'buyer'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <nav role=\"navigation\" class=\"navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top\">\r\n");
        out.write("        <div class=\"container\">\r\n");
        out.write("            <div class=\"navbar-header\">\r\n");
        out.write("                <button data-target=\"#navbar-collapse-02\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\r\n");
        out.write("                    <i class=\"fa fa-bars\"></i>\r\n");
        out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
        out.write("                </button>\r\n");
        out.write("                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/home.jsp\" class=\"navbar-brand brand\"> TEMPLATESGO </a>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div id=\"navbar-collapse-02\" class=\"collapse navbar-collapse\">\r\n");
        out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/home.jsp\">Home</a></li>\r\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/buyer/cart.jsp\">Cart</a></li>\r\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/buyer/checkout.jsp\">Checkout</a></li>\r\n");
        out.write("                    <li class=\"propClone dropdown\">\r\n");
        out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
        out.write("                            <img style=\"width: 18px;\" class=\"img-circle img-responsive\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/images/avatar.png\" alt=\"\"/>\r\n");
        out.write("                        </a>\r\n");
        out.write("                        <ul class=\"dropdown-menu\">\r\n");
        out.write("                            <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/account.jsp\">Account</a></li>\r\n");
        out.write("                            <li><a href=\"#\">Log out</a></li>\r\n");
        out.write("                        </ul>\r\n");
        out.write("                    </li>\r\n");
        out.write("\r\n");
        out.write("                </ul>\r\n");
        out.write("            </div>\r\n");
        out.write("        </div>\r\n");
        out.write("    </nav>\r\n");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role == 'seller'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <nav role=\"navigation\" class=\"navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top\">\r\n");
        out.write("        <div class=\"container\">\r\n");
        out.write("            <div class=\"navbar-header\">\r\n");
        out.write("                <button data-target=\"#navbar-collapse-02\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\r\n");
        out.write("                    <i class=\"fa fa-bars\"></i>\r\n");
        out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
        out.write("                </button>\r\n");
        out.write("                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/home.jsp\" class=\"navbar-brand brand\"> TEMPLATESGO </a>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div id=\"navbar-collapse-02\" class=\"collapse navbar-collapse\">\r\n");
        out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/seller/sellerDashboard.jsp\">Dashboard</a></li>\r\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/seller/postTemplate.jsp\">Submit Template</a></li>\r\n");
        out.write("                    <li class=\"propClone dropdown\">\r\n");
        out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
        out.write("                            <img style=\"width: 18px;\" class=\"img-circle img-responsive\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/images/avatar.png\" alt=\"\"/>\r\n");
        out.write("                        </a>\r\n");
        out.write("                        <ul class=\"dropdown-menu\">\r\n");
        out.write("                            <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/account.jsp\">Account</a></li>\r\n");
        out.write("                            <li><a href=\"#\">Log out</a></li>\r\n");
        out.write("                        </ul>\r\n");
        out.write("                    </li>\r\n");
        out.write("\r\n");
        out.write("                </ul>\r\n");
        out.write("            </div>\r\n");
        out.write("        </div>\r\n");
        out.write("    </nav>\r\n");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role == 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <nav role=\"navigation\" class=\"navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top\">\r\n");
        out.write("        <div class=\"container\">\r\n");
        out.write("            <div class=\"navbar-header\">\r\n");
        out.write("                <button data-target=\"#navbar-collapse-02\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\r\n");
        out.write("                    <i class=\"fa fa-bars\"></i>\r\n");
        out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
        out.write("                </button>\r\n");
        out.write("                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/home.jsp\" class=\"navbar-brand brand\"> TEMPLATESGO </a>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div id=\"navbar-collapse-02\" class=\"collapse navbar-collapse\">\r\n");
        out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/admin/accountList.jsp\">Account List</a></li>\r\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/admin/reviewReport.jsp\">Review Report</a></li>\r\n");
        out.write("                    <li class=\"propClone\"><a href=\"#\">Category Management</a></li>\r\n");
        out.write("                    <li class=\"propClone dropdown\">\r\n");
        out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
        out.write("                            <img style=\"width: 18px;\" class=\"img-circle img-responsive\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/images/avatar.png\" alt=\"\"/>\r\n");
        out.write("                        </a>\r\n");
        out.write("                        <ul class=\"dropdown-menu\">\r\n");
        out.write("                            <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/account.jsp\">Account</a></li>\r\n");
        out.write("                            <li><a href=\"#\">Log out</a></li>\r\n");
        out.write("                        </ul>\r\n");
        out.write("                    </li>\r\n");
        out.write("\r\n");
        out.write("                </ul>\r\n");
        out.write("            </div>\r\n");
        out.write("        </div>\r\n");
        out.write("    </nav>\r\n");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}
