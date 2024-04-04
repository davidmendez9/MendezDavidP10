<%-- 
    Document   : verArticulos
    Created on : 28-feb-2024, 18:58:54
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
    <title>Ver en Artículos</title>
    <link rel="stylesheet" href="CSS/VerArticulos.css">
</head>
<body>
    <div class="container">
        <%
            Equipo e1 = (Equipo) request.getSession().getAttribute("equipo"); 
            ArrayList<Jugador> listaJugadores = (ArrayList<Jugador>) request.getSession().getAttribute("listaJugadores");
        %>
        <h1>Jugadores del <%= e1.getNombre_equipo() %></h1>
        <div class="jugadores-container">
            <% for(int i = 0; i < listaJugadores.size(); i++) { %>
                <section class="jugador-box">

                    <img src="Imagenes/<%= listaJugadores.get(i).getImagen() %>" alt="Imagen del jugador" class="jugador-img">
                    <article class="jugador-info">
                        <h2 class="jugador-nombre"><%= listaJugadores.get(i).getNombre_jugador() %></h2>
                        <p class="jugador-posicion">Posición: <%= listaJugadores.get(i).getPosicion() %></p>
                        <a href="detalle.jsp?posicion=<%= i %>" class="enlace-detalle">Detalle</a>
                    </article>
                </section>
            <% } %>
        </div>
        <form action="usuarioValidado.jsp">
            <button type="submit" class="volver-btn">Volver</button>
        </form>
        <form action="svCerrarSesion">
            <button type="submit" class="volver-btn">Cerrar Sesión</button>
        </form>
    </div>
</body>
</html>
