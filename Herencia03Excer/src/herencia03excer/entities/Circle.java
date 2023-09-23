/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia03excer.entities;

import herencia03excer.interfaces.*;

/**
 *
 * @author blue_
 */
public class Circle extends Shape implements CalculateShapes {
    protected Double radius;
    protected Double diameter;
    protected Double area;
    protected Double perimeter;

    public Circle() {
    }
    
    public Circle(String shapeType, double radius, double diameter){
        super(shapeType);
        this.diameter = diameter;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        this.area = pi * Math.pow(radius, 2);
        return this.area;         
    }

    @Override
    public double getPerimeter() {
        this.perimeter = pi * diameter;
        return this.perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" + super.shapeType+ ", radius=" + radius + ", diameter=" + diameter + '}';
    }
    
    
    
    
    
}
