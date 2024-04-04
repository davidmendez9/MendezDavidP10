/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Equipo;
import Modelo.Jugador;
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

/**
 *
 * @author David
 */
@WebServlet(name = "SvActualizarSueldo", urlPatterns = {"/SvActualizarSueldo"})
public class SvActualizarSueldo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        int idJugador = Integer.parseInt(request.getParameter("idJugador"));
        double nuevoSueldo = Double.parseDouble(request.getParameter("nuevoSueldo"));
        Equipo e1 = (Equipo) request.getSession().getAttribute("equipo");
        int codigoEquipo = e1.getCodigo_equipo();
        try {
            ConsultaEquipo.ModificarSueldoJugador(idJugador, nuevoSueldo);
            
            response.sendRedirect("SvArticulos");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SvActualizarSueldo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
