package com.deep.infosys.stream.integerList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CumulativeSum {
    public static void main(String[] args) {
        //Atomic Way
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        AtomicInteger runnig = new AtomicInteger(0);

        List<Integer> list1 = list.stream().map(a -> runnig.addAndGet(a)).toList();
        System.out.println(list1);

        //reduce
        List<Integer> list2 =new ArrayList<>();
        list.stream().reduce(0,(sum,n)->{
            int newSum = sum+n;
            list2.add(newSum);
            return newSum;

        });
        System.out.println(list2);
    }
}
