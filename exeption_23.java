/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
import java.lang.reflect.Field;
public class exeption_23 {
     public static void main(String[] args) throws NoSuchFieldException {
        
        try{
            
            Class<?> clase = String.class;
            Field campo = clase.getField("vacio");
            
        } catch(NoSuchFieldException ex){
            
            System.out.println("Se lanza cuando se intenta acceder a un campo que no existe en una clase.");
            
        }
        
        
        
    }
}
