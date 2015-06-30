/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.marvel.dominio;

/**
 *
 * @author Andrea
 */
public class SuperHeroe {
     private boolean esVengador = false;
     public String nombre;

    public SuperHeroe(String nombre) {
      
    }
    
    
    
    public boolean isEsVengador() {
        return esVengador;
    }

    public void setEsVengador(boolean esVengador) {
        //Validacion de seguridad
        this.esVengador = esVengador;
    }

    public boolean luchar(Personaje personaje) throws ExcepcionPersonajeMuerto,NullPointerException{
       
        
        
        if(personaje.estaVivo==false){
            throw new ExcepcionPersonajeMuerto(personaje);
        }
        
        return false;
    }
}
