package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Pojos.Jugador;

public final class detalle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Detalle</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f0f0f0;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            max-width: 800px;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            background-color: #fff;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        img {\n");
      out.write("            max-width: 100%;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        ul {\n");
      out.write("            list-style: none;\n");
      out.write("            padding: 0;\n");
      out.write("            margin: 0;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        li {\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .volver-button {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: #fff;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .volver-button:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("        .jugador-img {\n");
      out.write("            width: 200px; /* Establece el ancho deseado */\n");
      out.write("            height: auto; /* Mantén la proporción de la imagen */\n");
      out.write("            border-radius: 8px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        ");

            ArrayList<Jugador> listaJugadores = (ArrayList<Jugador>) request.getSession().getAttribute("listaJugadores");
            int posicion = Integer.parseInt(request.getParameter("posicion"));
        
      out.write("\n");
      out.write("        <h1>Información sobre ");
      out.print( listaJugadores.get(posicion).getNombre_jugador() );
      out.write("</h1>\n");
      out.write("        <img src=\"Imagenes/");
      out.print( listaJugadores.get(posicion).getImagen() );
      out.write("\" alt=\"Imagen del jugador\" class=\"jugador-img\">\n");
      out.write("        <ul>\n");
      out.write("            <li>Nombre: ");
      out.print( listaJugadores.get(posicion).getNombre_jugador() );
      out.write("</li>\n");
      out.write("            <li>Edad: ");
      out.print( listaJugadores.get(posicion).getEdad() );
      out.write("</li>\n");
      out.write("            <li>Posición: ");
      out.print( listaJugadores.get(posicion).getPosicion() );
      out.write("</li>\n");
      out.write("            <li>Sueldo: ");
      out.print( listaJugadores.get(posicion).getSueldo() );
      out.write("\n");
      out.write("                <form action=\"modificarSueldo.jsp\" method=\"get\">\n");
      out.write("                    <input type=\"hidden\" name=\"posicion\" value=\"");
      out.print( posicion );
      out.write("\">\n");
      out.write("                    <button type=\"submit\">Modificar</button>\n");
      out.write("                </form>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <form action=\"verArticulos.jsp\">\n");
      out.write("            <button type=\"submit\" class=\"volver-button\">Volver</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
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
