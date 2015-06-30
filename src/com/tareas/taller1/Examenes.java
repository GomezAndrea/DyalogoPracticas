/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tareas.taller1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author Andrea
 */
public class Examenes {
    // Genera el log de la clase Persona
    static Logger log = Logger.getLogger(Persona.class.getName()); 
     // Constructor por defecto
    public static void main(String[] args) {
       // Definición de Variables nombre y Examen promedio
       String nombre = "";
       String cadena = "";
       float examen =0;  
       float promedio=0;  
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
        // Pregunta por las notas de los examenes 
        for (int i = 1; i <= 10; i++){
              try {
            System.out.println("Examen "+i+": ");      
            examen= Float.parseFloat(br.readLine());
            promedio = (examen +promedio);    
        }  catch (NumberFormatException ne) {
            log.error("Eror de Conversion", ne);
            System.out.println("Usted no digitó una nota del examen debera volver a iniciar");
            System.exit(0);
         } catch (IOException ex) { 
               java.util.logging.Logger.getLogger(Examenes.class.getName()).log(Level.SEVERE, null, ex);
           } 
              
    }  
 promedio=(float)Math.round(promedio*100)/100;       
 System.out.println(nombre+", tu promedio es de "+promedio);          
}        
}
