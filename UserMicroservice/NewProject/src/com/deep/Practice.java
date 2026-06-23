package com.deep;

import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        String s= "abc#de#";
        StringBuilder sb = new StringBuilder();
        for(char a:s.toCharArray()){
            if(a == '#') {
                if(a>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else {
                sb.append(a);
            }
        }

        System.out.println(sb);
    }
}
