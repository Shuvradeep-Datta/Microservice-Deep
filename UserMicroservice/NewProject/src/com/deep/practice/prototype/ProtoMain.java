package com.deep.practice.prototype;

public class ProtoMain {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        NetworkProto networkProto = new NetworkProto();
        System.out.println("Created Network Connection");

        networkProto.setIpAddress("192.168.0.1");
        networkProto.loadVeryImportantMessage("Getting Message");
        System.out.println(networkProto.getIpAddress());
        System.out.println(networkProto.getImportantMessage());


        NetworkProto networkProto2 = (NetworkProto) networkProto.clone();

        System.out.println(networkProto2.getIpAddress());
        System.out.println(networkProto2.getImportantMessage());


    }
}
