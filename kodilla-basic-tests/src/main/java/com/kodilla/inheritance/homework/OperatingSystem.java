package com.kodilla.inheritance.homework;
public class OperatingSystem {
    private int year;
    private int ram;
    private int version;



    public OperatingSystem(int year,int ram,int version) {
        this.year = year;
        this.ram = ram;
        this.version = version;
    }
    public void turnOn() {
        System.out.println("Turn ON");

    }

    public void turnOf(){
        System.out.println("Turn Off");
    }

        public int getYear() {
            return year;
        }

        public int getRam() {
            return ram;
        }

        public int getVersion() {
            return version;
        }


        public void displayProduct() {
            System.out.println("Product" + ram);
        }
}
// nie miałem możliwości stworzenia gradle build
// nie miałem możliwości stworzenia nowego package com.kodilla.inheritance.homework

