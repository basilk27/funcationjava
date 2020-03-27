package com.mbsystems.funcationjava.service;

import com.mbsystems.funcationjava.domain.Customer;
import com.mbsystems.funcationjava.enumvalues.ValidationResults;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static com.mbsystems.funcationjava.enumvalues.ValidationResults.*;

public interface CustomerRegistrationValidatorService extends Function<Customer, ValidationResults> {

    static CustomerRegistrationValidatorService isNameValid() {
        return customer ->  customer.getName().length() > 2 ? SUCCESS : NAME_NOT_VALID;
    }

    static CustomerRegistrationValidatorService isEmailValid() {
        return customer ->  customer
                                .getEmail()
                                .contains( "@" ) ? SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidatorService isPhoneNumberValid() {
        return customer ->  customer
                                .getPhoneNumber()
                                .startsWith( "+0" ) ? SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidatorService isAdult() {
        return customer ->
                    Period
                .between( customer.getDob(),  LocalDate.now() ).getYears() > 17 ? SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidatorService and( CustomerRegistrationValidatorService other ) {
        return  customer -> {
            ValidationResults validationResults = this.apply( customer );

            return validationResults.equals( SUCCESS ) ? other.apply( customer ) : validationResults;
        };
    }
}
