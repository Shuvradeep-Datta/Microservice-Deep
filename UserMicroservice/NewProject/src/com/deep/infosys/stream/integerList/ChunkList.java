package com.deep.infosys.stream.integerList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChunkList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<List<Integer>> chunks = new ArrayList<>();

        for (int i=0;i<numbers.size();i=i+3){
            chunks.add(numbers.subList(i,Math.min(i+3,numbers.size())));
        }
        System.out.println(chunks);
    }
}
