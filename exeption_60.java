/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.sound.midi.InvalidMidiDataException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_60 {
     public static void main(String[] args) {
        try {
            throw new InvalidMidiDataException("Datos MIDI inválidos");
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }
}
