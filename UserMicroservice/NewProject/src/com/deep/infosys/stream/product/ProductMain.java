package com.deep.infosys.stream.product;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductMain {
    public static void main(String[] args) {
//        String s = "Java Concept of The Day";
//
//        LinkedHashMap<String, Long> collect = Arrays.stream(s.replaceAll("\\s+", "").toLowerCase().split("")).collect(Collectors.groupingBy(
//                Function.identity(),
//                LinkedHashMap::new,
//                Collectors.counting()
//        ));
//
//        String s1 = collect.entrySet().stream().filter(t -> t.getValue() > 1).map(t -> t.getKey()).findFirst().get();
//        System.out.println(s1
//        );

//        Remove null & empty strings from list

        List<String> list =new ArrayList<>();
        list.add(null);
        list.add("");
        list.add("deep");
        List<String> list1 = list.stream().filter(t->
        {
            if(t != null && !t.isEmpty()){
                return true;
            }
            return false;
        }).toList();

        List<List<String>> listOfLists = List.of(
                List.of("A", "B", "C"),
                List.of("D", "E"),
                List.of("F", "G", "H", "I")
        );

        List<String> list2 = listOfLists.stream().flatMap(List::stream).toList();
//        System.out.println(list2);

        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
//        System.out.println(sum);

//        Implement custom Collector using Collector.of()

        Collector<Object, ArrayList<Object>, ArrayList<Object>> aNew = Collector.of(ArrayList::new, List::add, (l1, l2) -> {
            l1.addAll(l2);
            return l1;
        });
//        System.out.println(aNew);



        List<Integer> numbers2 = List.of(11, 15, 21, 28, 33, 47);
        boolean b = numbers2.stream().anyMatch(t -> t % 2 == 0);
//        System.out.println(b);

        int[] numbers3 = {5, 10, 15, 20, 25, 30};

        Integer reduce = Arrays.stream(numbers3).mapToObj(t -> t).filter(t -> t % 2 == 0).map(t -> t * 2).reduce(0, (a, c) -> a + c);
//        System.out.println(reduce);


//        Create infinite stream of numbers and limit to 20

//        new Random().ints().filter(t->t>0).limit(20).forEach(System.out::println);

//        Find longest string in list

        List<String> words = List.of(
                "apple",
                "banana",
                "watermelon",
                "kiwi",
                "blueberry",
                "grape"
        );
        Comparator<String> comparing = Comparator.comparing(String::length).reversed();

        String s = words.stream().sorted(comparing).findFirst().get();
//        System.out.println(s);

        List<Integer> list3 = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list4 = List.of(4, 5, 6, 7, 8, 9);
        List<Integer> list5 = list3.stream().filter(list4::contains).toList();
//        System.out.println(list5);

        List<String> words1 = List.of("apple", "banana", "kiwi", "mango");
        Map<String, Integer> collect = words1.stream().collect(Collectors.toMap(Function.identity(),String::length));
        System.out.println(collect);


    }



}
