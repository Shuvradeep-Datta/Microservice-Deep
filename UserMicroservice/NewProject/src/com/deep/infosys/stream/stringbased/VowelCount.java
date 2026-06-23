package com.deep.infosys.stream.stringbased;

public class VowelCount {
    public static void main(String[] args) {
        String str = "Shuvradeep";

//        long count = str.toLowerCase().chars().filter(t -> "aeiou".indexOf(t) != -1).count();
//        System.out.println(count);


        //pati way

        int count =0;

        for (char s:str.toLowerCase().toCharArray()){
            if("aeiou".indexOf(s) != -1){
                count++;
            }
        }
        System.out.println(count);
    }
}
