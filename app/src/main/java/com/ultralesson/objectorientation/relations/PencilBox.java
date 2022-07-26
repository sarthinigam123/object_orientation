package com.ultralesson.objectorientation.relations;

public class PencilBox {
    private double length;
    private double width;
    private double depth;

    private Pencil pencil;
    private Sharpener sharpener;
    private Eraser eraser;
    private Ruler ruler;

    public PencilBox(double length, double width,double depth){
        this.length= length;
        this.width = width;
        this.depth = depth;

        this.pencil = new Pencil(10,"2B","Black",true);
        this.sharpener = new Sharpener("Red");
        this.eraser = new Eraser("Long");
        this.ruler = new Ruler(15);
    }

    public void setLength(double length){
        this.length=length;
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double getWidth(){
        return width;
    }

    public double getPencilBoxVolume(){
        return length*width*depth;
    }

    public Pencil getPencil(){
        return pencil;
    }

    public void setPencil(Pencil pencil){
        this.pencil=pencil;
    }

    public Sharpener getSharpener(){
        return sharpener;
    }

    public Eraser getEraser(){
        return eraser;
    }

    public Ruler getRuler(){
        return ruler;
    }
}
