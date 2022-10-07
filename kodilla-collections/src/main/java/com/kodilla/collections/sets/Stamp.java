package com.kodilla.collections.sets;


import java.util.Objects;

public class Stamp {

    public String name;
    public double width;
    public double height;
    public boolean stamped; // ostemplowany

    public Stamp(String name, double width, double height, boolean stamped) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.stamped = stamped;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean Stamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0 &&
                Double.compare(stamp.height, height) == 0 &&
                stamped == stamp.stamped &&
                Objects.equals(name, stamp.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, width, height, stamped);
    }
    @Override
    public String toString() {
        return "Znaczek" +
                " nazwa='" + name + '\'' + " szerokość=" + width +
                ", wyskość=" + height + ", ostemplowany=" + stamped
                ;
    }
}
