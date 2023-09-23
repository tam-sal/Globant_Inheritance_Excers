/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia02excer.services;

import herencia02excer.entities.*;

/**
 *
 * @author blue_
 */
public class TVService extends ApplianceService {
    
    private final ApplianceService as = new ApplianceService();
    
    public TV createTV(String color, String code, int weight, int resolution, boolean tuner) {
        Appliance ap = as.createAppliance(color, code, weight);
        return new TV(ap.getPrice(), ap.getColor(), ap.getEnergyCode(), ap.getWeight(), resolution, tuner);
    }
    
    public void getUpdatedPrice(TV tv) {
        as.getUpdatedPrice(tv);
        if (tv.getResolution() > 40) {
            double updatedPrice = tv.getPrice() * 1.3;
            tv.setPrice((int) updatedPrice);
        }
        if (tv.isTuner()) {
            tv.setPrice(tv.getPrice() + 500);
        }
    }
}
