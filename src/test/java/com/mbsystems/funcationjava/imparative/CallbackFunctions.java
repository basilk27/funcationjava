package com.mbsystems.funcationjava.imparative;

import java.util.function.Consumer;

public class CallbackFunctions {

    public static void main( String[] args ) {
        hello( "Basil", "Kiwanuka", null );
        hello( "Micheal", "Kiwanuka", value -> {
            System.out.println("No last name provided for " + value );
        } );
//        hello( "Micheal", null, value -> {
//            System.out.println("No last name provided for " + value );
//        } );
    }

    static void hello( String firstName, String lastName, Consumer<String> callback ) {
        System.out.println( firstName );
        if ( lastName != null ) {
            System.out.println( lastName );
        }
        else {
            callback.accept( firstName );
        }
    }
}
