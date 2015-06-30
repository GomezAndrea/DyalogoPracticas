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
public class Frases {
  // Genera el log de la clase Persona
    static Logger log = Logger.getLogger(Persona.class.getName()); 
     // Constructor por defecto
    public static void main(String[] args) {  
        int numero = 0; 
       // Objeto que recibira el nombre de la persona    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         do{
            try {
            System.out.println("Ingrese un numero 1 a 10 para ver las frases para salir digite 0:");
            numero = Integer.parseInt(br.readLine());
            } catch (IOException ex) {
            log.error("Eror de IO", ex);
            } catch (NumberFormatException ne) {
            log.error("Eror de Conversion", ne);
            System.out.println("Usted no digitó un numero por lo cual se saldra de la aplicación ");
            System.exit(0);
           }
         if (numero <=10){
            
         switch(numero){
             case 1:
                 System.out.println("¿Qué locura o qué desatino me lleva a contar las ajenas faltas, teniendo tanto que decir de las mías?");
             break;
            case 2:
                 System.out.println("El que lee mucho y anda mucho, ve mucho y sabe mucho.");
             break;   
            case 3:
                 System.out.println("El que no sabe gozar de la ventura cuando le viene, no debe quejarse si se pasa.");
             break;
            case 4:
                 System.out.println("Amor y deseo son dos cosas diferentes; que no todo lo que se ama se desea, ni todo lo que se desea se ama.");
             break;
            case 5:
                 System.out.println("Confía en el tiempo, que suele dar dulces salidas a muchas amargas dificultades.");
             break;  
            case 6:
                 System.out.println("Amistades que son ciertas nadie las puede turbar.");
             break;
            case 7:
                 System.out.println("Más vale la pena en el rostro que la mancha en el corazón.");
             break;
             case 8:
                 System.out.println("Puede haber amor sin celos, pero no sin temores.");
             break;    
            case 9:
                 System.out.println("La buena y verdadera amistad no debe ser sospechosa en nada.");
             break;
            case 10:
                 System.out.println("No ames lo que eres, sino lo que puedes llegar a ser.");
             break;     
         }
         } 
        }
        while (numero!=0);
         {
           System.out.println("Usted digitó 0 por lo cual saldra del programa");
            System.exit(0);  
         }
    } 
}
