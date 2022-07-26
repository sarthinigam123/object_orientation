package com.ultralesson.objectorientation.objects;

public class GeometricShapes {
    int rectLength;
    int rectBreadth;
    int circleRadius;
    int triangleHeight;
    int sqSide;

    public int getSquareArea(){
        return sqSide*sqSide;
    }

    public int getRectArea() {
        return rectBreadth*rectLength;
    }

    public double getCircleArea(){
        return 2*3.14*circleRadius;
    }
}
