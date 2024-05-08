/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_14 {
     public static void main(String[] args) {
        
        
        try{
            
            String str = "Hola";
            char caracter = str.charAt(10);
            
        } catch(StringIndexOutOfBoundsException ex){
            
            System.out.println("Se lanza cuando se intenta acceder a un índice fuera del rango válido de una cadena.");
            
            ex.printStackTrace();
            
        }
        
    }
}
