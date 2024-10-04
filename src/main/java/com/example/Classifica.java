package com.example;
import java.util.ArrayList;

public class Classifica {
    private ArrayList<Cavallo> classifica;

    public Classifica(){
        classifica = new ArrayList();
    }

    public void add(Cavallo c){
        classifica.add(c);
    }

    public void stampaClassifica(){
        for(int i = 0; i < classifica.size(); i++){
            System.out.println("Posizione " + (i + 1) + ": " + "Cavallo n." + classifica.get(i).getNumeroGara());
        }
    } 
}
