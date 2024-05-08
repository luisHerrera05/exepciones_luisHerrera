/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_15 {
      public static void main(String[] args) {
        
        System.out.println("Antes de la espera de 35 dsegundos...");
        
        try {
            
            Thread.currentThread().interrupt();
            
            Thread.sleep(35000);
            
            System.out.println("Después de esperar 35 segundos.");
            
        } catch (InterruptedException e){
            
            System.err.println("Se ha producido un error: " + e.getMessage());
            e.printStackTrace();
            
        }
        
        System.out.println("Fin del programa.");
        
    }
}
