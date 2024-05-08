/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exeptions;

import java.net.HttpRetryException;

/**
 *
 * @author luiseduardoherrerasperandio
 */
public class exeption_111 {
    public static void main(String[] args) {
        try {
            throw new HttpRetryException("", 0);
        } catch (HttpRetryException e) {
            e.printStackTrace();
        }
    }
}
