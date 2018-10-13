package com.example.mussabaheen.check_fire;

import java.util.ArrayList;

public class notedata {
    private ArrayList<String> saif;
    notedata(){}
    notedata(ArrayList<String> saif){
        this.saif=saif;
    }

    public ArrayList<String> getSaif() {
        return saif;
    }

    public void setSaif(ArrayList<String> saif) {
        this.saif = saif;
    }
}
