package com.mbsystems.funcationjava.service;

import java.time.LocalDate;

public interface CustomerValidatorService {

    Boolean isNameValid( String name );
    Boolean isEmailValid( String email );
    Boolean isPhoneNumberValid( String phoneNumber );
    Boolean isAdult( LocalDate dob );
}
