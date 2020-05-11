package ua.lviv.iot.model;

import javax.persistence.Entity;


@Entity
public class Weapons extends Exhibits {

    private String typeOfWeapon;

    public Weapons(final String author, final int weightInKg, final String description, final String nameOfExhibit, final int measureInMm, final int decade, final String typeOfWeapon, final int age) {
        super(author, weightInKg, description, nameOfExhibit, measureInMm, decade, age);
        this.typeOfWeapon = typeOfWeapon;
    }



    //toCSV
    public final String toCSV() {
        return super.toCSV() + " , " + " typeOfWeapon = " + getTypeOfWeapon();
    }
    //getHeaders
    public final String getHeaders() {
        return super.getHeaders() + " , " + " typeOfWeapon ";
    }


    //setters x getters
    public final String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public final void setTypeOfWeapon(final String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    @Override
    public String toString() {
        return " author is " + this.getAuthor() + " ; decade is " + this.getDecade() + " ; description is " + this.getDescription() + " ; name of exhibit " + this.getNameOfExhibit() + " ; measure in mm " + this.getMeasureInMm() + " ; weight in Kg  " + this.getWeightInKg() + " ; type of weapon " + this.typeOfWeapon;
    }

    public Weapons(String author, int weightInKg, String description, String nameOfExhibit, int measureInMm, int decade, int age) {
        super(author, weightInKg, description, nameOfExhibit, measureInMm, decade, age);
    }

    public Weapons() {
        super();
    }


}

