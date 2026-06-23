package com.deep.infosys;

import java.util.Arrays;

public class AnagramsorNot {

    public static void main(String[] args) {
        String copyOfs1 = "Mother In Law".replaceAll("\\s", "");

        String copyOfs2 = "Hitler Woman".replaceAll("\\s", "");

        boolean status =true;

        if (copyOfs1.length() != copyOfs2.length()){
            status =false;
        }else {
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            status = Arrays.equals(s1Array,s2Array);
        }

        if (status){
            System.out.println("They are Anagrams");
        }else {
            System.out.println("They are not Anagrams");
        }
    }


}
