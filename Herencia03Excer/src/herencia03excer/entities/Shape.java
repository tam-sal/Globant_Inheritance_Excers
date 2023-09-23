/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia03excer.entities;

/**
 *
 * @author blue_
 */
public abstract class Shape {

    protected String shapeType;
    

    public Shape() {
    }

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    public String toString() {
        return "Shape{" + "shapeType=" + shapeType + '}';
    }

}
