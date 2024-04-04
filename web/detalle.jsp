<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Jugador"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Detalle</title>
    <link rel="stylesheet" href="CSS/Detalle.css">
</head>
<body>
    <div class="container">
        <%
            ArrayList<Jugador> listaJugadores = (ArrayList<Jugador>) request.getSession().getAttribute("listaJugadores");
            int posicion = Integer.parseInt(request.getParameter("posicion"));
        %>
        <h1>Información sobre <%= listaJugadores.get(posicion).getNombre_jugador() %></h1>
        <img src="Imagenes/<%= listaJugadores.get(posicion).getImagen() %>" alt="Imagen del jugador" class="jugador-img">
        <ul>
            <li>Nombre: <%= listaJugadores.get(posicion).getNombre_jugador() %></li>
            <li>Edad: <%= listaJugadores.get(posicion).getEdad() %></li>
            <li>Posición: <%= listaJugadores.get(posicion).getPosicion() %></li>
            <li>Sueldo: <%= listaJugadores.get(posicion).getSueldo() %>
                <form action="modificarSueldo.jsp" method="get">
                    <input type="hidden" name="idJugador" value="<%= listaJugadores.get(posicion).getId_jugador() %>">
                    <input type="hidden" name="posicion" value="<%= posicion %>">
                    <button type="submit" class="modificar-button">Modificar</button>
                </form>
            </li>
        </ul>
        <form action="verArticulos.jsp">
            <button type="submit" class="volver-button">Volver</button>
        </form>
    </div>
</body>
</html>
