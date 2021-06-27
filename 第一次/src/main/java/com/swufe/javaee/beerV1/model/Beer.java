package com.swufe.javaee.beerV1.model;

public class Beer {
    private String band;
    private int year_of_birth;
    private String country;

    public Beer(String band, int year_of_birth ,String country) {
        this.band = band;
        this.year_of_birth = year_of_birth;
        this.country=country;
    }


    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public double getYear() {
        return year_of_birth;
    }

    public void setYear(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "band='" + band + '\'' +
                ", year= " + year_of_birth +" country= "+country+
                '}';
    }
}
