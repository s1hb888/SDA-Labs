/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapterpattern;

/**
 *
 * @author UBH LAPTOPS
 */
// Sparrow class jo Bird interface ko implement karti hai
public class Sparrow implements Bird {
    @Override
    public void chirp() {
        System.out.println("Chirp chirp!");
    }
}
