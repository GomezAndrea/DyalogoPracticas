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
import java.io.*;
import java.util.Properties;
/**
 *
 * @author Andrea
 */
public class CrearArchivos {
   // Genera el log de la clase Persona
    static Logger log = Logger.getLogger(Persona.class.getName());        
    // Constructor por defecto
  
    public static void main(String[] args) throws IOException { 
    // Variable captura Texto, ruta archivo
    String dialogo ="";
    FileWriter fichero = null;
          
// Objeto que recibira el dialogo  
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
                 fichero = new FileWriter("C://Users//Andrea//Desktop//ClasesJava//Archivosprograma/prueba.txt");
                 System.out.println("Por favor escriba el texto que desea tener en el archivo");
                 dialogo = br.readLine();
                 fichero.write(dialogo);
                 /**Creamos un Objeto de tipo Properties*/
                  Properties propiedades = new Properties();
                  /**Cargamos el archivo desde la ruta especificada*/
   propiedades.load(new FileInputStream("C:\\Users\\Andrea\\Documents\\NetBeansProjects\\DyalogoPracticas\\src\\com\\tareas\\taller1\\archivo.properties"));
   /**Obtenemos los parametros definidos en el archivo*/
   String ruta = propiedades.getProperty("C://Users//Andrea//Desktop//ClasesJava//Archivosprograma/prueba.txt");
                }
            catch (IOException ex){
                //capturamos cualquier excepción que se pueda producir y la reportamos
             ex.printStackTrace(System.err);System.exit(-1); 
             log.info("Se generó un error en la aplicación por favor consulte con el soporte de Dyalogo");
            }
            fichero.close();
    }
}
