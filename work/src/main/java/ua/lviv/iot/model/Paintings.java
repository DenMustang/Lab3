package ua.lviv.iot.model;

public class Paintings extends Exhibits {
    private String styleOfPaintings;
    private String colourOfFrame;

    public Paintings(final String author, final int weightInKg, final String description, final String nameOfExhibit, final int measureInMm, final int decade, final String styleOfPaintings, final int age) {
        super(author, weightInKg, description, nameOfExhibit, measureInMm, decade, age);
        this.styleOfPaintings = styleOfPaintings;
    }


    public final String toCSV() {
        return super.toCSV() + " , " + " styleOfPainting = " + getStyleOfPaintings() + " , "
                + " colourOfFrame = " + getColourOfFrame();
    }

    public final String getHeaders() {

        return super.getHeaders() + " styleOfPainting " + " , " + " colourOfFrame ";
    }


    public final String getStyleOfPaintings() {
        return styleOfPaintings;
    }

    public final void setStyleOfPaintings(final String styleOfPaintings) {
        this.styleOfPaintings = styleOfPaintings;
    }

    public final String getColourOfFrame() {
        return colourOfFrame;
    }

    public final void setColourOfFrame(final String colourOfFrame) {
        this.colourOfFrame = colourOfFrame;
    }


}
