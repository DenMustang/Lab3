package ua.lviv.iot.model;

public class Sculptures extends Exhibits {
    private String materialOfSculptures;

    public Sculptures(String author, int weightInKg, String description, String nameOfExhibit, int measureInMm,
                      int decade) {
        super(author, weightInKg, description, nameOfExhibit, measureInMm, decade);
        // TODO Auto-generated constructor stub
        this.materialOfSculptures = materialOfSculptures;
    }


}

