package com.mbsystems.funcationjava.imparative;

import com.mbsystems.funcationjava.domain.Customer;
import com.mbsystems.funcationjava.enumvalues.ValidationResults;
import com.mbsystems.funcationjava.service.CustomerRegistrationValidatorService;
import com.mbsystems.funcationjava.service.CustomerValidatorServiceImpl;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class WithOrWithoutCombinatorPattern {

    @Test
    void withoutCombinatorPattern() {
        Customer customer = Customer.builder()
                                .name( "Mary" )
                                .email( "mary@gmail.com" )
                                .phoneNumber( "+01234567" )
                                .dob( LocalDate.of( 1966, 12, 7) )
                                .build();

        Customer customer2 = Customer.builder()
                .name( "John" )
                .email( "johngmail.com" )
                .phoneNumber( "+01234567" )
                .dob( LocalDate.of( 1966, 12, 7) )
                .build();

        CustomerValidatorServiceImpl validatorService = new CustomerValidatorServiceImpl();

        boolean rtnValue = validatorService.isValid( customer );

        System.out.println( rtnValue );

        boolean rtnValue2 = validatorService.isValid( customer2 );

        System.out.println( rtnValue2 );
    }

    @Test
    void withCombinatorPattern() {
        Customer customer = Customer.builder()
                .name( "Mary" )
                .email( "mary@gmail.com" )
                .phoneNumber( "+01234567" )
                .dob( LocalDate.of( 1966, 12, 7) )
                .build();


        ValidationResults results = CustomerRegistrationValidatorService
                                        .isNameValid()
                                        .and( CustomerRegistrationValidatorService.isEmailValid() )
                                        .and( CustomerRegistrationValidatorService.isPhoneNumberValid() )
                                        .and( CustomerRegistrationValidatorService.isAdult() )
                                        .apply( customer );

        System.out.println(results);


        Customer customer2 = Customer.builder()
                .name( "John" )
                .email( "johngmail.com" )
                .phoneNumber( "+01234567" )
                .dob( LocalDate.of( 1966, 12, 7) )
                .build();


        ValidationResults results2 = CustomerRegistrationValidatorService
                .isNameValid()
                .and( CustomerRegistrationValidatorService.isEmailValid() )
                .and( CustomerRegistrationValidatorService.isPhoneNumberValid() )
                .and( CustomerRegistrationValidatorService.isAdult() )
                .apply( customer2 );

        System.out.println(results2);
    }
}
