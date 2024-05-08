/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
import java.util.HashMap;
import java.util.Map;
public class exeption_44 {
     public static void main(String[] args) {
          
        try {
            Map<String, Integer> map = new HashMap<>();
            map.put("uno", 1);
            map = java.util.Collections.unmodifiableMap(map);
            map.put("dos", 2); // Intentando agregar un par clave-valor a un mapa no modificable
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException: " + e.getMessage());
        }         
      }
}
