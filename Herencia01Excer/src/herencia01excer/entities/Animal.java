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
public abstract class Animal {
    protected String name;
    protected String food;
    protected Integer age;
    protected String breed;

    public Animal(String name, String food, Integer age, String breed) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.breed = breed;
    }
    
    public abstract void feed();

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public Integer getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", food=" + food + ", age=" + age + ", breed=" + breed + '}';
    }
    
    
    
}
