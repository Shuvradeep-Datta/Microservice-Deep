package com.deep;

import java.util.ArrayList;
import java.util.List;

public class PressureTest {
    public static void main(String[] args) {
        List<byte[] >list = new ArrayList<>();
        while (true){
            list.add(new byte[1024 *1024]);
        }
    }
}
