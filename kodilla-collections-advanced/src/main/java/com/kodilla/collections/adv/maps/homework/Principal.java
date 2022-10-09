package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String name;
    private String surname;

    public Principal(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(name, principal.name) &&
                Objects.equals(surname, principal.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}

