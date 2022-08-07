package org.apache.jsp;

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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("        integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <title>Zarina Tailor & Alteration</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid py-1\" style=\"background-color: #53B0AE;;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12\">\n");
      out.write("                    <br>\n");
      out.write("                    <h1 font size = \"+2\" class=\"text-center\" style=\"color:white;\">ZARINA TAILOR & ALTERATION</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"col-5 offset-1\">\n");
      out.write("                    <img src=\"canopy2.jpg\" alt=\"\" style=\"width:336px;\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid py-4\" style=\"background-color:#34343c;;\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12 text-center\">\n");
      out.write("                    <h2 style=\"color:white;\">LOGIN PAGE</h2></br>\n");
      out.write("                    <form action=\"loginProcess.jsp\" method=\"post\">\n");
      out.write("            \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label style=\"color:white;\"> Username:&nbsp; </label>\n");
      out.write("                        <input type=\"text\" name=\"username\" />\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label style=\"color:white;\"> Password: &nbsp; </label>\n");
      out.write("                        <input type=\"password\" name=\"password\" /><br></br>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group text-center\">\n");
      out.write("                        &nbsp;&nbsp;&nbsp;<button style=\"background-color:#53B0AE;\" type=\"submit\">Submit</button>\n");
      out.write("                        <button style=\"background-color:#53B0AE;\" type=\"reset\">Reset</button>\n");
      out.write("                        \n");
      out.write("                        <p style=\"color:white;\" style=\"text-align: center\">Don't have an account? <a href=\"register.jsp\">Register Here!</p>    \n");
      out.write("                    </div>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Optional JavaScript; choose one of the two! -->\n");
      out.write("\n");
      out.write("    <!-- Option 1: Bootstrap Bundle with Popper -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("        integrity=\"sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    <!-- Option 2: Separate Popper and Bootstrap JS -->\n");
      out.write("    <!--\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js\" integrity=\"sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js\" integrity=\"sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc\" crossorigin=\"anonymous\"></script>\n");
      out.write("    -->\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<div class=\"container-fluid py-1\" style=\"background-color: #53B0AE;\">\n");
      out.write("<div class=\"text-center\">\n");
      out.write("    <h6 style=\"color:white;\">Copyright@ZarinaTailor</h6>");
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
