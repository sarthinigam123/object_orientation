package com.ultralesson.objectorientation.relations;

public class Ruler {
    private double length;

    public Ruler(double length){
        this.length=length;
    }

    public void measure(double length){
        System.out.println("Measuring the object.....");
    }
}
