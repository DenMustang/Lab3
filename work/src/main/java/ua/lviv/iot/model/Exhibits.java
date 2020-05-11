package ua.lviv.iot.model;

public abstract class Exhibits {
    private String author;
    private int weightInKg;
    private String description;
    private String nameOfExhibit;
    private int measureInMm;
    private int decade;
    private int id;


    public Exhibits(String author, int weightInKg, String description, String nameOfExhibit, int measureInMm,
                    int decade) {
        this.author = author;
        this.weightInKg = weightInKg;
        this.description = description;
        this.nameOfExhibit = nameOfExhibit;
        this.measureInMm = measureInMm;
        this.decade = decade;
    }



    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }



    public int getWeightInKg() {
        return weightInKg;
    }
    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }



    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



    public String getNameOfExhibit() {
        return nameOfExhibit;
    }
    public void setNameOfExhibit(String nameOfExhibit) {
        this.nameOfExhibit = nameOfExhibit;
    }



    public int getMeasureInMm() {
        return measureInMm;
    }
    public void setMeasureInMm(int measureInMm) {
        this.measureInMm = measureInMm;
    }



    public int getDecade() { return decade; }
    public void setDecade(int decade) {
        this.decade = decade;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}
