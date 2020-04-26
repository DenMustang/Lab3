package ua.lviv.iot.manager;

import java.util.ArrayList;

import ua.lviv.iot.model.Exhibits;

public class NewExhibitManager {
    private ArrayList<Exhibits> assortment = new ArrayList<Exhibits>();

    public final void addToAssortment(final Exhibits... exhibitsToAdd) {
        for (Exhibits exhibits : exhibitsToAdd) {
            this.assortment.add(exhibits);
        }
    }

    public final void removeFromAssortment(final Exhibits... exhibitsToRemove) {
        for (Exhibits exhibits : exhibitsToRemove) {
            this.assortment.remove(exhibits);
        }
    }

    public final void displayAssortmentInfo() {
        for (Exhibits exhibits : this.assortment) {
            System.out.println(exhibits);
        }
    }


}
