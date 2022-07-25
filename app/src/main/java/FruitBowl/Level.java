package FruitBowl;

import java.util.*;

public class Level {
    private List<Fruit> fruits;

    public Level() {
        this.fruits = new ArrayList<>();
    }

    public Level(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public List<Fruit> getFruits() {
        return this.fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public Level fruits(List<Fruit> fruits) {
        setFruits(fruits);
        return this;
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Level)) {
            return false;
        }
        Level level = (Level) o;
        return Objects.equals(fruits, level.fruits);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fruits);
    }

    @Override
    public String toString() {
        return "{" +
                " fruits='" + getFruits() + "'" +
                "}";
    }

}
