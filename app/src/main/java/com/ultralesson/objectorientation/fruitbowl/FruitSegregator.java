package com.ultralesson.objectorientation.fruitbowl;

import java.util.*;

public class FruitSegregator {


    public FruitSegregator(Bowl bowl, MultiLayerBowl bowl) {

    }


    public void segregateByName() {

    }

    public void segregateByColor() {

    }

    public void segregateByType() {

    }

    //TODO: Refactor below method to do one specific function at a time.
    public void segregateFruits(List<Fruit> fruits, String key) throws Exception {
        Map<String, Integer> fruitKeyMap = new HashMap<>();
        for(Fruit fruit: fruits)
            fruitKeyMap.put(key=="colour"?fruit.getColor(): fruit.getType(), fruitKeyMap.getOrDefault(key=="colour"?fruit.getColor(): fruit.getType(), 0) + 1);

        List<Pair> fruitMapList = new ArrayList<>();
        for (Map.Entry<String,Integer> fruitEntry : fruitKeyMap.entrySet()) {
            String fruitKey = fruitEntry.getKey();
            int fruitCount = fruitEntry.getValue();
            Pair fruitCountByKey = new Pair(fruitKey, fruitCount);
            fruitMapList.add(fruitCountByKey);
        }

        Collections.sort(fruitMapList, new Comparator<Pair>() {
            @Override
            public int compare(final Pair o1, final Pair o2) {
                if (o1.second > o2.second) {
                    return -1;
                } else if (o1.second.equals(o2.second)) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        // ORAGE -> 15 RED- >6 GREEN -3  -- WHITE -2
        //list could be empty
        for(int i=0;i<levels.size();i++){
            for(Fruit fruit : fruits){
                if(fruitMapList.get(i).first==(key=="colour"?fruit.getColor(): fruit.getType())){
                    levels.get(i).getFruits().add(fruit);
                }
            }
        }
    }

    //segregate fruits by colour

    //segregate fruits by size

    //segregate fruits by name
}
