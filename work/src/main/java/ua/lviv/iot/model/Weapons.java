package ua.lviv.iot.model;

public class Weapons extends Exhibits {
    private String typeOfWeapon;


    public Weapons(String author, int weightInKg, String description, String nameOfExhibit, int measureInMm,
                   int decade) {
        super(author, weightInKg, description, nameOfExhibit, measureInMm, decade);
        // TODO Auto-generated constructor stub
        this.typeOfWeapon=typeOfWeapon;
    }

}

