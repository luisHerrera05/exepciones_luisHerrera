/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.io.InterruptedIOException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_114 {
     public static void main(String[] args) {
        try {
            throw new InterruptedIOException();
        } catch (InterruptedIOException e) {
            e.printStackTrace();
        }
    }
}
