/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.marvel.dominio;
import java.io.Serializable;
/**
 *
 * @author Andrea
 */
public abstract class Personaje implements IPersonaje, Serializable { 
    private Genero genero;
    private String planeta;
    private int cantidadVida = 100;
    protected boolean estaVivo = false; 
    private String nombre;

    public Personaje() {
    }

public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public Personaje(String nombre, Genero genero, String planeta) {
        this.nombre = nombre;
        this.genero = genero;
        this.planeta = planeta;
    }
/**
     * Este metodo realiza la lucha contra un villano
     *
     * @param personaje - Villano contra el que va a luchar
     * @return False: si mutio el super heroe true si gano la pelea
     * @throws com.marvel.dominio.ExcepcionPersonajeMuerto
     */
    @Override
    public abstract boolean luchar(Personaje personaje) throws ExcepcionPersonajeMuerto;

    private void sumarVida() {
        if (cantidadVida >= 100) {
            
        } else {
            cantidadVida++;
        }
    }

    private void restarVida() {
        if (cantidadVida == 0) {
            estaVivo = false;
        } else {
            cantidadVida--;
        }
    }

    public int getCantidadVida() {
        return cantidadVida;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

}