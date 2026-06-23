package com.deep.infosys;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String word = "Java Concept of the Day";
        char[] c = word.toCharArray();

        for (int i=c.length-1;i>0;i--){
            System.out.print(c[i]);
        }


    }
}
