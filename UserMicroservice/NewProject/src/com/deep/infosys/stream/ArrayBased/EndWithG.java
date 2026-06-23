package com.deep.infosys.stream.ArrayBased;

import java.util.Arrays;

public class EndWithG {
    public static void main(String[] args) {
        String str[] ={"testing", "coding", "java", "blog","GLOG"};
        long count = Arrays.stream(str).filter(s -> !s.isEmpty()).filter(s -> "gG".indexOf(s.charAt(s.length()-1)) !=-1).count();
        System.out.println(count);
    }
}
