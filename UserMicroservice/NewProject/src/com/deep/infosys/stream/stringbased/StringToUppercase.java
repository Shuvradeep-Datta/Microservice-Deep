package com.deep.infosys.stream.stringbased;

import java.util.stream.Collectors;

public class StringToUppercase {
    public static void main(String[] args) {

        String str = "java Concept Of The Day";

        StringBuilder sb = new StringBuilder();


        for(char i:str.toCharArray()){
            if (i>='a' && i<='z'){
                sb.append((char) (i-32));
            }else {
                sb.append(i);
            }
        }

        System.out.println(sb);


        String collect = str.chars().map(c -> (c >= 'a' && c <= 'z') ? (c - 32) : c).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(collect);
    }
}
