package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import lg.Datosg;
import lg.Datosp;
import java.util.Iterator;
import java.util.ArrayList;
import lg.Felinos;
import lg.Caninos;
import lg.IFelinos;
import lg.ICaninos;
import lg.Veterinaria;
import lg.Mascota;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Seleccione el tipo de mascota del que quiere consultar informacion</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         \n");
      out.write("        ");
         
        Caninos p = new Caninos(request.getParameter("Nombre"), request.getParameter("Raza"), request.getParameter("Color"), request.getParameter("Edad"), request.getParameter("NivEn"));
        Felinos g = new Felinos(request.getParameter("Nombre"), request.getParameter("Raza"), request.getParameter("Color"), request.getParameter("Edad"), request.getParameter("Tox"));       
        
      out.write("\n");
      out.write("        <button id=\"mp\">Perros</button>\n");
      out.write("        <button id=\"mg\">Gatos</button><br/>\n");
      out.write("        <form action=\"index.html\">\n");
      out.write("            <p id=\"rp\" hidden>");
out.print(p);
      out.write("</p>\n");
      out.write("            <p id=\"rg\" hidden>");
out.print(g);
      out.write("</p>\n");
      out.write("            <input type=\"submit\" value = \"volver\">\n");
      out.write("        </form>        \n");
      out.write("        <p id=\"rp\" hidden>");
out.print(p);
      out.write("</p>\n");
      out.write("        <p id=\"rg\" hidden>");
out.print(g);
      out.write("</p>\n");
      out.write("        <script>            \n");
      out.write("            $(function(){\n");
      out.write("                $('#mp').click(function(){\n");
      out.write("                    $('#rg').hide();\n");
      out.write("                    $('#rp').show();\n");
      out.write("                });                \n");
      out.write("            });\n");
      out.write("            $(function(){\n");
      out.write("                $('#mg').click(function(){\n");
      out.write("                    $('#rg').show();\n");
      out.write("                    $('#rp').hide();\n");
      out.write("                });                \n");
      out.write("            });\n");
      out.write("            </script>\n");
      out.write("    </body>\n");
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
