package ua.lviv.iot.model;

public class Weapons extends Exhibits {
    private String typeOfWeapon;


    public Weapons(String author, int weightInKg, String description, String nameOfExhibit, int measureInMm,
                   int decade) {
        super(author, weightInKg, description, nameOfExhibit, measureInMm, decade);
        // TODO Auto-generated constructor stub
        this.typeOfWeapon=typeOfWeapon;
    }

    @Override
    public String toString(){
        return " author is " + this.getAuthor() + "; decade is " + this.getDecade() + "; description is " + this.getDescription() + "; name of exhibit " + this.getNameOfExhibit() + "; measure in mm " + this.getMeasureInMm() + "; weight in Kg  " + this.getWeightInKg() + "; type of weapon " + this.typeOfWeapon;
    }
}

