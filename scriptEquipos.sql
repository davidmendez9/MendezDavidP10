-- Crear la tabla de equipos
CREATE TABLE Equipos (
    codigo_equipo INT PRIMARY KEY,
    nombre_equipo VARCHAR(100) NOT NULL,
    usuario VARCHAR(50) NOT NULL,
    contrasenia VARCHAR(50) NOT NULL,
    sueldo_total FLOAT NOT NULL,
    fecha_fundacion DATE NOT NULL,
    imagen VARCHAR(255)
);

-- Crear la tabla de jugadores
CREATE TABLE Jugadores (
    id_jugador INT PRIMARY KEY,
    nombre_jugador VARCHAR(100) NOT NULL,
    edad INT,
    posicion VARCHAR(50),
    codigo_equipo INT,
    sueldo FLOAT NOT NULL,
    imagen VARCHAR(255),
    FOREIGN KEY (codigo_equipo) REFERENCES Equipos(codigo_equipo)
);


--Insert de los equipos
INSERT INTO Equipos (codigo_equipo, nombre_equipo, usuario, contrasenia, sueldo_total, fecha_fundacion, imagen) VALUES
(1, 'Sevilla FC', 'usuario_sevilla', 'contrasenia_sevilla', 0, '1890-01-25', 'sevillafc.png'),
(2, 'Real Madrid', 'usuario_madrid', 'contrasenia_madrid', 0, '1902-03-06', 'madrid.png'),
(3, 'FC Barcelona', 'usuario_barcelona', 'contrasenia_barcelona', 0, '1899-11-29', 'barcelona.png');


-- Insertar jugadores del Sevilla FC
INSERT INTO Jugadores (id_jugador, nombre_jugador, edad, posicion, codigo_equipo, sueldo, imagen) VALUES
(1, 'Jesús Navas', 35, 'Centrocampista', 1, 250000, 'Navas.png'),
(2, 'Youssef En-Nesyri', 24, 'Delantero', 1, 416666.67, 'EnNesyri.png'),
(3, 'Diego Carlos', 28, 'Defensa', 1, 166666.67, 'diegocarlos.png'),
(4, 'Lucas Ocampos', 27, 'Delantero', 1, 333333.33, 'Ocampos.png'),
(5, 'Ivan Rakitic', 33, 'Centrocampista', 1, 291666.67, 'rakitic.png'),
(6, 'Joan Jordán', 26, 'Centrocampista', 1, 233333.33, 'Jordan.png'),
(7, 'Bono', 30, 'Portero', 1, 208333.33, 'bono.png'),
(8, 'Jules Koundé', 23, 'Defensa', 1, 266666.67, 'kounde.png'),
(9, 'Suso', 27, 'Delantero', 1, 316666.67, 'Suso.png'),
(10, 'Óscar Rodríguez', 23, 'Centrocampista', 1, 225000, 'oscar.png'),
(11, 'Aleix Vidal', 32, 'Defensa', 1, 216666.67, 'aleix.png');

-- Insertar jugadores del Real Madrid
INSERT INTO Jugadores (id_jugador, nombre_jugador, edad, posicion, codigo_equipo, sueldo, imagen) VALUES
(12, 'Karim Benzema', 34, 'Delantero', 2, 583333.33, 'benzema.png'),
(13, 'Sergio Ramos', 35, 'Defensa', 2, 500000, 'ramos.png'),
(14, 'Luka Modric', 36, 'Centrocampista', 2, 375000, 'modric.png'),
(15, 'Toni Kroos', 32, 'Centrocampista', 2, 416666.67, 'kroos.png'),
(16, 'Raphaël Varane', 28, 'Defensa', 2, 458333.33, 'varane.png'),
(17, 'Casemiro', 29, 'Centrocampista', 2, 400000, 'casemiro.png'),
(18, 'Thibaut Courtois', 29, 'Portero', 2, 500000, 'courtois.png'),
(19, 'Ferland Mendy', 26, 'Defensa', 2, 333333.33, 'mendy.png'),
(20, 'Marco Asensio', 25, 'Delantero', 2, 316666.67, 'asensio.png'),
(21, 'Vinícius Júnior', 21, 'Delantero', 2, 350000, 'vini.png'),
(22, 'Lucas Vázquez', 30, 'Centrocampista', 2, 266666.67, 'lucasvazquez.png');

-- Insertar jugadores del FC Barcelona
INSERT INTO Jugadores (id_jugador, nombre_jugador, edad, posicion, codigo_equipo, sueldo, imagen) VALUES
(23, 'Lionel Messi', 34, 'Delantero', 3, 833333.33, 'messi.png'),
(24, 'Gerard Piqué', 34, 'Defensa', 3, 416666.67, 'pique.png'),
(25, 'Frenkie de Jong', 24, 'Centrocampista', 3, 500000, 'frenkie.png'),
(26, 'Sergio Busquets', 33, 'Centrocampista', 3, 458333.33, 'busquets.png'),
(27, 'Jordi Alba', 32, 'Defensa', 3, 375000, 'jordi.png'),
(28, 'Ansu Fati', 19, 'Delantero', 3, 350000, 'ansu.png'),
(29, 'Antoine Griezmann', 30, 'Delantero', 3, 583333.33, 'griezmann.png'),
(30, 'Pedri', 19, 'Centrocampista', 3, 316666.67, 'pedri.png'),
(31, 'Ousmane Dembélé', 24, 'Delantero', 3, 400000, 'dembele.png'),
(32, 'Ronald Araújo', 22, 'Defensa', 3, 266666.67, 'araujo.png'),
(33, 'Marc-André ter Stegen', 29, 'Portero', 3, 500000, 'terstegen.png');

-- Actualizar el sueldo total de cada equipo
UPDATE Equipos SET sueldo_total = 
(SELECT CAST(SUM(sueldo) AS DECIMAL(10,2)) FROM Jugadores 
WHERE Jugadores.codigo_equipo = Equipos.codigo_equipo) 
WHERE codigo_equipo IN (1, 2, 3);

