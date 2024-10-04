package com.example;
import java.util.ArrayList;

public class Gara{
    private ArrayList<Cavallo> listaCavalli;

    public Gara(){
        listaCavalli = new ArrayList();
    }

    public void add(Cavallo c){
        listaCavalli.add(c);
    }

    public Cavallo get(int i){
        return listaCavalli.get(i);
    }
}
