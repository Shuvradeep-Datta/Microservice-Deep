package com.deep.infosys.stream.Abstraction;

public class VehicleExtender extends Vehicle{


    public VehicleExtender(int a) {
        super(a);
    }

    @Override
    void tvs() {
        System.out.println("This is extended Tvs...");

    }

    public static void main(String[] args) {
        Vehicle v = new VehicleExtender(20);
        v.tvs();
        v.bajaj();
    }
}
