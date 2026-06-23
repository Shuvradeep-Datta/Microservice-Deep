package com.deep.practice;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class HashMapClass {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        list.add(14);
        list.add(15);
        list.add(17);

        for (
                Integer l:list
        ){
            list.remove(1);
        }

        System.out.println(list);


    }
}
