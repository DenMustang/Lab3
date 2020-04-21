package ua.lviv.iot.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.model.Weapons;

import java.util.List;

public class WeaponManagerTest extends BaseExhibitManagerTest{
    private ExhibitManager exhibitManager;

    @BeforeEach
    public void setUp(){
      exhibitManager = new ExhibitManager();
      for (Weapons weapons : arsenal){
          exhibitManager.addWeaponsToArsenal(weapons);
      }
    }

    @Test
    public void testFindWeaponByDecade(){
        List<Weapons> weapons = exhibitManager.findWeaponByDecade(1000);
        Assertions.assertEquals(1,weapons.size());
        Assertions.assertEquals(1000,weapons.get(0).getDecade());
    }

    @Test
    public void testFindWeaponByAuthor(){
        List<Weapons> weapons = exhibitManager.findWeaponByAuthor("GreekAuthor");
        Assertions.assertEquals(1,weapons.size());
        Assertions.assertEquals("GreekAuthor",weapons.get(0).getAuthor());
    }

    @Test
    public void testShowWeapons(){
        exhibitManager.displayArsenalInfo();
    }

}
