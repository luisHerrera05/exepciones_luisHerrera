/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.sound.midi.MidiUnavailableException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_67 {
     public static void main(String[] args) {
        try {
            throw new MidiUnavailableException("Dispositivo MIDI no disponible");
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }
}
