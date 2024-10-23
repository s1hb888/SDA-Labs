/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adapterpattern;

/**
 *
 * @author UBH LAPTOPS
 */

public class AdapterPattern {

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();

        // BirdAdapter banate hain
        ToyDuck toyDuck = new BirdAdapter(sparrow);

        // squeak method ko call karte hain, jo chirp ko call karega
        toyDuck.squeak(); // Output: Chirp chirp!
    }
}

// Bird interface

