package com.deep.infosys.stream.IntegereArray.Advance;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimeCheck {
    public static void main(String[] args) {
        int[] arr ={2, 3, 4, 5, 10, 11};

        long count = Arrays.stream(arr).filter(t->t>1 && IntStream.rangeClosed(2,(int)Math.sqrt(t)).allMatch(s->t%s !=0)).count();
        System.out.println(count);
    }


}
