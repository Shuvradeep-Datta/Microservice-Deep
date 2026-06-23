package com.deep.infosys.stream.stringbased;

import java.util.stream.IntStream;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=12321;
        int reversed = IntStream.iterate(num,n->n>0,n->n/10).map(n->n%10).reduce(0,(a,b)->a*10+b);
        boolean isPalindrome = (num == reversed);
        System.out.println(isPalindrome);
    }
}
