package com.mbsystems.funcationjava.imparative;

import com.mbsystems.funcationjava.domain.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class SetofsetTest {

    Set<Student> studentSet = new HashSet<>();

    @BeforeEach
    void setUp() {
        studentSet.add( Student.builder()
                                .age( 22 )
                                .name( "Mary" )
                                .build() );

        studentSet.add( Student.builder()
                .age( 26 )
                .name( "Paul" )
                .build() );

        studentSet.add( Student.builder()
                .age( 25 )
                .name( "Peter" )
                .build() );

        studentSet.add( Student.builder()
                .age( 21 )
                .name( "Joe" )
                .build() );

        studentSet.add( Student.builder()
                .age( 26 )
                .name( "Basil" )
                .build() );

        studentSet.add( Student.builder()
                .age( 30 )
                .name( "John" )
                .build() );

        studentSet.add( Student.builder()
                .age( 17 )
                .name( "Jim" )
                .build() );

        studentSet.add( Student.builder()
                .age( 26 )
                .name( "Paul" )
                .build() );

        studentSet.add( Student.builder()
                .age( 22 )
                .name( "Mary" )
                .build() );

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void personListStreamTest01() {
        studentSet.forEach( System.out::println );

    }

    @Test
    void numbbtest() {
        Predicate<Integer> predicate = p -> ((p % 3 == 0) && (p % 5 == 0));

        boolean bb = predicate.test( 15 );
        System.out.println( bb);
    }
}