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
public interface IPersonaje {
   
    public boolean luchar(Personaje p) throws ExcepcionPersonajeMuerto;
    
}