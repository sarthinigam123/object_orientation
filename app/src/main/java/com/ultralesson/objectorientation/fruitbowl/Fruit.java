package com.ultralesson.objectorientation.fruitbowl;

import java.util.*;


public class Fruit {
    private String name;
    private String type;
    private String color;

    public Fruit(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Fruit)) {
            return false;
        }
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name) && Objects.equals(type, fruit.type) && Objects.equals(color, fruit.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, color);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", type='" + getType() + "'" +
                ", color='" + getColor() + "'" +
                "}";
    }


}