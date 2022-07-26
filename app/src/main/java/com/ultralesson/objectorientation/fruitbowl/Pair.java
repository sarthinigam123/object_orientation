package com.ultralesson.objectorientation.fruitbowl;
public class Pair implements Comparable<Pair> {
    String first;
    Integer second;

    Pair(String firstValue, Integer secondValue) {
        this.first = firstValue;
        this.second = secondValue;
    }

    public String toString() {
        return "(" + this.first + ", " + this.second + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (((Pair) object).first == this.first && ((Pair) object).second == this.second && object instanceof Pair) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(first) + ":" + String.valueOf(second)).hashCode();
    }

    @Override
    public int compareTo(Pair p) {
        int f = first.compareTo(p.first);
        if (f != 0)
            return f;

        return Integer.compare(second, p.second);
    }
}