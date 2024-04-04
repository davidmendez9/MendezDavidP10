package Controlador;

import Modelo.Equipo;
import Modelo.Jugador;
import static Controlador.ConsultaEquipo.listaJugadores;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author David
 */
@WebServlet(name = "svUsuario", urlPatterns = {"/svUsuario"})
public class SvUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String usuario = request.getParameter("usuario");
        String contrasenia = request.getParameter("contrasenia");
        Equipo e1 = null;
        ArrayList<Jugador> listaJugadores = new ArrayList();
        
        try {
            e1 = ConsultaEquipo.getEquipo(usuario, contrasenia);
            
        } catch (SQLException ex) {
            Logger.getLogger(SvUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            if(e1 != null)
            {
                System.out.println("Validado!");
            try {
                listaJugadores = ConsultaEquipo.listaJugadores(e1.getCodigo_equipo());
            } catch (SQLException ex) {
                Logger.getLogger(SvUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
                HttpSession miSesion = request.getSession();
                miSesion.setAttribute("equipo", e1);
                miSesion.setAttribute("listaJugadores", listaJugadores);
                
                response.sendRedirect("usuarioValidado.jsp");
            }
            else
            {
                System.out.println("No validado");
                response.sendRedirect("usuarioNoValidado.jsp");
            }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
