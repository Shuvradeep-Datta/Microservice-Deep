package com.deep.infosys;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int number =153;
        int copyNumber =number;
        int sum =0;
        int noOfDigit = String.valueOf(number).length();
        while (number !=0){
            int lastdigit = number%10;
            int lastDigitToPower = 1;
            for(int i=0;i<noOfDigit;i++){
                lastDigitToPower = lastDigitToPower*lastdigit;
            }
            sum = sum+lastDigitToPower;
            number =number/10;

        }

        if(sum ==copyNumber){
            System.out.println("It's an Armstrong Number");
        }else {
            System.out.println("It's not an Armstrong Number");
        }
    }
}
