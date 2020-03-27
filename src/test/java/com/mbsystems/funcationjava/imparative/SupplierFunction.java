package com.mbsystems.funcationjava.imparative;

import com.mbsystems.funcationjava.domain.Gender;
import com.mbsystems.funcationjava.domain.Person;

import java.util.function.Supplier;

public class SupplierFunction {

    static Supplier<Person> supplierMary = () -> Person.builder()
                                                    .gender( Gender.FEMALE )
                                                    .name( "Mary" )
                                                    .build();

    public static void main( String[] args ) {
        System.out.println( "Prints Mary: " + supplierMary.get() );
    }
}
