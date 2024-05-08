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
import java.util.List;

public class exeption_40 {
     public static void main(String[] args) {
         
       try {
            List<String> list = new ArrayList<>();
            list.add("One");
            for (String item : list) {
                list.remove(0); // Modificando la lista mientras se itera sobre ella
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException: " + e.getMessage());
        }              
    }
}
