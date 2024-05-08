/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.io.IOException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_64 {
        public static void main(String[] args) {
        try {
            throw new IOException("Error de entrada/salida");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
