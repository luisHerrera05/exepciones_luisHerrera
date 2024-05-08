/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.io.EOFException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_107 {
    public static void main(String[] args) {
        try {
            throw new EOFException();
        } catch (EOFException e) {
            e.printStackTrace();
        }
    }
}
