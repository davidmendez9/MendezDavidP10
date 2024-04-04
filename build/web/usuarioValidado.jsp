<%@page import="Modelo.Equipo"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>P�gina de Inicio</title>
    <link rel="stylesheet" href="CSS/UsuarioValidado.css">
</head>
<body>
    <div class="container">
        <% Equipo e1 = (Equipo) request.getSession().getAttribute("equipo"); %>
        <h1>P�gina de Inicio</h1>
        <h2>Te damos la bienvenida, <%= e1.getNombre_equipo() %>  </h2>
        <img src="Imagenes/<%= e1.getImagen() %>" class="equipo-logo">
        <h3>Datos del club</h3>
        <ul class="datos-lista">
            <li><strong>Sueldo Total del Equipo:</strong> <%= e1.getSueldo_total() %> euros</li>
            <li><strong>Fecha de fundaci�n:</strong> <%= e1.getFecha_fundacion() %></li>
        </ul>
        <h3>�Qu� quieres hacer?</h3>
        <ul>
            <li><a href="SvArticulos">Ver en art�culos</a></li>
            <li><a href="verTablas.jsp">Ver en tablas</a></li>
            <form action="svCerrarSesion">
                <button type="submit">Cerrar Sesi�n</button>
            </form>
        </ul>
    </div>
</body>
</html>
