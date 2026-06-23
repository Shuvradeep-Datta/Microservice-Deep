package com.deep.infosys.stream.stringbased;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountUpperCaseLowerCase {
    public static void main(String[] args) {
        String str = "Banana By Chance";

            int lowerCase=0;
            int upperCase =0;
        for (char d: str.toCharArray()){
            if(Character.isLowerCase(d)){
                lowerCase++;

            }else if (Character.isUpperCase(d)){
                upperCase++;
            }
        }

        System.out.println(lowerCase);
        System.out.println(upperCase);

    }
}
