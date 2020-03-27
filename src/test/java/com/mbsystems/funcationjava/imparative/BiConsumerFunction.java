package com.mbsystems.funcationjava.imparative;

import com.mbsystems.funcationjava.domain.Gender;
import com.mbsystems.funcationjava.domain.Person;
import org.junit.platform.commons.util.StringUtils;

import java.util.function.BiConsumer;

public class BiConsumerFunction {

    static BiConsumer<Person, Boolean> booleanBiConsumer = ( person, aBoolean ) -> {
        System.out.println( person );

        if ( aBoolean ) System.out.println("We have it as true");
    };

    public static void main( String[] args ) {
        Person aPerson = Person.builder()
                                .gender( Gender.MALE )
                                .name( "Johns" )
                                .build();

        booleanBiConsumer.accept( aPerson, true );

        System.out.println( "=============++");

        booleanBiConsumer.accept( aPerson, false );
    }
}
