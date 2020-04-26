package ua.lviv.iot.model;

public class Paintings extends Exhibits {
    private String styleOfPaintings;
    private String colourOfFrame;

    public Paintings(String author, int weightInKg, String description, String nameOfExhibit, int measureInMm,
                     int decade, String styleOfPaintings, int age) {
        super(author, weightInKg, description, nameOfExhibit, measureInMm, decade, age);
        this.styleOfPaintings = styleOfPaintings;
    }

    public final String getStyleOfPaintings() {
        return styleOfPaintings;
    }

    public final void setStyleOfPaintings(String styleOfPaintings) {
        this.styleOfPaintings = styleOfPaintings;
    }

    public final String getColourOfFrame() {
        return colourOfFrame;
    }

    public final void setColourOfFrame(String colourOfFrame) {
        this.colourOfFrame = colourOfFrame;
    }
}