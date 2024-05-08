/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_78 {
     public static void main(String[] args) {
        try {
            throw new UnsupportedAudioFileException("Formato de archivo de audio no compatible");
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }
}
