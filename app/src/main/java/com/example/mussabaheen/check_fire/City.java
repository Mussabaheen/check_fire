package com.example.mussabaheen.check_fire;

import java.util.List;

public class City {
    private String name;
    private String country;
    private String image;
    private String [] Gallery;
    private double[] Location;
    private String Description;
    private String Classification;
    private String access;
    private List<String> regions;

    public City() {}

    public City(String name, String country, double[] Location, String image,String access,String Description,String[] Gallery,String classification) {
            this.name = name;
            this.country=country;
            this.Gallery=Gallery;
            this.Description=Description;
    }


    public String getName() {
        return name;
    }


    public String getCountry() {
        return country;
    }

    public double[] getLocation() {
        return Location;
    }



    public String imag()
    {
        return image;
    }
    public String Descript()
    {
        return Description;
    }
    public String[] getgallery()
    {
        return Gallery;
    }
    public String getClassification()
    {
        return Classification;
    }
    public String getaccesiblity(){
        return access;
    }



}
