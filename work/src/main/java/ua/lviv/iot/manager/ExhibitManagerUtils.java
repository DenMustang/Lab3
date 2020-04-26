package ua.lviv.iot.manager;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.model.Exhibits;
import ua.lviv.iot.model.SortType;
import ua.lviv.iot.model.Weapons;

public class ExhibitManagerUtils {

    private Comparator<Weapons> compareByAuthor = new Comparator<Weapons>() {
        @Override
        public int compare(
                final Weapons firstWeapon, final Weapons secondWeapon) {
            return firstWeapon.getAuthor().compareTo(secondWeapon.getAuthor());

        }
    };

    public static void sortWeaponsByTime(
            final List<Weapons> arsenal, final SortType sortType) {
        System.out.println("called 'sortWeaponsByTime' func");
        if (sortType == SortType.ASCENDING) {
            arsenal.sort(Comparator.comparing(Exhibits::getDecade));
        } else if (sortType == SortType.DESCENDING) {
            arsenal.sort(
                    Comparator.comparing(Exhibits::getDecade).reversed());
        } else {
            System.out.println("error");
        }
    }

    public static void sortWeaponsByAge(
            final List<Weapons> arsenal, final SortType sortType) {
        System.out.println("called 'sortWeaponsByAge' func");
        if (sortType == SortType.ASCENDING) {
            arsenal.sort(Comparator.comparing(Weapons::getAge));
        } else if (sortType == SortType.DESCENDING) {
            arsenal.sort(
                    Comparator.comparing(Weapons::getAge).reversed());
        } else {
            System.out.println("error");
        }
    }

    public final Comparator<Weapons> getCompareByAuthor() {
        return compareByAuthor;
    }

    public final void setCompareByAuthor(
            final Comparator<Weapons> compareViaAuthor) {
        this.compareByAuthor = compareViaAuthor;
    }

    static class WeaponsInArsenalSortedByDecade implements Comparator<Weapons> {
        @Override
        public int compare(
                final Weapons firstWeapon, final Weapons secondWeapon) {
            return firstWeapon.getDecade()
                    - secondWeapon.getDecade();
        }
    }

    static class WeaponsInArsenalSortedByAge implements Comparator<Weapons> {
        @Override
        public int compare(
                final Weapons firstWeapon, final Weapons secondWeapon) {
            return (int) (
                    firstWeapon.getAge() - secondWeapon.getAge());
        }
    }


}

