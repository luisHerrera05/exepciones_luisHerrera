/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.nio.file.FileSystemException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_110 {
     public static void main(String[] args) {
        try {
            throw new FileSystemException("");
        } catch (FileSystemException e) {
            e.printStackTrace();
        }
    }
}
