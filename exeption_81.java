/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_81 {
    public static void main(String[] args) {
        try {
            URI uri = new URI("esto no es una URI válida");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
