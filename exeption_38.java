/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
import java.util.List;
import java.util.Collections;
public class exeption_38 {
     public static void main(String[] args) {
          
       try {
            List<String> list = Collections.emptyList();
            String element = list.get(0); // Accediendo a un índice fuera de los límites de la lista vacía
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        }           
    }
}
