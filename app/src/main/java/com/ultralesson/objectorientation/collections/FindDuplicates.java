package com.ultralesson.objectorientation.collections;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1,55,666,43434,11212,11323, 55,22,33,546,64342,232,5432,2444,113,333,666,4533,232};
        HashSet<Integer> set = new HashSet<>();
        for(int num : numbers){
            if(set.add(num)){
                continue;
            }
            else{
                System.out.println("Duplicate number that is added is " + num);
            }
        }
        System.out.println(set);
    }
}
