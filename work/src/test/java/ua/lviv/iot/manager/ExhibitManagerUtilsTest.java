package ua.lviv.iot.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.model.SortType;


public class ExhibitManagerUtilsTest extends BaseExhibitManagerTest {

    @Test
    public void testSortWeaponsByDecadeAsc() {
        ExhibitManagerUtils.sortWeaponsByTime(arsenal, SortType.ASCENDING);
        Assertions.assertEquals(1000, arsenal.get(0).getDecade());
        Assertions.assertEquals(1100, arsenal.get(1).getDecade());
        Assertions.assertEquals(1500, arsenal.get(2).getDecade());
    }


}
