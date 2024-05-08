/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_80 {
      public static void main(String[] args) {
        try {
            throw new UnsupportedLookAndFeelException("Estilo de apariencia no compatible");
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}
