package com.deep.practice.prototype;

public class NetworkProto implements Cloneable{
    private String ipAddress;
    private String importantMessage;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getImportantMessage() {
        return importantMessage;
    }

    public void setImportantMessage(String importantMessage) {
        this.importantMessage = importantMessage;
    }


    public void loadVeryImportantMessage(String importantMessage) throws InterruptedException {
        Thread.sleep(5000);
        this.importantMessage  = "Very Very Important Message";

    }

    @Override
    public String toString() {
        return "NetworkProto{" +
                "ipAddress='" + ipAddress + '\'' +
                ", importantMessage='" + importantMessage + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
