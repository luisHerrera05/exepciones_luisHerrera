/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_47 {
     public static void main(String[] args) {
         
        try {
            java.util.Iterator<String> iterator = java.util.Collections.emptyIterator();
            String element = iterator.next(); // Intentando obtener el siguiente elemento de un iterador vacío
        } catch (java.util.NoSuchElementException e) {
            System.out.println("NoSuchElementException: " + e.getMessage());
        }             
      }
}
