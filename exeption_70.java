/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_70 {
     public static void main(String[] args) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            dateFormat.parse("texto no válido");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
