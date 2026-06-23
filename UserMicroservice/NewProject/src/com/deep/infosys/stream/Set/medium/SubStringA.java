package com.deep.infosys.stream.Set.medium;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SubStringA {
    public static void main(String[] args) {
        //{"java","aws","docker","kafka"}

        List<String> list = List.of("java", "aws", "docker", "kafka");

        Set<String> collect = list.stream().filter(t -> t.contains("a")).collect(Collectors.toSet());
        System.out.println(collect);


    }
}
