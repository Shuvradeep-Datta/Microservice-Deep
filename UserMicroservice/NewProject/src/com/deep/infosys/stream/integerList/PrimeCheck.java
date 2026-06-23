package com.deep.infosys.stream.integerList;

import java.util.Arrays;
import java.util.List;

public class PrimeCheck {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 4, 5, 10, 13, 15);
        List<Integer> list1 = list.stream().filter(t -> isPrime(t)).toList();
        System.out.println(list1);


    }

    private static boolean isPrime(int n) {
        if(n==1) return  false;
        if(n==2) return true;
        if(n%2==0) return false;
        for (int i =3;i*i<=n;i=i+2){
            if(n%i==0) return false;

        }
        return true;
    }
}
