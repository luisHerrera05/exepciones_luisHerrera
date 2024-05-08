/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.util.TooManyListenersException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_77 {
     public static void main(String[] args) {
        try {
            throw new TooManyListenersException("Demasiados escuchadores registrados");
        } catch (TooManyListenersException e) {
            e.printStackTrace();
        }
    }
}
