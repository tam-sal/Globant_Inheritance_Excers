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
public class Washer extends Appliance {
    protected Integer load;

    public Washer() {
    }

    public Washer(int price, ApplianceColor color, EnergyConsumption energyCode, Integer weight, Integer load) {
        super(price, color, energyCode, weight);
        if(load < 1) {
            throw new IllegalArgumentException("Load must be positive");
        }
        this.load = load;
    }

    public Integer getLoad() {
        return load;
    }

    public void setLoad(Integer load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Washer{" + " price="+ super.price + ", color="+super.color + 
                ", EnergyConsumption="+ super.energyCode + ", weight=" + super.weight
                + ", load=" + load + '}';
    }
    
    
    
    
}
