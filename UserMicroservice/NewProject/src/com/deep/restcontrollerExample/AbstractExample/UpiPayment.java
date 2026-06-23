package com.deep.restcontrollerExample.AbstractExample;

public class UpiPayment implements Payment{

    @Override
    public void makePayment(double payment) {
        System.out.println("User give the payments of"+payment);
    }
}
