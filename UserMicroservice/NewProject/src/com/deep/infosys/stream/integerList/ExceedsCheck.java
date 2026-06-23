package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;

public class ExceedsCheck {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30);
        int X =50;
        boolean b = list.stream().allMatch(n -> n <= 50);
        System.out.println(b);

    }
}
