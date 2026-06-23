package com.deep.Map;

public class KeyValue {
    private String key;
    private int val;

    public KeyValue(String key, int val) {
        this.key = key;
        this.val = val;
    }

    @Override
    public String toString() {
        return "KeyValue{" +
                "key='" + key + '\'' +
                ", val=" + val +
                '}';
    }
}
