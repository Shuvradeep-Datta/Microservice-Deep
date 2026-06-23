package com.deep.infosys.stream.Set.advance;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SetToMap1 {
    public static void main(String[] args) {
        //{"java":10, "aws":20}
        Map<String, Integer> integerMap = Map.of("java", 10, "aws", 20);
        Set<Map.Entry<String, Integer>> entries = integerMap.entrySet();

        Map<String, Integer> collect = entries.stream().collect(Collectors.toMap(
                t -> t.getKey(),
                t -> t.getValue()
        ));
        System.out.println(collect);
    }
}
