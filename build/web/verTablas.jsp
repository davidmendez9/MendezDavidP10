<%-- 
    Document   : verTablas
    Created on : 28-feb-2024, 19:30:45
    Author     : David
--%>

<%@page import="Controlador.ConsultaEquipo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Jugador"%>
<%@page import="Modelo.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ver en Tablas</title>
    <link rel="stylesheet" href="CSS/VerTablas.css">
</head>
<body>
    <div class="container">
        <%
            Equipo e1 = (Equipo) request.getSession().getAttribute("equipo"); 
            ArrayList<Jugador> listaJugadores = (ArrayList<Jugador>) request.getSession().getAttribute("listaJugadores");
        %>
        <h1>Datos de los Jugadores del <%= e1.getNombre_equipo() %></h1>
        <div style="overflow-x: auto;">
            <table>
                <tr>
                    <th>Nombre</th>
                    <th>Edad</th>
                    <th>Posición</th>
                    <th>Sueldo</th>
                </tr>
                <% for(Jugador jug : listaJugadores) { %>
                <tr>
                    <td><%= jug.getNombre_jugador() %></td>
                    <td><%= jug.getEdad() %></td>
                    <td><%= jug.getPosicion() %></td>
                    <td><%= jug.getSueldo() %></td>
                </tr>
                <% } %>
            </table>
        </div>
        
        <form action="usuarioValidado.jsp">
            <button type="submit">Volver</button>
        </form>
        <form action="svCerrarSesion">
            <button type="submit" class="volver-btn">Cerrar Sesión</button>
        </form>
    </div>
</body>
</html>
