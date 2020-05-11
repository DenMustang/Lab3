package ua.lviv.iot.model;

public abstract class Exhibits {
    private String author;
    private int weightInKg;
    private String description;
    private String nameOfExhibit;
    private int measureInMm;
    private int decade;
    private int age;
    private int id;

    public Exhibits(final String author, final int weightInKg, final String description, final String nameOfExhibit, final int measureInMm, final int decade, final int age) {
        this.author = author;
        this.weightInKg = weightInKg;
        this.description = description;
        this.nameOfExhibit = nameOfExhibit;
        this.measureInMm = measureInMm;
        this.decade = decade;
        this.age = age;
    }


    public String toCSV() {
        return "author = " + getAuthor() + " , "
                + " weightInKg = " + getWeightInKg() + " , "
                + " nameOfExhibit = " + getNameOfExhibit() + " , "
                + " decade = " + getDecade() + " , "
                + " age = " + getAge();
    }

    public String getHeaders() {
        return " author " + " , " + " weightInKg " + " , " + " nameOfExhibit" + " , " + " decade " + " , " + " age ";
    }

    public final String getAuthor() {
        return author;
    }
    public final void setAuthor(final String author) {
        this.author = author;
    }

    public final int getWeightInKg() {
        return weightInKg;
    }
    public final void setWeightInKg(final int weightInKg) {
        this.weightInKg = weightInKg;
    }

    public final String getDescription() {
        return description;
    }
    public final void setDescription(final String description) {
        this.description = description;
    }

    public final String getNameOfExhibit() {
        return nameOfExhibit;
    }
    public final void setNameOfExhibit(final String nameOfExhibit) {
        this.nameOfExhibit = nameOfExhibit;
    }


    public final int getMeasureInMm() {
        return measureInMm;
    }
    public final void setMeasureInMm(final int measureInMm) {
        this.measureInMm = measureInMm;
    }


    public final int getDecade() {
        return decade;
    }
    public final void setDecade(final int decade) {
        this.decade = decade;
    }


    public final int getAge() {
        return age;
    }
    public final void setAge(final int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
