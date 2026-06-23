package com.deep.Map;

import java.util.List;
import java.util.Map;

public class ListString {
    public static void main(String[] args) {
        //{"java":10, "spring":20}

        Map<String, Integer> integerMap = Map.of("java", 10, "spring", 20);

        List<String> list = integerMap.entrySet().stream().map(t -> t.getKey() + " = " + t.getValue()).toList();
        System.out.println(list);

    }
}
