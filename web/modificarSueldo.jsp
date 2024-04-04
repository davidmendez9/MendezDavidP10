<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Jugador"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Modificar Sueldo</title>
    <link rel="stylesheet" href="CSS/ModificarSueldo.css">
</head>
<body>
    <div class="container">
        <%
            ArrayList<Jugador> listaJugadores = (ArrayList<Jugador>) request.getSession().getAttribute("listaJugadores");
            int posicion = Integer.parseInt(request.getParameter("posicion"));
            int idJugador = Integer.parseInt(request.getParameter("idJugador"));
        %>
        <h1>Modificación del sueldo de <%= listaJugadores.get(posicion).getNombre_jugador() %></h1>
        <h3>Sueldo actual: <%= listaJugadores.get(posicion).getSueldo() %> euros</h3>
        <h3>Nuevo sueldo: </h3>
        <form action="SvActualizarSueldo" method="post">
            <input type="hidden" name="idJugador" value="<%= idJugador %>">
            <input type="number" name="nuevoSueldo" placeholder="Nuevo sueldo" required>
            <br>
            <button type="submit">Aceptar</button>
        </form>
        <form action="detalle.jsp">
            <input type="hidden" name="posicion" value="<%= posicion %>">
            <button type="submit" class="volver-button">Volver</button>
        </form>
    </div>
</body>
</html>
