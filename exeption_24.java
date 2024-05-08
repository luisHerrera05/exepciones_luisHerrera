/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_24 {
   
    public static void main(String[] args) {
        
        try{
            
            Thread thread = new Thread();
            thread.start();
            thread.start();
            
        } catch(IllegalThreadStateException ex){
            
            System.out.println("Se lanza cuando se realiza una operación inválida en un hilo, como iniciar un hilo que ya ha sido iniciado.");
            
        }
        
    }
    }

