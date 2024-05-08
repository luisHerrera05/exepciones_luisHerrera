/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.awt.AWTException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_48 {
     public static void main(String[] args) {
        try {
            throw new AWTException("Excepción de AWT");
        } catch (AWTException e) {
          e.printStackTrace();
        }
    }
}
