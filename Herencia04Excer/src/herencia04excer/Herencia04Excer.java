/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia04excer;

import herencia04excer.entities.*;
import java.util.ArrayList;

/**
 *
 * @author blue_
 */
public class Herencia04Excer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Building> buildings = new ArrayList();
        OfficeBuilding ob = new OfficeBuilding(100d, 100d, 150d, 5, 50, 2);
        OfficeBuilding ob2 = new OfficeBuilding(100d, 100d, 150d, 10, 50, 3);
        SportsCenter sc = new SportsCenter("SP1", "covered", 100d, 50d, 50d);
        SportsCenter sc2 = new SportsCenter("SP2", "opensky", 50d, 70d, 90d);
        buildings.add(ob);
        buildings.add(ob2);
        buildings.add(sc);
        buildings.add(sc2);
        for (Building building : buildings) {
            System.out.println(building);
            System.out.println("Area " + building.calculateSurface());
            System.out.println("Vol: " + building.calculateVolume());
            if (building instanceof OfficeBuilding) {
                System.out.println("Capacity: ");
                System.out.println(((OfficeBuilding) building).maxPersonCapacity());
            }
        }
    }

}
