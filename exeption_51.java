/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.swing.text.BadLocationException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_51 {
    public static void main(String[] args) {
        try {
            throw new BadLocationException("Ubicación no válida", 0);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
