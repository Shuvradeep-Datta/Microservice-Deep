package com.deep.infosys.stream.ArrayBased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoArray {
    public static void main(String[] args) {
        //Input 1: {"java", "aws", "docker"}
        //Input 2: {"aws", "kafka", "java"}

        String[] str1 = {"java", "aws", "docker"};
                String str2[] = {"aws", "kafka", "java"};

        List<String> list = Stream.concat(Arrays.stream(str1), Arrays.stream(str2)).distinct().toList();
        System.out.println(list);


    }
}
