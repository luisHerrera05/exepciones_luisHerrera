/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class exeption_25 {
     public static void main(String[] args) {
        
        try{
            
            List<String> Lista = new ArrayList<>();
            Lista.add("l");
            for (String elemento : Lista) {
                Lista.remove(elemento);
            }
            
        } catch(ConcurrentModificationException ex){
            
            System.out.println("Se lanza cuando se detecta una modificación concurrente durante la iteración de una colección utilizando iteradores \"fall-fast\".");
            
        }
        
        
        
    }
    
}
