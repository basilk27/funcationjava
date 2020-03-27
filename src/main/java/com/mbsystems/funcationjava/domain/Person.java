package com.mbsystems.funcationjava.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Person {

    private final String name;
    private final Gender gender;
}
