package com.deep.infosys.stream.stringbased;

public class RemoveSpace {
    public static void main(String[] args) {
        //Remove spaces from a string

        String str = "ab  cd  de er tt ";

        String s = str.replaceAll("\\s+", "");
        System.out.println(s);
    }
}
