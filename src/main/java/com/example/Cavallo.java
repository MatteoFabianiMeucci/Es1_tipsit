package com.example;

public class Cavallo extends Thread{
    private int corsa;
    private int numeroGara;
    private Classifica c;

    public int getCorsa() {
        return corsa;
    }

    public int getNumeroGara() {
        return numeroGara;
    }

    public Cavallo(int i, Classifica c){
        corsa = 100;
        numeroGara = i;
        this.c = c;
    }

    public void run(){
        try {
            for(int i = 0; i < corsa; i++){
                Thread.sleep((int) (Math.random() * 10));
            }
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c.add(this);
    }
}
