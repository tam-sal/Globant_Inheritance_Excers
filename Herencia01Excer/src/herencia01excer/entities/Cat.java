/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia01excer.entities;

/**
 *
 * @author blue_
 */
public class Cat extends Animal {

    public Cat(String name, String food, Integer age, String breed) {
        super(name, food, age, breed);
    }

    @Override
    public void feed() {
        System.out.println("The cat is eating "+food);
    }
    
    
}
