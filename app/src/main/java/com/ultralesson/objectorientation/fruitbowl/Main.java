package com.ultralesson.objectorientation.fruitbowl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception  {
        List<Level> levelsList = new ArrayList<>();
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Orange","Big","orange"));
        fruitList.add(new Fruit("Apple","Medium","red"));
        fruitList.add(new Fruit("Banana","Small","yellow"));
        fruitList.add(new Fruit("Banana","Big","yellow"));
        fruitList.add(new Fruit("Orange","Big","orange"));
        fruitList.add(new Fruit("Orange","Big","orange"));
        levelsList.add(new Level(fruitList));

        Basket smallBasket = new Basket(levelsList,"Small Basket");

        //TODO: Avoid creating level's manually, deduce them using the distinct(by color,type,name) fruits in the basket.
        List<Level> multipleLevelsList = new ArrayList<>();
        multipleLevelsList.add(new Level());
        multipleLevelsList.add(new Level());
        Basket bigBasket = new Basket(multipleLevelsList,"Big Basket");

        bigBasket.segregateFruits(fruitList,"color");
        System.out.println(bigBasket);


        List<Fruit> fruits = new LinkedList<>();
        fruitList.add(new Fruit("Orange","Big","orange"));
        fruitList.add(new Fruit("Apple","Medium","red"));
        fruitList.add(new Fruit("Banana","Small","yellow"));
        fruitList.add(new Fruit("Banana","Big","yellow"));
        fruitList.add(new Fruit("Orange","Big","orange"));
        fruitList.add(new Fruit("Orange","Big","orange"));

        Bowl bowl = new Bowl(fruits);

        LayerIdentifier layerIdentifier = new LayerIdentifier(bowl);
        int layerCount = layerIdentifier.getLayerCount();

        MultiLayerBowl multiLayerBowl = new MultiLayerBowl(layerCount);

        FruitSegregator fruitSegregator = new FruitSegregator(bowl, multiLayerBowl);

        fruitSegregator.segregateByName();


    }
}
