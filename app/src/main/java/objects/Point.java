package objects;

public class Point {
    int xcoordinate;
    int ycoordinate;
    String colour;

    public void getCooridnates(){
        System.out.println("x coordinate is " + xcoordinate + " and  y coordinate is " + ycoordinate);
    }

    public String getColour(){
        return colour;
    }
}
