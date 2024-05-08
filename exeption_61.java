/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.util.prefs.InvalidPreferencesFormatException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_61 {
     
    public static void main(String[] args) {
        try {
            throw new InvalidPreferencesFormatException("Formato de preferencias inválido");
        } catch (InvalidPreferencesFormatException e) {
            e.printStackTrace();
        }
    }
}
