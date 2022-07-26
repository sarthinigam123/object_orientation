package com.ultralesson.objectorientation.relations;

public class Pencil {
    private int length;
    private String type;
    private String colour;
    private boolean isSharpened;

    public Pencil(int length, String type, String colour,boolean isSharpened){
        this.length=length;
        this.type = type;
        this.colour = colour;
        this.isSharpened=isSharpened;
    }

    public void write(){
        System.out.println("Using pencil to write");
    }
    public void setLength(int length){
        this.length=length;
    }
    public int getLength(){
        return length;
    }

    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }

    public void setColour(String colour){
        this.colour=colour;
    }
    public String getColour(){
        return colour;
    }

    public void setIsSharpened(boolean isSharpened){
        this.isSharpened= isSharpened;
    }

    public void canWrite(boolean isSharpened,int length){
        if(isSharpened==true && length > 0){
            System.out.println("You can write");
        }
        else{
            System.out.println("You cant write");
        }
    }

}
