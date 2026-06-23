package com.deep.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void rotateArray(int arr[],int d){
        int n =arr.length;
       for(int i=0;i<d;i++){
           int first  =arr[0];
           for(int j=0;j<n-1;j++){
               arr[j] =arr[j+1];
           }
           arr[n-1]=first;




       }


    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        rotateArray(arr,3);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
