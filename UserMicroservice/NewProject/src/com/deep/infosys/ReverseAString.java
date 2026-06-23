package com.deep.infosys;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Java Concept Of the Day";

        char[] try1 = str.toCharArray();

        for (int i =try1.length-1;i>=0;i--){
            System.out.print(try1[i]);
        }
    }
}
