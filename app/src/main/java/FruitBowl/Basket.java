package FruitBowl;

import java.util.*;

public class Basket {
    private List<Level> levels;
    private String name;

    public Basket() {
    }

    public Basket(List<Level> levels, String name) {
        this.levels = levels;
        this.name = name;
    }

    public List<Level> getLevels() {
        return this.levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Basket levels(List<Level> levels) {
        setLevels(levels);
        return this;
    }

    public Basket name(String name) {
        setName(name);
        return this;
    }



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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Basket)) {
            return false;
        }
        Basket basket = (Basket) o;
        return Objects.equals(levels, basket.levels) && Objects.equals(name, basket.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels, name);
    }

    @Override
    public String toString() {
        return "{" +
                " levels='" + getLevels() + "'" +
                ", name='" + getName() + "'" +
                "}";
    }
}
