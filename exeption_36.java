/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_36 {
      public static void main(String[] args) {
          
        try {
            Object obj = new Object();
            obj.wait(); // Esperando en un objeto sin tener el bloqueo
        } catch (InterruptedException | IllegalMonitorStateException e) {
            System.out.println("IllegalMonitorStateException: " + e.getMessage());
        }               
    }
}
