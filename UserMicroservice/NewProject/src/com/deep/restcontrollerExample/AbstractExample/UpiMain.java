package com.deep.restcontrollerExample.AbstractExample;

public class UpiMain {

    public static void main(String[] args) {
        Payment payment= new UpiPayment();
        payment.makePayment(1000d);

    }
}
