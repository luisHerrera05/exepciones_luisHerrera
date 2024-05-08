/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
import java.util.UnknownFormatConversionException;

public class exeption_28 {
    
    public static void main(String[] args){
        
        try{
            
            String mensaje = String.format("%4 %5", "cadena", 693);
            
        } catch(UnknownFormatConversionException ex){
            
            System.out.println("Se produce cuando se proporciona una conversión desconocida.");
            
            ex.printStackTrace();
            
        }
        
        
        
    }
    
}
