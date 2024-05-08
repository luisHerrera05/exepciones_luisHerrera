/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.awt.AWTError;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_87 {
    public static void main(String[] args) {
        try {
            throw new AWTError("Error en la Abstract Window Toolkit (AWT)");
        } catch (AWTError e) {
            e.printStackTrace();
        }
    }
}
