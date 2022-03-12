package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class account_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/user/../layout/navBar.jsp");
    _jspx_dependants.add("/user/../layout/footer.jsp");
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
      out.write("        <title>Account</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <!-- HEADER =============================-->\r\n");
      out.write("        <header class=\"item header margin-top-0\">\r\n");
      out.write("            <div class=\"wrapper\">\r\n");
      out.write("                ");
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-12 text-center\">\r\n");
      out.write("                            <div class=\"text-pageheader\">\r\n");
      out.write("                                <div class=\"subtext-image\" data-scrollreveal=\"enter bottom over 1.7s after 0.0s\">\r\n");
      out.write("                                    Account\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- CONTENT =============================-->\r\n");
      out.write("        <section class=\"item content\">\r\n");
      out.write("            <div class=\"container toparea\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-8 col-lg-offset-2\">\r\n");
      out.write("                        <div class=\"done\">\r\n");
      out.write("                            <div class=\"alert alert-success\">\r\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"alert\">×</button>\r\n");
      out.write("                                Your message has been sent. Thank you!\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"alert\">\r\n");
      out.write("                            <div class=\"slide-text\">\r\n");
      out.write("                                <img src=\"http://wowthemes.net/demo/salique/salique-boxed/images/temp/avatar2.png\" alt=\"Avatar\" onclick=\"handleTriggerAvatarUpload()\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <form method=\"post\" action=\"contact.php\" id=\"contactform\">\r\n");
      out.write("                            <div class=\"form\">\r\n");
      out.write("                                <input type=\"file\" id=\"avatarImage\" name=\"avatarImage\" accept=\"image/*\" style=\"display:none\">\r\n");
      out.write("                                <input type=\"text\" name=\"username\" placeholder=\"Your Username *\" required>\r\n");
      out.write("                                <input type=\"text\" name=\"firstName\" placeholder=\"Your First Name *\" required>\r\n");
      out.write("                                <input type=\"text\" name=\"lastName\" placeholder=\"Your Last Name *\" required>\r\n");
      out.write("                                <input type=\"text\" name=\"email\" placeholder=\"Your E-mail Address *\" required>\r\n");
      out.write("                                <input type=\"password\" name=\"password\" placeholder=\"Your Password *\" minlength=\"8\" required>\r\n");
      out.write("                                <label for=\"role\">Register as a:</label>\r\n");
      out.write("                                <select name=\"role\" id=\"role\">\r\n");
      out.write("                                    <option value=\"buyer\">Buyer</option>\r\n");
      out.write("                                    <option value=\"seller\">Seller</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <input type=\"submit\" id=\"submit\" class=\"clearfix btn\" value=\"Update\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- FOOTER =============================-->\n");
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
      out.write("    </div>");
      out.write("\r\n");
      out.write("    <!-- SCRIPTS =============================-->\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function handleTriggerAvatarUpload() {\r\n");
      out.write("            document.getElementById(\"avatarImage\").click();\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/avatarImageUpload.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery-.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/anim.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/validate.js\"></script>\r\n");
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
    _jspx_th_c_set_0.setValue(new String(""));
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
        out.write("\n");
        out.write("    <nav role=\"navigation\" class=\"navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top\">\n");
        out.write("        <div class=\"container\">\n");
        out.write("            <div class=\"navbar-header\">\n");
        out.write("                <button data-target=\"#navbar-collapse-02\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\n");
        out.write("                    <i class=\"fa fa-bars\"></i>\n");
        out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
        out.write("                </button>\n");
        out.write("                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/home.jsp\" class=\"navbar-brand brand\"> TEMPLATESGO </a>\n");
        out.write("            </div>\n");
        out.write("            <div id=\"navbar-collapse-02\" class=\"collapse navbar-collapse\">\n");
        out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/home.jsp\">Home</a></li>\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/authentication/login.jsp\">Log in</a></li>\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/authentication/register.jsp\">Sign up</a></li>\n");
        out.write("                </ul>\n");
        out.write("            </div>\n");
        out.write("        </div>\n");
        out.write("    </nav>\n");
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
        out.write("\n");
        out.write("    <nav role=\"navigation\" class=\"navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top\">\n");
        out.write("        <div class=\"container\">\n");
        out.write("            <div class=\"navbar-header\">\n");
        out.write("                <button data-target=\"#navbar-collapse-02\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\n");
        out.write("                    <i class=\"fa fa-bars\"></i>\n");
        out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
        out.write("                </button>\n");
        out.write("                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/home.jsp\" class=\"navbar-brand brand\"> TEMPLATESGO </a>\n");
        out.write("            </div>\n");
        out.write("            <div id=\"navbar-collapse-02\" class=\"collapse navbar-collapse\">\n");
        out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/home.jsp\">Home</a></li>\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/buyer/cart.jsp\">Cart</a></li>\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/buyer/checkout.jsp\">Checkout</a></li>\n");
        out.write("                    <li class=\"propClone dropdown\">\n");
        out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
        out.write("                            <img style=\"width: 18px;\" class=\"img-circle img-responsive\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/images/avatar.png\" alt=\"\"/>\n");
        out.write("                        </a>\n");
        out.write("                        <ul class=\"dropdown-menu\">\n");
        out.write("                            <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/account.jsp\">Account</a></li>\n");
        out.write("                            <li><a href=\"#\">Log out</a></li>\n");
        out.write("                        </ul>\n");
        out.write("                    </li>\n");
        out.write("\n");
        out.write("                </ul>\n");
        out.write("            </div>\n");
        out.write("        </div>\n");
        out.write("    </nav>\n");
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
        out.write("\n");
        out.write("    <nav role=\"navigation\" class=\"navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top\">\n");
        out.write("        <div class=\"container\">\n");
        out.write("            <div class=\"navbar-header\">\n");
        out.write("                <button data-target=\"#navbar-collapse-02\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\n");
        out.write("                    <i class=\"fa fa-bars\"></i>\n");
        out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
        out.write("                </button>\n");
        out.write("                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/home.jsp\" class=\"navbar-brand brand\"> TEMPLATESGO </a>\n");
        out.write("            </div>\n");
        out.write("            <div id=\"navbar-collapse-02\" class=\"collapse navbar-collapse\">\n");
        out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/seller/sellerDashboard.jsp\">Dashboard</a></li>\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/seller/postTemplate.jsp\">Submit Template</a></li>\n");
        out.write("                    <li class=\"propClone dropdown\">\n");
        out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
        out.write("                            <img style=\"width: 18px;\" class=\"img-circle img-responsive\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/images/avatar.png\" alt=\"\"/>\n");
        out.write("                        </a>\n");
        out.write("                        <ul class=\"dropdown-menu\">\n");
        out.write("                            <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/account.jsp\">Account</a></li>\n");
        out.write("                            <li><a href=\"#\">Log out</a></li>\n");
        out.write("                        </ul>\n");
        out.write("                    </li>\n");
        out.write("\n");
        out.write("                </ul>\n");
        out.write("            </div>\n");
        out.write("        </div>\n");
        out.write("    </nav>\n");
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
        out.write("\n");
        out.write("    <nav role=\"navigation\" class=\"navbar navbar-white navbar-embossed navbar-lg navbar-fixed-top\">\n");
        out.write("        <div class=\"container\">\n");
        out.write("            <div class=\"navbar-header\">\n");
        out.write("                <button data-target=\"#navbar-collapse-02\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\n");
        out.write("                    <i class=\"fa fa-bars\"></i>\n");
        out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
        out.write("                </button>\n");
        out.write("                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/home.jsp\" class=\"navbar-brand brand\"> TEMPLATESGO </a>\n");
        out.write("            </div>\n");
        out.write("            <div id=\"navbar-collapse-02\" class=\"collapse navbar-collapse\">\n");
        out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/admin/accountList.jsp\">Account List</a></li>\n");
        out.write("                    <li class=\"propClone\"><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/admin/reviewReport.jsp\">Review Report</a></li>\n");
        out.write("                    <li class=\"propClone\"><a href=\"#\">Category Management</a></li>\n");
        out.write("                    <li class=\"propClone dropdown\">\n");
        out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
        out.write("                            <img style=\"width: 18px;\" class=\"img-circle img-responsive\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/images/avatar.png\" alt=\"\"/>\n");
        out.write("                        </a>\n");
        out.write("                        <ul class=\"dropdown-menu\">\n");
        out.write("                            <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/user/account.jsp\">Account</a></li>\n");
        out.write("                            <li><a href=\"#\">Log out</a></li>\n");
        out.write("                        </ul>\n");
        out.write("                    </li>\n");
        out.write("\n");
        out.write("                </ul>\n");
        out.write("            </div>\n");
        out.write("        </div>\n");
        out.write("    </nav>\n");
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
