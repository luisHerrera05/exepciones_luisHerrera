/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_66 {
    public static void main(String[] args) {
        try {
            throw new LineUnavailableException("La línea de audio no está disponible");
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
