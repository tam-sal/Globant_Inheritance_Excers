/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia04excer.entities;

import java.util.HashMap;

/**
 *
 * @author blue_
 */
public class OfficeBuilding extends Building {

    protected Integer officeQtyPerFloor;
    protected Integer personPerOffice;
    protected Integer floors;

    public OfficeBuilding(Double width, Double height, Double length, int officeCount, int personPerOffice, int floors) {
        super(width, height, length);
        this.officeQtyPerFloor = officeCount;
        this.personPerOffice = personPerOffice;
        this.floors = floors;
    }

    @Override
    public Double calculateSurface() {
        return width * height;
    }

    @Override
    public Double calculateVolume() {
        return width * height * length;
    }

    public Integer getOfficeQtyPerFloor() {
        return officeQtyPerFloor;
    }

    public void setOfficeQtyPerFloor(Integer officeQtyPerFloor) {
        this.officeQtyPerFloor = officeQtyPerFloor;
    }

    public Integer getPersonPerOffice() {
        return personPerOffice;
    }

    public void setPersonPerOffice(Integer personPerOffice) {
        this.personPerOffice = personPerOffice;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public HashMap maxPersonCapacity() {
        int personPerFloor = personPerOffice * officeQtyPerFloor;
        int buildingMaxPersonCapacity = personPerFloor * floors;
        HashMap<String, Integer> maxCapacity = new HashMap<String, Integer>() {
            {
                put("People per floor", personPerFloor);
                put("Building Max Person Capacity", buildingMaxPersonCapacity);
            }
        };
        return maxCapacity;
    }

    @Override
    public String toString() {
        return "OfficeBuilding{" + "officeCount=" + officeQtyPerFloor + ", personPerOffice=" + personPerOffice + ", floors=" + floors
                + ", width=" + super.width + ", height=" + super.height + ", length=" + super.length + '}';
    }

}
