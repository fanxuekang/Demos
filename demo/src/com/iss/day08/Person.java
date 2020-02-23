package com.iss.day08;

import java.util.Objects;

public class Person implements Comparable{
    private String name;
    private long id_card;


    @Override
    public int compareTo(Object o) {
        Person person = (Person)o;
        int reasult = id_card > person.id_card?1:(id_card == person.id_card ? 0:-1);
        return reasult;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id_card == person.id_card &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id_card);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId_card() {
        return id_card;
    }

    public void setId_card(long id_card) {
        this.id_card = id_card;
    }

    public Person(String name, long id_card) {
        this.name = name;
        this.id_card = id_card;
    }
}
