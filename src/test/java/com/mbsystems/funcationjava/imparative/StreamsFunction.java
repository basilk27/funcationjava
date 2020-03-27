package com.mbsystems.funcationjava.imparative;

import com.mbsystems.funcationjava.domain.Gender;
import com.mbsystems.funcationjava.domain.Person;
import lombok.Getter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static com.mbsystems.funcationjava.domain.Gender.FEMALE;
import static com.mbsystems.funcationjava.domain.Gender.MALE;

public class StreamsFunction {

    private List<Person> personList;

    @BeforeEach
    void setUp() {
        personList = List.of(
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

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void personListStreamTest01() {
        personList.stream()
                .map( Person::getGender )
                .collect( Collectors.toSet())
                .forEach( System.out::println );

        personList.stream()
                .map( Person::getName )
                .collect( Collectors.toSet())
                .forEach( System.out::println );
    }

    @Test
    void setPersonListMatch() {
        if (personList.stream()
                .allMatch( person -> person.getName().equals( FEMALE ) ) ) {
            System.out.println( "All are " + FEMALE.name() );
        }
        else {
            System.out.println( "All are NOT " + FEMALE.name() );
        }
    }
}
