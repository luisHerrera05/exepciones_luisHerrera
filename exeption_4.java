/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_4 {
    public static void main(String[] args) {
        
        try{
            
            String str = "hola";
            int num = Integer.parseInt(str);
            
        }catch(NumberFormatException ex){
            
            System.out.println("Se lanza cuando se intenta convertir una cadena en un tipo numérico, pero la cadena no tiene el formato adecuado.");
            
        }
        
    }
    
}
