package com.deep.infosys.stream.stringbased;

public class RotationCheck {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";

        boolean rotation = (str1.length() ==str2.length()) && (str1+str1).contains(str2);
        System.out.println(rotation);
    }
}
