package com.deep.infosys.stream.IntegereArray;

public class MissingNumber {

    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 6, 7};

        int n= nums.length;
        int expectedNumber = (n*(n+1))/2;
        int actualNumber = 0;

        for(int i=0;i<n;i++){
            actualNumber =actualNumber+nums[i];

        }
        System.out.println(actualNumber-expectedNumber);

    }
}
