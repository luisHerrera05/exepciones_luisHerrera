/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.nio.charset.CoderMalfunctionError;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_88 {
    public static void main(String[] args) {
        try {
            throw new CoderMalfunctionError(new RuntimeException("Malfunción del codificador"));
        } catch (CoderMalfunctionError e) {
            e.printStackTrace();
        }
    }
}
