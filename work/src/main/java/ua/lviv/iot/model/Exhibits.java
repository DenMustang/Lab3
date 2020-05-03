package ua.lviv.iot.model;

public abstract class Exhibits {
    private String author;
    private int weightInKg;
    private String description;
    private String nameOfExhibit;
    private int measureInMm;
    private int decade;
    private int age;

    public Exhibits(String author, int weightInKg, String description, String nameOfExhibit, int measureInMm, int decade, int age) {
        this.author = author;
        this.weightInKg = weightInKg;
        this.description = description;
        this.nameOfExhibit = nameOfExhibit;
        this.measureInMm = measureInMm;
        this.decade = decade;
        this.age = age;
    }


    public String toCSV() {
        return "author = " + getAuthor() + ","
                + " weightInKg = " + getWeightInKg() + ","
                + " nameOfExhibit = " + getNameOfExhibit() + ","
                + " decade = " + getDecade() + ","
                + " age = " + getAge() ;
    }

    public final String getAuthor() {
        return author;
    }

    public final void setAuthor(String author) {
        this.author = author;
    }

    public final int getWeightInKg() {
        return weightInKg;
    }

    public final void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(String description) {
        this.description = description;
    }

    public final String getNameOfExhibit() {
        return nameOfExhibit;
    }

    public final void setNameOfExhibit(String nameOfExhibit) {
        this.nameOfExhibit = nameOfExhibit;
    }

    public final int getMeasureInMm() {
        return measureInMm;
    }

    public final void setMeasureInMm(int measureInMm) {
        this.measureInMm = measureInMm;
    }

    public final int getDecade() {
        return decade;
    }

    public final void setDecade(int decade) {
        this.decade = decade;
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        this.age = age;
    }


}