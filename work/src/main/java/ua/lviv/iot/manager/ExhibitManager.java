package ua.lviv.iot.manager;


import ua.lviv.iot.model.Weapons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExhibitManager {
    //create new list of weapons = arsenal
    private List<Weapons> arsenal = new LinkedList<>();

    //adds weapon in list<weapons>
    public void addWeaponsToArsenal(Weapons weapons) {
        this.arsenal.add(weapons);

    }
    //displays weapon info
    public void displayArsenalInfo() {
        for (Weapons weapons : this.arsenal) {
            System.out.println(weapons.toString());
        }
    }
    //finds weapons by decade
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
