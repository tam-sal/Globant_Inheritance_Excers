/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia02excer.entities;

import herencia02excer.enums.*;

/**
 *
 * @author blue_
 */
public class Appliance {

    protected Integer price = 1000;
    protected ApplianceColor color;
    protected EnergyConsumption energyCode;
    protected Integer weight;
    

    public Appliance() {
    }

    public Appliance(int price, ApplianceColor color, EnergyConsumption energyCode, Integer weight) {
        this.price = price;
        try{
            if (!isValidColor(color)){
                throw new IllegalArgumentException("invalid color");
            }
            this.color = color;
        }
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
            this.color = ApplianceColor.WHITE;
            
        }
        

        if (!isValidEnergyCode(energyCode)) {
            this.energyCode = EnergyConsumption.F;
        } else {
            this.energyCode = energyCode;
        }

        this.weight = weight;
    }

    private boolean isValidEnergyCode(EnergyConsumption code) {
        for (EnergyConsumption ec : EnergyConsumption.values()) {
            if (code.toString().equalsIgnoreCase(ec.toString())) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidColor(ApplianceColor c) {
        for (ApplianceColor ac : ApplianceColor.values()) {
            if (c.toString().equalsIgnoreCase(ac.toString())) {
                return true;
            }
        }
        return false;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public ApplianceColor getColor() {
        return color;
    }

    public void setColor(ApplianceColor color) {
        this.color = color;
    }

    public EnergyConsumption getEnergyCode() {
        return energyCode;
    }

    public void setEnergyCode(EnergyConsumption energyCode) {
        this.energyCode = energyCode;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Appliance{" + "price=" + price + ", color=" + color + ", energyCode=" + energyCode + ", weight=" + weight + '}';
    }
    
    

}
