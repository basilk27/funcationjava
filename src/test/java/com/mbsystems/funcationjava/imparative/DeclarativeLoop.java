package com.mbsystems.funcationjava.imparative;

import com.mbsystems.funcationjava.domain.Person;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.mbsystems.funcationjava.domain.Gender.FEMALE;
import static com.mbsystems.funcationjava.domain.Gender.MALE;

public class DeclarativeLoop {

    @Test
    void declarativeLoop() {
        List< Person > personList = List.of(
                Person.builder()
                        .name( "John" )
                        .gender( MALE )
                        .build(),
                Person.builder()
                        .name( "Maria" )
                        .gender( FEMALE )
                        .build(),
                Person.builder()
                        .name( "Peter" )
                        .gender( MALE )
                        .build(),
                Person.builder()
                        .name( "Jane" )
                        .gender( FEMALE )
                        .build(),
                Person.builder()
                        .name( "Micheal" )
                        .gender( MALE )
                        .build()
        );

        Predicate<Person> personPredicate = person -> person.getGender().equals( FEMALE );

        personList.stream()
                .filter( personPredicate )
                .collect( Collectors.toList())
                .forEach( System.out::println );
    }
}
