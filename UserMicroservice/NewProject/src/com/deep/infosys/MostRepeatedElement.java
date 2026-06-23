package com.deep.infosys;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pencil", "Eraser", "Note Book", "Pencil", "Pen", "Note Book", "Pencil","Pen");
        Map<String, Long> elementCountMap = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<String, Long> stringLongEntry = elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        String mostFrequentElement = stringLongEntry.getKey();
        System.out.println(mostFrequentElement);
        Long value = stringLongEntry.getValue();
        System.out.println(value);
    }
}
