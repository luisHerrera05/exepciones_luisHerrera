/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.management.InvalidApplicationException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_59 {
      public static void main(String[] args) {
        try {
            throw new InvalidApplicationException("Aplicación inválida");
        } catch (InvalidApplicationException e) {
            e.printStackTrace();
        }
    }
}
