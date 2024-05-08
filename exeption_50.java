/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.management.BadAttributeValueExpException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_50 {
      public static void main(String[] args) {
        try {
            throw new BadAttributeValueExpException("Valor del atributo no válido");
        } catch (BadAttributeValueExpException e) {
            e.printStackTrace();
        }
    }
}
