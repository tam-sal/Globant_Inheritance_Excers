/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia02excer.enums;

/**
 *
 * @author blue_
 */
public enum EnergyConsumption {

    A(1000),
    B(800),
    C(600),
    D(500),
    E(300),
    F(100);

    private final int energyPrice;

    EnergyConsumption(int energyPrice) {
        this.energyPrice = energyPrice;
    }

    public int getEnergyPrice() {
        return energyPrice;
    }

}
