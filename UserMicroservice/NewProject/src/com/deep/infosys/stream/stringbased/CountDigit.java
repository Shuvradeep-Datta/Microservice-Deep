package com.deep.infosys.stream.stringbased;

import java.util.stream.IntStream;

public class CountDigit {
    public static void main(String[] args) {
        String str = "98Java2324";
//        int count =0;

//        for (char a: str.toLowerCase().toCharArray()){
//            if(Character.isDigit(a)){
//                count++;
//            }
//        }
//        System.out.println(count);


        //Stream based
        long count1 = IntStream.range(0, str.length()).filter(t -> Character.isDigit(str.charAt(t))).map(Character::charCount).count();
        System.out.println(count1);
    }
}
