package com.mbsystems.funcationjava.imparative;

import java.util.function.BiFunction;

public class BiFunction01 {

    static BiFunction<Integer, Integer, Integer> biValue =
            ( x, y ) -> (x + 1) * y;

    public static void main( String[] args ) {
        int somevalue = biValue.apply( 4, 2);

        System.out.println( somevalue );
    }
}
