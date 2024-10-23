/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapterpattern;

/**
 *
 * @author UBH LAPTOPS
 */
// Adapter class
public class BirdAdapter implements ToyDuck {
    private Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        // yahan hum bird ke chirp method ko call karte hain
        bird.chirp();
    }
}
