/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.UnsupportedCallbackException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_79 {
    public static void main(String[] args) {
        try {
            throw new UnsupportedCallbackException((Callback) null, "Operación de callback no soportada");
        } catch (UnsupportedCallbackException e) {
            e.printStackTrace();
        }
    }
}
