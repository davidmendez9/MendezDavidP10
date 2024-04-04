/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author David
 */
public class Equipo {
    
    int codigo_equipo;
    String nombre_equipo;
    String usuario;
    String contrasenia;
    double sueldo_total;
    Date fecha_fundacion;
    String imagen;

    public Equipo(int codigo_equipo, String nombre_equipo, String usuario, String contrasenia, double sueldo_total, Date fecha_fundacion, String imagen) {
        this.codigo_equipo = codigo_equipo;
        this.nombre_equipo = nombre_equipo;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.sueldo_total = sueldo_total;
        this.fecha_fundacion = fecha_fundacion;
        this.imagen = imagen;
    }

    
    
    public int getCodigo_equipo() {
        return codigo_equipo;
    }

    public void setCodigo_equipo(int codigo_equipo) {
        this.codigo_equipo = codigo_equipo;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public double getSueldo_total() {
        return sueldo_total;
    }

    public void setSueldo_total(double sueldo_total) {
        this.sueldo_total = sueldo_total;
    }

    public Date getFecha_fundacion() {
        return fecha_fundacion;
    }

    public void setFecha_fundacion(Date fecha_fundacion) {
        this.fecha_fundacion = fecha_fundacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
}
