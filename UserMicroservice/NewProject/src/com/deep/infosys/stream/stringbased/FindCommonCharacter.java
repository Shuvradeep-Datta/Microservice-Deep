package com.deep.infosys.stream.stringbased;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonCharacter {
    public static void main(String[] args) {
        String str1 = "banana";

        StringBuilder builder = new StringBuilder();

        for (char a:str1.toCharArray()){
            if ("aeiou".indexOf(a)==-1){
               builder.append(a);

            }
        }

        System.out.println(builder.toString());

    }
}
