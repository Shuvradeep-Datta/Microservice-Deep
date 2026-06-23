package com.deep.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindKeyWithMaxValue {
    public static void main(String[] args) {
        //{"java":10, "spring":20, "aws":15}

        Map<String, Integer> integerMap = Map.of("java", 10, "spring", 20, "aws", 15);
        String key = integerMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(key);
    }
}
