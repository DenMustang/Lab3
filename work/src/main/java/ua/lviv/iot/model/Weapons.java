package ua.lviv.iot.model;

public class Weapons extends Exhibits {
    private String typeOfWeapon;

    public Weapons(String author, int weightInKg, String description, String nameOfExhibit, int measureInMm,
                   int decade, String typeOfWeapon, int age) {
        super(author, weightInKg, description, nameOfExhibit, measureInMm, decade, age);
        this.typeOfWeapon = typeOfWeapon;
    }

    public final String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public final void setTypeOfWeapon(final String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public final String toCSV() {
        return super.toCSV() + "," + " typeOfWeapon = " + getTypeOfWeapon();
    }

    @Override
    public String toString() {
        return " author is " + this.getAuthor() + "; decade is " + this.getDecade() + "; description is " + this.getDescription() + "; name of exhibit " + this.getNameOfExhibit() + "; measure in mm " + this.getMeasureInMm() + "; weight in Kg  " + this.getWeightInKg() + "; type of weapon " + this.typeOfWeapon;
    }

}

