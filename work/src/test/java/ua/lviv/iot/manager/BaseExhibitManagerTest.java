package ua.lviv.iot.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.model.Weapons;
import java.util.ArrayList;

public class BaseExhibitManagerTest {
    protected ArrayList<Weapons> arsenal;

    @BeforeEach
    public void addWeaponsToArsenal(){
        arsenal = new ArrayList<Weapons>();
        arsenal.add(new Weapons("GreekAuthor",6,"Very sharp","Sword",1000,1000));
        arsenal.add(new Weapons("RomanAuthor",7,"Very convenient","Spear",3000,1100));
        arsenal.add(new Weapons("AustrianAuthor",5,"Very light and sharp","Axe",2000,1500));
    }
}
