package com.ultralesson.objectorientation.constructors;

public class Apples {
    private String type;
    private String taste;

    public Apples(){
        this.type= "Fuji";
        this.taste="Sweet";
    }

    public Apples(String type, String taste){
        if(type.length()!= 0 ){
            this.type = type;
        }
        else{
            this.type= "Granny Smith";
        }

        if(taste.length()!=0){
            this.taste = taste;
        }
        else{
            this.taste = "Tart";
        }
    }
}
