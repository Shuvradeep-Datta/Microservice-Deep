package com.deep.infosys;

import java.util.stream.IntStream;

public class PrintFirst10EvenNumber {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,20).filter(t->t%2==1).forEach(t-> System.out.print(t+" "));
    }
}
