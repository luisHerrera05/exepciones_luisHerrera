/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.nio.channels.FileLockInterruptionException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_108 {
      public static void main(String[] args) {
        try {
            throw new FileLockInterruptionException();
        } catch (FileLockInterruptionException e) {
            e.printStackTrace();
        }
    }
}
