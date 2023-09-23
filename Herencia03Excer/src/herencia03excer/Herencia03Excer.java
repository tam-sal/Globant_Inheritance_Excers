/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia03excer;

import herencia03excer.entities.*;

/**
 *
 * @author blue_
 */
public class Herencia03Excer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r = new Rectangle("rectangle", 12d, 25d);
        System.out.println(r);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        
        Circle c = new Circle("circle", 5d, 3.5d);
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
    
}
