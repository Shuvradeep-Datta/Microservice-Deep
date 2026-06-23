package com.deep.infosys.stream.stringbased;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "Java Concept of the Day";char[] try1 = s.toCharArray();

//        for (int i=try1.length-1;i>=0;i--){
//            System.out.print(try1[i]);
//        }


//        String string = IntStream.range(0,s.length()).mapToObj(t -> s.charAt(s.length() - 1 - t)).map(String::valueOf).collect(Collectors.joining());
//        System.out.println(string);


        String collect = Arrays.stream(s.split(" ")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(collect);


    }


}
