/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

/**
 *
 * @author luiseduardoherrerasperandio
 */


import java.util.prefs.BackingStoreException;


public class exeption_49 {
     public static void main(String[] args) {
        try {
            throw new BackingStoreException("Error en el almacenamiento de respaldo");
        } catch (BackingStoreException e) {
            e.printStackTrace();
        }
    }
}
