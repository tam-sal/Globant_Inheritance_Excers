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
public class Rectangle extends Shape implements CalculateShapes {

    protected Double area;
    protected Double height;
    protected Double base;
    protected Double perimeter;

    public Rectangle(String shapeType, Double height, Double base) {
        super(shapeType);
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        this.area = height * base;
        return this.area;
    }

    @Override
    public double getPerimeter() {
        this.perimeter = 2 * (base + height);
        return this.perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +super.shapeType+ ", height=" + height + ", base=" + base + '}';
    }
    
    

}
