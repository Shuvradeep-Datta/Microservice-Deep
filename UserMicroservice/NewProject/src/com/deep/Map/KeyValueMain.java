package com.deep.Map;

import java.util.List;
import java.util.Map;

public class KeyValueMain {
    public static void main(String[] args) {
        //{"java":10, "aws":15}
        Map<String, Integer> integerMap = Map.of("java", 10, "aws", 15);

        List<KeyValue> list = integerMap.entrySet().stream().map(e->new KeyValue(e.getKey(),e.getValue())).toList();
        System.out.println(list);


    }
}
