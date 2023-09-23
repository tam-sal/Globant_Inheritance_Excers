/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia02excer.services;

import herencia02excer.entities.*;
import herencia02excer.enums.*;

/**
 *
 * @author blue_
 */
public class ApplianceService {

    private boolean isValidColor(String color) {
        for (ApplianceColor c : ApplianceColor.values()) {
            if (color.toUpperCase().equals(c.toString())) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidEnergyCode(String code) {
        for (EnergyConsumption e : EnergyConsumption.values()) {
            if (code.toUpperCase().equals(e.toString())) {
                return true;
            }
        }
        return false;
    }

    public Appliance createAppliance(String color, String code, int weight) {

        Appliance ap = new Appliance();

        if (isValidColor(color.toUpperCase())) {
            ap.setColor(ApplianceColor.valueOf(color.toUpperCase()));
        } else {
            ap.setColor(ApplianceColor.WHITE);
        }

        if (isValidEnergyCode(code.toUpperCase())) {
            ap.setEnergyCode(EnergyConsumption.valueOf(code.toUpperCase()));
        } else {
            ap.setEnergyCode(EnergyConsumption.F);
        }
        ap.setPrice(1000);
        if (weight < 1) {
            throw new Error("Weight must be a positive number");

        }
        ap.setWeight(weight);

        return ap;
    }

    public void getUpdatedPrice(Appliance ap) {
        int basePrice = 1000;
        for (EnergyConsumption e : EnergyConsumption.values()) {
            if (ap.getEnergyCode().equals(e)) {
                ap.setPrice(basePrice + e.getEnergyPrice());
            }
        }
        if (ap.getWeight() <= 19) {
            ap.setPrice(ap.getPrice() + 100);
        } else if (ap.getWeight() <= 49) {
            ap.setPrice(ap.getPrice() + 500);
        } else if (ap.getWeight() <= 79) {
            ap.setPrice(ap.getPrice() + 800);
        } else {
            ap.setPrice(ap.getPrice() + 1000);
        }

    }

}
