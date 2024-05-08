/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import org.ietf.jgss.GSSException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_56 {
    public static void main(String[] args) {
        try {
            throw new GSSException(GSSException.FAILURE, 1, "Error en el servicio de seguridad genérica");
        } catch (GSSException e) {
            e.printStackTrace();
        }
    }
}
