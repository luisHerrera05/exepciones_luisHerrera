/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class exeption_26 {
    public static void main(String[] args) {
        
        try{
            
            ResourceBundle bundle = ResourceBundle.getBundle("missing_resource");
            String value = bundle.getString("missing_key");
            
        } catch(MissingResourceException ex){
            
            System.out.println("**Se lanza cuando no se encuentra un recurso solicitado, como un archivo de propiedades o una clave en un archivo de propiedades.");
            
            ex.printStackTrace();
            
        }
        
    }
}
