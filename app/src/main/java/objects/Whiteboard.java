package objects;

public class Whiteboard {
    String state;
    int length;
    int breadth;

    public boolean isClear(){
        if(state=="Clear")return true;
        else return false;
    }

    public int getArea(){
        return length*breadth;
    }
}
