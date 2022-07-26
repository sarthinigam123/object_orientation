package com.ultralesson.objectorientation.objects;

public class Box {
    String colour;
    int length;
    int width;
    int height;
    String type;

    public boolean isOpen(){
        if(type=="Open") return true;
        else return false;
    }

    public int getVolume(){
        return length*width*height;
    }

    public String getColour(){
        return colour;
    }
}
