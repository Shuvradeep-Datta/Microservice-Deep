package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;

public class GCD {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,6,9,10);
       int result =  list.stream().reduce(1,(a,b)->gcd(a,b));
        System.out.println(result);

//        lcm is

        int lcm = list.stream().reduce(1,(a,b)->(a*b)/gcd(a,b));
        System.out.println(lcm);

    }

    public static int gcd(int a,int b){
        while (b != 0){
            int temp =b;
            b=a%b;
            a=temp;

        }
        return a;
    }
}
