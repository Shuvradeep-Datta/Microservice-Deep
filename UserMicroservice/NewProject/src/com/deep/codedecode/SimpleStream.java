package com.deep.codedecode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SimpleStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(25);
        list.add(30);
        list.add(5);
//        for (Integer i: list){
//            if (i>=15){
//                System.out.print(i+" ");
//            }
//        }

        List<Integer> list1 = Stream.of(15, 25, 30, 5).filter(i -> i >= 15).toList();
        System.out.println(list1);
    }
}
