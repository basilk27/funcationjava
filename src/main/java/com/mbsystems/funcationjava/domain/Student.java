package com.mbsystems.funcationjava.domain;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Student {

    private final int age;
    private final String name;
}
