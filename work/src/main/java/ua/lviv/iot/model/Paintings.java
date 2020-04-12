package ua.lviv.iot.model;
public class Paintings extends Exhibits{
    private String styleOfPaintings;

    public Paintings(String author, int weightInKg, String description, String nameOfExhibit, int measureInMm,
                     int decade) {
        super(author, weightInKg, description, nameOfExhibit, measureInMm, decade);
        // TODO Auto-generated constructor stub
        this.styleOfPaintings=styleOfPaintings;
    }


}