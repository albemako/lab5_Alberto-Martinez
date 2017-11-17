/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_alberto.martinez;

/**
 *
 * @author Alberto
 */
public class Jugador {
   
    public String nombre;
    public double precio;
    public String posicion;
    public boolean disponible;
    public double hablididad;
    public double tecnica;
    public double resistencia;

    public Jugador(String nombre, double precio, String posicion, boolean disponible, double hablididad, double tecnica, double resistencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.posicion = posicion;
        this.disponible = disponible;
        this.hablididad = hablididad;
        this.tecnica = tecnica;
        this.resistencia = resistencia;
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getHablididad() {
        return hablididad;
    }

    public void setHablididad(double hablididad) {
        this.hablididad = hablididad;
    }

    public double getTecnica() {
        return tecnica;
    }

    public void setTecnica(double tecnica) {
        this.tecnica = tecnica;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return nombre + " (" + posicion + ')';
    }
    
    
}
