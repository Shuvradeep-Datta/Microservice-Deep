package com.deep.infosys.stream.stringbased;

public class CheckOnlyDigit {
    public static void main(String[] args) {
        String str = "23b";
//        boolean b = str.chars().allMatch(Character::isDigit);
//        System.out.println(b);

        boolean isOnlyDigit =true;
        for (char a:str.toCharArray()){
            if(!Character.isDigit(a)){
                isOnlyDigit =false;
                break;

            }
        }

        System.out.println(isOnlyDigit);
    }
}
