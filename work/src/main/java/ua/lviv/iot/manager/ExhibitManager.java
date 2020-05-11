package ua.lviv.iot.manager;


import ua.lviv.iot.model.Weapons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExhibitManager {


    private final List<Weapons> arsenal = new LinkedList<>();

    public final void addWeaponsToArsenal(final Weapons weapons) {
        this.arsenal.add(weapons);

    }

    public final void displayArsenalInfo() {
        for (Weapons weapons : this.arsenal) {
            System.out.println(weapons.toString());
        }
    }

     public final List<Weapons> findWeaponByDecade(final int decade) {
        ArrayList<Weapons> result = new ArrayList<Weapons>();
        for (Weapons weapons : this.arsenal) {
            if (weapons.getDecade() == decade) {
                result.add(weapons);

            }
        }
        return result;
    }

}
