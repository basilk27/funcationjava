package com.mbsystems.funcationjava.imparative;

import com.mbsystems.funcationjava.domain.Gender;
import com.mbsystems.funcationjava.domain.Person;

import java.util.function.Predicate;

public class PredicateFunction {

    static Predicate<Person> personPredicate = person -> person.getGender().equals( Gender.FEMALE );

    public static void main( String[] args ) {
        Person person = Person.builder()
                            .name( "Mary" )
                            .gender( Gender.FEMALE )
                            .build();

        Person person2 = Person.builder()
                .name( "John" )
                .gender( Gender.MALE )
                .build();

        Person person3 = Person.builder()
                .name( "Linda" )
                .gender( Gender.FEMALE )
                .build();

        if ( personPredicate.test( person ) ) System.out.println( person );
        if ( personPredicate.test( person2 ) ) System.out.println( person2 );
        if ( personPredicate.test( person3 ) ) System.out.println( person3 );

    }
}
