/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
import java.util.IllegalFormatFlagsException;
public class exeption_29 {
     public static void main(String[] args) {
        
        try{
            
            String mensaje = String.format("% %", "cadena", 123);
            
        } catch(IllegalFormatFlagsException ex){
            
            System.out.println("**Se lanza cuando ocurre un error durante la conversión de un argumento en una cadena de formato.**");
            
            ex.printStackTrace();
            
        }
        
        
        
    }
}
