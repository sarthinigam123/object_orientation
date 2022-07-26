package com.ultralesson.objectorientation.relations;

public class Pen {
    private Cap cap;
    private Ink ink;
    private boolean isDried;

    public Pen(boolean isDried){
        this.isDried = isDried;
    }

    public void setCap(Cap cap){
        this.cap=cap;
    }

    public void setInk(Ink ink){
        this.ink=ink;
    }
    public boolean canWrite(boolean isDried){
        if (isDried==true ){
            return false;
        }
        else{
            return true;
        }
    }
}
