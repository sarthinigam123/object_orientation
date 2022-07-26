package com.ultralesson.objectorientation.fruitbowl;

import java.util.*;

public class Basket {
    private List<Level> levels;
    private String name;

    public Basket() {
    }

    public Basket(List<Level> levels, String name) {
        this.levels = levels;
        this.name = name;
    }

    public List<Level> getLevels() {
        return this.levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Basket)) {
            return false;
        }
        Basket basket = (Basket) o;
        return Objects.equals(levels, basket.levels) && Objects.equals(name, basket.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels, name);
    }

    @Override
    public String toString() {
        return "{" +
                " levels='" + getLevels() + "'" +
                ", name='" + getName() + "'" +
                "}";
    }
}
