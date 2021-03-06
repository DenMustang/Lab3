package ua.lviv.iot.manager;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.model.Exhibits;
import ua.lviv.iot.model.SortType;
import ua.lviv.iot.model.Weapons;

public class ExhibitManagerUtils {

    //anonymous inner class
    public Comparator<Weapons> compareByTime = new Comparator<Weapons>() {
        @Override
        public int compare(
                final Weapons firstWeapon, final Weapons secondWeapon) {
            return firstWeapon.getAuthor().compareTo(secondWeapon.getAuthor());

        }
    };

    //sorting method(by decade)
    public static void sortWeaponsByTime(
            final List<Weapons> arsenal, final SortType sortType) {
        System.out.println("Sorted Weapon By Time");
        if (sortType == SortType.ASCENDING) {
            arsenal.sort(Comparator.comparing(Exhibits::getDecade));
        } else if (sortType == SortType.DESCENDING) {
            arsenal.sort(Comparator.comparing(Exhibits::getDecade).reversed());
        } else {
            System.out.println("Fail,something is wrong");
        }
    }

    //sorting method(by age)
    public static void sortWeaponsByAge(
            final List<Weapons> arsenal, final SortType sortType) {
        System.out.println("Sorted Weapon By Decade");
        if (sortType == SortType.ASCENDING) {
            arsenal.sort(Comparator.comparing(Weapons::getAge));
        } else if (sortType == SortType.DESCENDING) {
            arsenal.sort(Comparator.comparing(Weapons::getAge).reversed());
        } else {
            System.out.println("Fail,something is wrong");
        }
    }

    //sorting method(by decade(used for private method(inner class sort))
    public static void sortWeaponsInArsenalByAge(final List<Weapons> arsenal, final SortType sortType) {
        System.out.println("Sorted Weapon By Age");
        if (sortType == SortType.ASCENDING) {
            arsenal.sort(new ExhibitManagerUtils.WeaponsInArsenalSortedByAge());
        } else if (sortType == SortType.DESCENDING) {
            arsenal.sort(Comparator.comparing(Weapons::getDecade).reversed());
        } else {
            System.out.println("Fail,something is wrong");
        }
    }
    //setter x getter for compareByTime
    public Comparator<Weapons> getCompareByTime() {
        return compareByTime;
    }
    public void setCompareByTime(final Comparator<Weapons> compareViaTime) {
        this.compareByTime = compareViaTime;
    }

    //static inner class
    static class WeaponsInArsenalSortedByDecade implements Comparator<Weapons> {
        @Override
        public int compare(final Weapons firstWeapon, final Weapons secondWeapon) {
            return firstWeapon.getDecade() - secondWeapon.getDecade();
        }
    }

    //static inner class
    static class WeaponsInArsenalSortedByAge implements Comparator<Weapons> {
        @Override
        public int compare(final Weapons firstWeapon, final Weapons secondWeapon) {
            return firstWeapon.getAge() - secondWeapon.getAge();
        }
    }

}
