package com.deep.infosys.stream.stringbased;

import java.util.stream.IntStream;

public class CountOccurenceOfSub {
    public static void main(String[] args) {

        String str = "banananana";
        String sub = "ana";

        int index =0;
        int count=0;
        int position = str.indexOf(sub,index);

        while ((position!=-1)){
            count++;
            index++;
        }

        System.out.println(count);

    }
}
