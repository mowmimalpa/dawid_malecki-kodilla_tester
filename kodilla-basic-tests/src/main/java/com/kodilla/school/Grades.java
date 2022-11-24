package com.kodilla.school;

public class Grades {

    //private int[] values;
    //private int size;

    //public Grades() {
        //this.size = 0;
        //this.values = new int[0];
    //}

    //public void add(int value) {
        //this.size++; // zwiekszamy o 1
        //int[] newTab = new int[this.size]; //pusta tablica z nowym rozmiarem
        //System.arraycopy(values, 0, newTab, 0, values.length);
        //kopiuje tablice źródłową do tablicy docelowej,zachowując układ elementów
        //newTab[this.size - 1] = value;

        //nowa wartość do ostatniego elementu w tablicy
        //this.values = newTab;
        // przypisanie nowo utworzonej tablicy do tablicy przechowywanej w klasie
    //}

    //public int[] getValues() {
        //return values;
    //}
//}

    private int[] values;
    private int size;

    public Grades() {
        this.size = 0;
        this.values = new int[0];
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }
    public double getAverage() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum/this.values.length;
    }


    public int[] getValues() {
        return values;
    }
}