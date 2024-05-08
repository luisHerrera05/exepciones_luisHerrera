/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.util.concurrent.TimeoutException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_76 {
     public static void main(String[] args) {
        try {
            throw new TimeoutException("Se ha excedido el tiempo de espera");
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
