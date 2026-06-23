package com.deep.Map;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumValuesOfCommonKey {
    public static void main(String[] args) {
//        {"java":10, "aws":15}
//         {"java":50, "python":40}

        Map<String, Integer> integerMap1 = Map.of("java", 10, "aws", 15);
        Map<String, Integer> integerMap2 = Map.of("java", 50, "python", 40);

        Map<String, Integer> collect = Stream.concat(integerMap1.entrySet().stream(), integerMap2.entrySet().stream()).collect(Collectors.toMap(
                t -> t.getKey(), t -> t.getValue(), (a, b) -> a + b
        ));
        System.out.println(collect);

        //common keys
        Set<String> collect1 =
                integerMap1.keySet().stream().filter(integerMap2::containsKey).collect(Collectors.toSet());

        System.out.println(collect1);

    }
}
