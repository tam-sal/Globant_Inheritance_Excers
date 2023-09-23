/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia02excer.entities;

import herencia02excer.enums.ApplianceColor;
import herencia02excer.enums.EnergyConsumption;

/**
 *
 * @author blue_
 */
public class TV extends Appliance {

    protected Integer resolution;
    protected boolean tuner;

    public TV() {
    }

    public TV(int price, ApplianceColor color, EnergyConsumption energyCode, Integer weight, Integer resolution, boolean tuner) {
        super(price, color, energyCode, weight);
        this.resolution = resolution;
        this.tuner = tuner;
    }

    public Integer getResolution() {
        return resolution;
    }

    public void setResolution(Integer resolution) {
        this.resolution = resolution;
    }

    public boolean isTuner() {
        return tuner;
    }

    public void setTuner(boolean tuner) {
        this.tuner = tuner;
    }

    @Override
    public String toString() {
        return "TV{"+"price="+super.price+", color="+super.color 
                +", energyCode="+super.energyCode + ", weight="+super.weight
                + ", resolution=" + resolution + ", tuner=" + tuner + '}';
    }
    
    

}
