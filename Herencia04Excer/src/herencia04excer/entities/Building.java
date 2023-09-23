/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia04excer.entities;

/**
 *
 * @author blue_
 */
public abstract class Building {
    
    protected Double width;
    protected Double height;
    protected Double length;

    public Building() {
    }

    public Building(Double width, Double height, Double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    
    public abstract Double calculateSurface();
    
    public abstract Double calculateVolume();

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Building{" + "width=" + width + ", height=" + height + ", length=" + length + '}';
    }
    
    
}
