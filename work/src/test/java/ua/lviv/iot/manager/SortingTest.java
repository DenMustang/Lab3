package ua.lviv.iot.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingTest extends WeaponManagerTest {
    @Test
    void staticInnerClassSorterTest() {
        arsenal.sort(new ExhibitManagerUtils.WeaponsInArsenalSortedByAge());
        Assertions.assertEquals(40, arsenal.get(0).getAge());
        Assertions.assertEquals(50, arsenal.get(1).getAge());
        Assertions.assertEquals(60, arsenal.get(2).getAge());
    }


}
