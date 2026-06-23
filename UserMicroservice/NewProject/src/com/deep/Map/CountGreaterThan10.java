package com.deep.Map;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountGreaterThan10 {
    public static void main(String[] args) {
        //{"java":10, "spring":20, "aws":15}
        Map<String, Integer> integerMap = Map.of("java", 10, "spring", 20, "aws", 15);
        long a =  integerMap.entrySet().stream().filter(t -> t.getValue() > 10).map(t->t.getKey()).count();
        System.out.println(a);

    }
}
