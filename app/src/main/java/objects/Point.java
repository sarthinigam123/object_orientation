package objects;

public class Point {
    int radius;
    String colour;

    public double getArea(){
        return 3.14*radius*radius;
    }

    public double getCircumference(){
        return 2*3.14*radius;
    }

    public String getColour(){
        return colour;
    }
}
