package com.ultralesson.objectorientation.objects;

public class Pencilbox {
    /*
    Objects - Pencil, Box, Sharpener, Ruler

    State :
    Pencil - Length, Width, Colour, Sharpened Index(if it can write or not)
    Box - Length, Width, Depth, Colour, Pencils, Sharpener, Ruler
    Sharpener - Height, Width, Hole
    Ruler - Length, Numbers

    Behaviour :
    Pencil - Sharpen , Write, Erase(guessing the eraser is attached at the top)
    Box - Store Things, Open, Close
    Sharpener - Can sharp pencils
    Ruler - Get length of things
     */

    public class Pencil{
        int length;
        int width;
        String colour;

        public boolean isSharpened(){
            return true;
        }

        public boolean canWrite(){
            return true;
        }

        public boolean canErase(){
            return false;
        }

        public String getColour(){
            return colour;
        }
    }
}
