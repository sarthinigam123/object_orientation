package com.ultralesson.objectorientation.inheritance;

public class Dogs extends Animals{
    private String breed;
    private String colour;

    public Dogs(String species, String biologicalName){
        super(species, biologicalName, "Dog");
        this.breed = "Labrador";
        this.colour="Black";
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setColour(String colour){
        this.colour=colour;
    }

    public String getBreed(){
        return breed;
    }
}
