package com.deep.infosys.stream.stringbased;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String str = "WOW";
        String originalString = str.toLowerCase();

        //Stream Based
//        String reversed = IntStream.range(0,originalString.length()).mapToObj(c-> originalString.charAt(originalString.length()-1-c)).map(String::valueOf).collect(Collectors.joining());
//
//        boolean isPalindrome = str.equalsIgnoreCase(reversed);
//        System.out.println(isPalindrome);

        //One line changes
//        boolean isPalindrome = originalString.equalsIgnoreCase(new StringBuilder(originalString).reverse().toString());
//        System.out.println(isPalindrome);


        //Logical beyond java8

        int left =0, right = originalString.length()-1;
        boolean isPalindrome = true;

        while (left<right){
            if (originalString.charAt(left) != originalString.charAt(right)){
                isPalindrome = false;
                break;
            }


            left++;
            right--;
        }

        System.out.println(isPalindrome);

    }
}
