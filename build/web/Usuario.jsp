<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Validar Usuario</title>
<link rel="stylesheet" href="CSS/Usuario.css">
</head>
<body>

<div class="container">
    <h3>Validación del Usuario</h3>
    <form action="svUsuario" method="post">
        <label for="usuario">Usuario:</label>
        <input type="text" id="usuario" name="usuario" required><br><br>
        <label for="contrasenia">Contraseña:</label>
        <input type="password" id="contrasenia" name="contrasenia" required><br><br>
        <input type="submit" value="Enviar Datos">
    </form>
</div>

</body>
</html>
