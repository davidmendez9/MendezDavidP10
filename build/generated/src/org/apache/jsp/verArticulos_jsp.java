package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Principal.ConsultaEquipo;
import java.util.ArrayList;
import Pojos.Jugador;
import Pojos.Equipo;

public final class verArticulos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ver en Artículos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 Equipo e1 = (Equipo) request.getSession().getAttribute("equipo"); 
           ArrayList<Jugador> listaJugadores = (ArrayList<Jugador>) request.getSession().getAttribute("listaJugadores");
        
      out.write("\n");
      out.write("        <h1>Jugadores del ");
      out.print(e1.getNombre_equipo());
      out.write("</h1>\n");
      out.write("        <ul>\n");
      out.write("            ");
 for(Jugador jug : listaJugadores)
            { 
      out.write("\n");
      out.write("            <li>Nombre: ");
      out.print( jug.getNombre_jugador() );
      out.write("</li>\n");
      out.write("            <li>Posición: ");
      out.print( jug.getPosicion() );
      out.write("</li>\n");
      out.write("            <li>Edad: ");
      out.print( jug.getEdad() );
      out.write("</li>\n");
      out.write("            <li>Sueldo: ");
      out.print( jug.getSueldo() );
      out.write("</li>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </body>\n");
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
