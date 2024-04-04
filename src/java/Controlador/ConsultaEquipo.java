/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Equipo;
import Modelo.Jugador;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ConoMaster
 */
public class ConsultaEquipo {

    public ConsultaEquipo(Conexion con) {

    }

    public static Equipo getEquipo(String nombre, String contrasenia) throws SQLException {

        Connection conexion = Conexion.getConnection();
        Statement st = conexion.createStatement();

        ResultSet rs = st.executeQuery("Select CODIGO_EQUIPO, NOMBRE_EQUIPO, USUARIO, CONTRASENIA, SUELDO_TOTAL, FECHA_FUNDACION, IMAGEN from EQUIPOS where usuario = '" + nombre + "'" + " AND contrasenia = '" + contrasenia + "'");

        return recorrer(rs);
    }

    public static Equipo recorrer(ResultSet rs) throws SQLException {
        Equipo user = null;
        while (rs.next()) {

            int id = rs.getInt("CODIGO_EQUIPO");
            String nombreEquipo = rs.getString("NOMBRE_EQUIPO");
            String nombreUsuario = rs.getString("USUARIO");
            String pass = rs.getString("CONTRASENIA");
            Double sueldoTotal = rs.getDouble("SUELDO_TOTAL");
            Date fecha = rs.getDate("FECHA_FUNDACION");
            String foto = rs.getString("IMAGEN");

            user = new Equipo(id, nombreEquipo, nombreUsuario, pass, sueldoTotal, fecha, foto);

            System.out.println("Nombre de usuario: " + nombreUsuario + " " + pass);
        }
        return user;
    }

    public static ArrayList<Equipo> listaEquipos() throws SQLException {
        ArrayList<Equipo> listaEquipos = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement st = conexion.createStatement();

        ResultSet rs = st.executeQuery("Select CODIGO_EQUIPO, NOMBRE_EQUIPO, USUARIO, CONTRASENIA, SUELDO_TOTAL, FECHA_FUNDACION, IMAGEN from EQUIPOS");
        Equipo user;
        while (rs.next()) {

            int id = rs.getInt("CODIGO_EQUIPO");
            String nombreEquipo = rs.getString("NOMBRE_EQUIPO");
            String nombreUsuario = rs.getString("USUARIO");
            String pass = rs.getString("CONTRASENIA");
            Double sueldoTotal = rs.getDouble("SUELDO_TOTAL");
            Date fecha = rs.getDate("FECHA_FUNDACION");
            String foto = rs.getString("IMAGEN");
            user = new Equipo(id, nombreEquipo, nombreUsuario, pass, sueldoTotal, fecha, foto);
            listaEquipos.add(user);
        }
        return listaEquipos;

    }
    
    public static Equipo getEquipoActualizado(int codEquipo) throws SQLException {

        Connection conexion = Conexion.getConnection();
        Statement st = conexion.createStatement();

        ResultSet rs = st.executeQuery("Select CODIGO_EQUIPO, NOMBRE_EQUIPO, USUARIO, CONTRASENIA, SUELDO_TOTAL, FECHA_FUNDACION, IMAGEN from EQUIPOS where CODIGO_EQUIPO = "+codEquipo);

        return recorrer(rs);
    }

    
    public static ArrayList<Jugador> listaJugadores(int codigoEquipo) throws SQLException
    {
        ArrayList<Jugador> listaJugadores = new ArrayList();
        Connection conexion = Conexion.getConnection();
        Statement st = conexion.createStatement();

        ResultSet rs = st.executeQuery("Select ID_JUGADOR, NOMBRE_JUGADOR, EDAD, POSICION, CODIGO_EQUIPO, SUELDO, IMAGEN from JUGADORES where CODIGO_EQUIPO = "+codigoEquipo);
        Jugador user;
        while (rs.next()) {

            int id = rs.getInt("ID_JUGADOR");
            String nombreJugador = rs.getString("NOMBRE_JUGADOR");
            int edad = rs.getInt("EDAD");
            String posicion = rs.getString("POSICION");
            int codEquipo = rs.getInt("CODIGO_EQUIPO");
            double sueldo = rs.getDouble("SUELDO");
            String imagen = rs.getString("IMAGEN");
            user = new Jugador(id, nombreJugador, edad, posicion, codEquipo, sueldo, imagen);
            listaJugadores.add(user);
        }
        
        
        return listaJugadores;
    }
    
    public static void ModificarSueldoJugador(int id_jugador, double nuevoSueldo) throws SQLException
    {
        Connection conexion = null;
        PreparedStatement pst = null;
        Statement st = null;
        
        conexion = Conexion.getConnection();
        st = conexion.createStatement();
        
        String query = "UPDATE jugadores SET sueldo = ? WHERE id_jugador = ?";
        pst = conexion.prepareStatement(query);
        pst.setDouble(1, nuevoSueldo);
        pst.setInt(2, id_jugador);


        pst.executeUpdate();
        actualizarSueldoTotal();
        System.out.println("Sueldo actualizado");
        
        if (pst != null) {
            pst.close();
        }
        if (st != null){
            st.close();
        }
        if (conexion != null) {
            conexion.close();
        }
    }
    
    public static void actualizarSueldoTotal() throws SQLException
    {
        Connection conexion = null;
        PreparedStatement pst = null;
        Statement st = null;
        
        conexion = Conexion.getConnection();
        st = conexion.createStatement();
        
        String query = "UPDATE Equipos SET sueldo_total = (SELECT CAST(SUM(sueldo) AS DECIMAL(10,2)) FROM Jugadores WHERE Jugadores.codigo_equipo = Equipos.codigo_equipo) WHERE codigo_equipo IN (1, 2, 3)";
        pst = conexion.prepareStatement(query);

        pst.executeUpdate();
        
        if (pst != null) {
            pst.close();
        }
        if (st != null){
            st.close();
        }
        if (conexion != null) {
            conexion.close();
        }
    }

}
