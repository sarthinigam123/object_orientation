package com.ultralesson.objectorientation.relations;

public class Bicycle {
    private Wheels wheels;
    private Brakes brakes;
    private Pedals pedals;
    private Handle handle;

    public Bicycle(){
        this.wheels=wheels;
        this.brakes=brakes;
        this.pedals=pedals;
        this.handle=handle;
    }

    public void setWheels(Wheels wheels){
        this.wheels = wheels;
    }
}
