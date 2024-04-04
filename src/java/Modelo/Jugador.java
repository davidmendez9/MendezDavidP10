/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *CREATE TABLE Jugadores (
    id_jugador INT PRIMARY KEY,
    nombre_jugador VARCHAR(100) NOT NULL,
    edad INT,
    posicion VARCHAR(50),
    codigo_equipo INT,
    sueldo FLOAT NOT NULL,
    FOREIGN KEY (codigo_equipo) REFERENCES Equipos(codigo_equipo)
);
 * @author David
 */
public class Jugador {
    
    int id_jugador;
    String nombre_jugador;
    int edad;
    String posicion;
    int codigo_equipo;
    double sueldo;
    String imagen;

    public Jugador(int id_jugador, String nombre_jugador, int edad, String posicion, int codigo_equipo, double sueldo, String imagen) {
        this.id_jugador = id_jugador;
        this.nombre_jugador = nombre_jugador;
        this.edad = edad;
        this.posicion = posicion;
        this.codigo_equipo = codigo_equipo;
        this.sueldo = sueldo;
        this.imagen = imagen;
    }

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
    }

    public String getNombre_jugador() {
        return nombre_jugador;
    }

    public void setNombre_jugador(String nombre_jugador) {
        this.nombre_jugador = nombre_jugador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getCodigo_equipo() {
        return codigo_equipo;
    }

    public void setCodigo_equipo(int codigo_equipo) {
        this.codigo_equipo = codigo_equipo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
}
