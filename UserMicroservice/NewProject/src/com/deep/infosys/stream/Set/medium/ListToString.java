package com.deep.infosys.stream.Set.medium;

import java.util.List;
import java.util.stream.Collectors;

public class ListToString {
    public static void main(String[] args) {
        //{"java","aws","docker"}
        List<String> list = List.of("java","aws","docker");
        String collect = list.stream().collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
