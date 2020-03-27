package com.mbsystems.funcationjava.imparative;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalFunction {

    @Test
    void optionalValue() {
        Object value = Optional.empty().orElseGet( () -> "Basil you are starting to get it" );

        System.out.println( value );
    }

    @Test
    void optionalValue01() {
        Optional.ofNullable( null )
                .ifPresentOrElse( email -> System.out.println( "Send email to " + email ),
                        () -> System.out.println( "Can not send email" ));
    }
}
