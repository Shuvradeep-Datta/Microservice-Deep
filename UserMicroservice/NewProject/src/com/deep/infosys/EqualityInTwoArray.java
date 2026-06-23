package com.deep.infosys;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class EqualityInTwoArray {
    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 1, 7, 4};

        int[] arrayTwo = {2, 5, 1, 7, 4};

        boolean equalOrNot = true;

     if(arrayOne.length == arrayTwo.length){
        for (int i=0;i<arrayOne.length;i++){
            if (arrayOne[i] != arrayTwo[i]){
                equalOrNot =false;
            }
        }
     }else {
         equalOrNot =false;
     }
    if (equalOrNot){
        System.out.println("Two arrays are same");
    }else {
        System.out.println("Two arrays are not same");
    }

    }
}
