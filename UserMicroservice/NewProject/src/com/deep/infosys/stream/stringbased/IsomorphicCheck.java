package com.deep.infosys.stream.stringbased;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicCheck {

    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add1";
        boolean isIsomorphic = true;

        if (s1.length() != s2.length()){
            isIsomorphic =false;
            System.out.println(isIsomorphic);
            return;
        }

        Map<Character,Character>map1 = new HashMap<>();
        Map<Character,Character>map2 = new HashMap<>();

        for (int i=0;i<s1.length();i++){
            char c1 =s1.charAt(i);
            char c2 = s2.charAt(i);

            if(map1.containsKey(c1)){
                if(map1.get(c1) !=c2){
                    isIsomorphic =false;
                    break;
                }
            }else {
                map1.put(c1,c2);
            }

            if(map2.containsKey(c2)){
                if (map2.get(c2) !=c1){
                    isIsomorphic =false;
                    break;
                }
            }else {
                map2.put(c2,c1);
            }
        }
        System.out.println(isIsomorphic);
    }
}
