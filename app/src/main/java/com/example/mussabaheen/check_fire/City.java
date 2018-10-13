package com.example.mussabaheen.check_fire;

import java.util.ArrayList;

public class City {


        int check=0;
        private String name;
        private ArrayList<String> array1;
        private String state;
        private String country;
        private boolean capital;
        private long population;


        public City() {}

        public City(String name, String state, String country, boolean capital, long population, ArrayList<String> array1){
            this.name=name;
            this.state=state;
            this.country=country;
            this.capital=capital;
            this.population=population;
            this.array1=array1;
            // ...
        }

        public String getName() {
            return name;
        }

        public String getState() {
            return state;
        }

        public String getCountry() {
            return country;
        }

        public boolean isCapital() {
            return capital;
        }

        public long getPopulation() {
            return population;
        }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getArray1() {
        return array1;
    }

    public void setArray1(ArrayList<String> array1) {
        this.array1 = array1;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
