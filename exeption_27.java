/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_27 {
      public static void main(String[] args) {
        
        try{
            
            try{
        
            Object objeto = new Object();
            objeto.wait();
        
            } catch(InterruptedException ex){

                System.out.println("No entrará aquí");

            } 
            
        } catch(IllegalMonitorStateException ex){
            
            System.out.println("**Se lanza cuando se realiza una operación de monitoreo ilegal, como esperar o notificar en un objeto sin poseer el bloqueo adecuado.");
            
            ex.printStackTrace();
            
        }
            
    }
}
