package com.deep.infosys.stream.stringbased;

public class CountSpecialCharacter {
    public static void main(String[] args) {
        //Count special characters in a string

        String str = "java@123$#";

        long count = str.chars().filter(t -> !Character.isLetterOrDigit(t)).filter(i -> !Character.isLetterOrDigit(i)).count();
        System.out.println(count);
        int count1=0;

        for (char a:str.toCharArray()){
            if (!Character.isLetterOrDigit(a) && !Character.isWhitespace(a)){
                count1++;
            }
        }

        System.out.println(count1);

    }
}
