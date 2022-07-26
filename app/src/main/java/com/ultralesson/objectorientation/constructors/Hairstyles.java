package com.ultralesson.objectorientation.constructors;

public class Hairstyles {
    private String colour;
    private String style;

    public Hairstyles(){
        this.colour="Black";
        this.style="Fade";
    }
    public String getHairstyle() {
        return style;
    }

    public void setHairstyle(String style) {
        this.style = style;
    }

    public String getHaircolor() {
        return colour;
    }

    public void setHaircolor(String colour) {
        this.colour = colour;
    }
     public Hairstyles(String colour, String style){
        if(colour.length()!= 0 ){
            this.colour = colour;
        }
        else{
            this.colour= "Black";
        }

        if(style.length()!=0){
            this.style = style;
        }
        else{
            this.style = "Fade";
        }
     }
}
