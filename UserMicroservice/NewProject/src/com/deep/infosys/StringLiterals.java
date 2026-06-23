package com.deep.infosys;

public class StringLiterals {
    public static void main(String[] args) {
        String s1 ="Deep";
        String s2 = "Deep";
        System.out.println(s1==s2);

        String s3 = new String("Deep");

        System.out.println(s1 ==s3);
        System.out.println(s1.equals(s3));

        String s4 ="Deep";
        String s5 = s4.intern();

        System.out.println(s4 == s5);
    }
}
