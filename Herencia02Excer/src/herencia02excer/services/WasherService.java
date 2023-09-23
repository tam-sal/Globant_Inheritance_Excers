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
public class WasherService extends ApplianceService {

    public WasherService() {
        System.out.println("WasherService Constuctor");
    }


    //private final ApplianceService as = new ApplianceService();
    public Washer createWasher(String color, String code, int weight, Integer load) {
        Appliance ap = super.createAppliance(color, code, weight);
        Washer w = new Washer(ap.getPrice(), ap.getColor(), ap.getEnergyCode(), ap.getWeight(), load);
        return w;
    }

    public void getUpdatedPrice(Washer w) {
        super.getUpdatedPrice(w);
        if (w.getLoad() > 30) {
            w.setPrice(w.getPrice() + 500);
        }
    }

}
