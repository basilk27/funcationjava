package com.mbsystems.funcationjava.imparative;

import java.util.function.Function;

public class Function01 {

    static Function<Integer, Integer> functionPlusOne = numValue -> numValue + 1;
    static Function<Integer, Integer> functionPlus25 = numValue -> numValue + 25;
    static Function<Integer, Integer> functionPlus = functionPlusOne.andThen( functionPlus25 );

    public static void main( String[] args ) {
        //int incrementValue = functionPlusOne.apply( 1 );

        //System.out.println("Value: " + incrementValue);

        int value = functionPlus.apply( 2 );

        System.out.println( value );
    }
}
