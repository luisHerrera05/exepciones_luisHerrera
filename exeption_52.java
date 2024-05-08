/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.management.BadStringOperationException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_52 {
      
    public static void main(String[] args) {
        try {
            throw new BadStringOperationException("Operación de cadena no válida");
        } catch (BadStringOperationException e) {
            e.printStackTrace();
        }
    }
}
