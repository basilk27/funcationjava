package com.mbsystems.funcationjava.imparative;

import com.mbsystems.funcationjava.domain.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.mbsystems.funcationjava.domain.Gender.FEMALE;
import static com.mbsystems.funcationjava.domain.Gender.MALE;

public class ImparativeLoop {

    @Test
    void loopcase01() {
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

        //Imperative approach

        List<Person> peopleFemale = new ArrayList<Person>();

        for ( Person person : personList ) {
            if ( FEMALE.equals( person.getGender() ) ) {
                peopleFemale.add( person );
            }
        }

        System.out.println( "Female cout: " + peopleFemale.size() );
        for ( Person female : peopleFemale ) {
            System.out.println( female );
            System.out.println( "Enum: " + female.getGender().name() );
        }

    }
}
