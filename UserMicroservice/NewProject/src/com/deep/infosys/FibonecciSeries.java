package com.deep.infosys;

import java.util.stream.Stream;

public class FibonecciSeries {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]})
                .map(t->t[0]).limit(10).forEach(t->System.out.print(t+" "));
    }
}
