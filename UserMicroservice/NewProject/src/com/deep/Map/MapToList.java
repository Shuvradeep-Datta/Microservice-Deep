package com.deep.Map;

import java.util.List;
import java.util.Map;

public class MapToList {
    public static void main(String[] args) {
        //{"java":10, "spring":20, "aws":15}

        Map<String, Integer> map
                = Map.of("Java", 10, "spring", 20, "aws", 15);
        List<String> listKey = map.entrySet().stream().map(t -> t.getKey()).toList();
        System.out.println(listKey);
        List<Integer> listValue = map.entrySet().stream().map(t -> t.getValue()).toList();
        System.out.println(listValue);


    }
}
