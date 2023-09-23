/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia01excer;

import herencia01excer.entities.*;

/**
 *
 * @author blue_
 */
public class Herencia01Excer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat c = new Cat("Fuf", "cat food", 3, "siam");
        Horse h = new Horse("Horse 1", "horse food", 5, "Fine");
        System.out.println(c);
        System.out.println(h);
        System.out.println("---FOOD---");
        c.feed();
        h.feed();
    }
    
}
