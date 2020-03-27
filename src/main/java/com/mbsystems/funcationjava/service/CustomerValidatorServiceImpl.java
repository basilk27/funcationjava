package com.mbsystems.funcationjava.service;

import com.mbsystems.funcationjava.domain.Customer;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorServiceImpl implements CustomerValidatorService {

    //simple validations in this case
    @Override
    public Boolean isNameValid( String name ) {
        if ( StringUtils.isEmpty( name ) )
            return false;

        return name.length() > 2;
    }

    @Override
    public Boolean isEmailValid( String email ) {
        return email.contains( "@" );
    }

    @Override
    public Boolean isPhoneNumberValid( String phoneNumber ) {
        return phoneNumber.startsWith( "+0" );
    }

    @Override
    public Boolean isAdult( LocalDate dob ) {
        return Period.between( dob,  LocalDate.now() ).getYears() > 17;
    }

    public Boolean isValid( Customer customer ) {
        return isNameValid( customer.getName() ) &&
               isEmailValid( customer.getEmail() ) &&
               isPhoneNumberValid( customer.getPhoneNumber() ) &&
               isAdult( customer.getDob() );
    }
}
