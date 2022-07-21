package relations;

public class Eraser {
    private String type;
    private boolean eraserOver;

    public Eraser(){
        System.out.println("Erasing the written material");
    }
    public Eraser(String type){
        this.type = type;
        System.out.println("Using a " + type + " eraser to erase");
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }


    public void canErase(boolean eraserOver){
        if(eraserOver==true){
            System.out.println("Cant erase as eraser is finished");
        }
        else{
            System.out.println("You can erase");
        }
    }
}
