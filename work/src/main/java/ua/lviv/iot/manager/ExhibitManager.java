package ua.lviv.iot.manager;


import ua.lviv.iot.model.Weapons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExhibitManager {

    private List<Weapons> arsenal = new LinkedList<>();

    public void addWeaponsToArsenal(Weapons weapons) {
        this.arsenal.add(weapons);

    }

    public void displayArsenalInfo() {
        for (Weapons weapons : this.arsenal) {
            System.out.println(weapons.toString());
        }
    }

    public List<Weapons> findWeaponByDecade(int decade) {
        ArrayList<Weapons> result = new ArrayList<Weapons>();
        for (Weapons weapons : this.arsenal) {
            if (weapons.getDecade() == decade) {
                result.add(weapons);

            }
        }
        return result;
    }

}
