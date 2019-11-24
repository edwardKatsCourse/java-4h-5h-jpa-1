package com.telran.java4hjpa1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class PersonDto {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String city;
}
