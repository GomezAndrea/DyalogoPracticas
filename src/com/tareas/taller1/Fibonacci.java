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
public class Fibonacci {
    static Logger log = Logger.getLogger(Persona.class.getName()); 
     // Constructor por defecto
    public static void main(String[] args) throws IOException {
        // Objeto que recibira el numero para hacer la serie    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     //Para manejar los que se generen 
        //Variable que toma los numeros
        int fibo1 = 0;
        int fibo2 = 0;
        int secuencia = 1;
        int numero = 0;
        do { 
             try {
             System.out.println("Digite un número mayor a 1 para realizar la serie de Fibonacci hasta el número digitado:");      
            numero = Integer.parseInt(br.readLine());
           }  
             catch (NumberFormatException ex) {
           ex.printStackTrace(System.err);  
            System.out.println("Usted no digitó un numero por lo cual no se puede realizar el proceso");
            System.exit(0);
           log.info("Se generó un error en la aplicación por favor consulte con el soporte de Dyalogo");
            }
        } 
        while (numero <= 1);{
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:"); 

fibo1=1; 
fibo2=1; 


System.out.print(fibo1 + " "); 
for(secuencia= 2;secuencia<=numero;secuencia++){ 
System.out.print(fibo2 + " "); 
fibo2 = fibo1 + fibo2; 
fibo1 = fibo2 - fibo1;
    }
    }
        
    } 
}
