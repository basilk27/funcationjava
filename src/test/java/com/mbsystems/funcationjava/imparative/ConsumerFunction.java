package com.mbsystems.funcationjava.imparative;

import com.mbsystems.funcationjava.domain.Gender;
import com.mbsystems.funcationjava.domain.Person;

import java.util.function.Consumer;

public class ConsumerFunction {

    static Consumer<Person> personConsumer = System.out::println;

    public static void main( String[] args ) {
        Person person = Person.builder()
                            .gender( Gender.MALE )
                            .name( "Mike" )
                            .build();

        personConsumer.accept( person );
    }
}
