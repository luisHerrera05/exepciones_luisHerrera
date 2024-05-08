/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.nio.channels.InterruptedByTimeoutException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_113 {
    public static void main(String[] args) {
        try {
            throw new InterruptedByTimeoutException();
        } catch (InterruptedByTimeoutException e) {
            e.printStackTrace();
        }
    }
}
