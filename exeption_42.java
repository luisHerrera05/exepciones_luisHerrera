/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
import java.util.Collections;
import java.util.List;

public class exeption_42 {
    public static void main(String[] args) {
          
        try {
            List<String> list = Collections.singletonList("Hello");
            list.add("tirra"); // Intentando agregar un elemento a una lista no modificable
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException: " + e.getMessage());
        }        
    }
}
