/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia04excer.entities;

import herencia04excer.enums.*;

/**
 *
 * @author blue_
 */
public class SportsCenter extends Building {

    protected String name;
    protected String type;
    protected SportsCenterType s;

    public SportsCenter(String name, String type, Double width, Double height, Double length) {
        super(width, height, length);
        this.name = name;
        this.type = s.valueOf(type.toUpperCase()).toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Double calculateSurface() {
        return width * height;
    }

    @Override
    public Double calculateVolume() {
        return width * height * length;
    }

    @Override
    public String toString() {
        return "SportsCenter{" + "name=" + name + ", type=" + type
                + ", width=" + super.width + ", height=" + super.height + ", length=" + super.length + '}';
    }

}
