package com.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Classifica cl = new Classifica();
        Gara g = new Gara();
        for (int i = 0; i < 20; i++){
            Cavallo c = new Cavallo(i+1, cl);
            c.start();
            g.add(c);
        }

        for(int i = 0; i < 20; i++){
            g.get(i).join();
        }

        cl.stampaClassifica();
    }
}
/* 
Scrivere un programma in Java che simuli una corsa di cavalli.
Ogni cavallo è rappresentato da un Thread.
Alla fine della corsa (quando è terminata l'esecuzione di ogni thread), il "main" deve stampare la classifica di arrivo.

Nel dettaglio il main si occuperà di:

- Instanziare 20 threads di tipo Cavallo
- Avviare i 20 threads
- Attendere che i 20 threads terminino la loro esecuzione (metodo join())
- Stampare la classifica finale

Per rendere più verosimile la gara è possibile simulare un ritardo nel ciclo all'interno del metodo run() del thread Cavallo con la seguente istruzione:
Thread.sleep((int) (Math.random() * 1000));

Consegnare il link al repo su github.
*/