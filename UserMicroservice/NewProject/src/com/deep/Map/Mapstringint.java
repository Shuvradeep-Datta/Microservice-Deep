package com.deep.Map;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapstringint {
    public static void main(String[] args) {
//        "java:10,spring:20,aws:15"
        String str = "java:10,spring:20,aws:15";
        String[] split = str.split(",");
        Map<String, String> collect = Arrays.stream(split).map(pair -> pair.split(":")).collect(Collectors.toMap(
                arr -> arr[0],
                arr -> arr[1]
        ));
        System.out.println(collect);
        
        String s="Deep";
        System.out.println(s.hashCode());
        s =s+"Deep";
        System.out.println(s.hashCode());

        StringBuffer s1= new StringBuffer("Deep");
        System.out.println(s1.hashCode());


        System.out.println(s1.hashCode());

    }
}
