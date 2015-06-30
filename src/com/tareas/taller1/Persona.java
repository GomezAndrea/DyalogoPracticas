/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tareas.taller1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.log4j.Logger;

/**
 *
 * @author Andrea
 */
public class Persona {
    // Genera el log de la clase Persona
    static Logger log = Logger.getLogger(Persona.class.getName());        
    // Constructor por defecto
    public static void main(String[] args) {
     //Definicion de parametros Nombre y Edad Categoria 
       String nombre = "";
       String categoria = "";
       String cadena = "";
       String edad1= ""; 
       Integer edad = 0;  
       // Objeto que recibira el nombre de la persona    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     //Para manejar los que se generen
        do{
            try {
                 System.out.println("Nombre:");
                 nombre = br.readLine();
            }
            catch (IOException ex){
                //capturamos cualquier excepción que se pueda producir y la reportamos
             ex.printStackTrace(System.err);System.exit(-1); 
             log.info("Se generó un error en la aplicación por favor consulte con el soporte de Dyalogo");
            }
        }
        while (nombre.equals("") || null == nombre);
        do{
          try {
               System.out.println("Edad:");
               edad1 = br.readLine();
            }
          catch (IOException ex) {
            ex.printStackTrace(System.err);
            }
         } 
        while (edad1.equals("") || edad1 == null);
        {
            do{
         try {
             edad = Integer.parseInt(edad1);
         } 
         catch (NumberFormatException ex) {
           ex.printStackTrace(System.err);  
            System.out.println("Usted no digitó un numero por lo cual no se puede realizar el proceso");
            System.exit(0);
           log.info("Se generó un error en la aplicación por favor consulte con el soporte de Dyalogo");
         }
            }
         while (edad < 1);{
            // Se asigna la categoria  
      if (edad>50) {
            categoria="C";
        } 
      else if (edad>26){
            categoria="B";
        }
      else {
          categoria="A";
      }
      //se aumenta la decada
      edad = edad+10;
      //Se imprime el resultado
      cadena = "Usuario "+nombre+" de Categoría "+categoria+" en una década tendrá "+edad+" años.";
      System.out.println(cadena);   
        }
        }
    }
}

  
