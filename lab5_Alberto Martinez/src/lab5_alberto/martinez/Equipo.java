/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_alberto.martinez;

import java.util.ArrayList;

/**
 *
 * @author Alberto
 */
public class Equipo {
    public String nombre;
    public Double presupuesto;
    public int copas;
    public String estadio;
    public ArrayList<Jugador> jugadores=new ArrayList();

    public Equipo(String nombre, Double presupuesto, int copas, String estadio) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.copas = copas;
        this.estadio = estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
}
