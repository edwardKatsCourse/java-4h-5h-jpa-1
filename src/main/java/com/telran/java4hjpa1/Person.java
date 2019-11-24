package com.telran.java4hjpa1;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //autoincrement, ID per table
    private Integer id;

    private String firstName;
    private String lastName;


//    private Boolean hasCar; //bool, bit (0/1)
//    private Short value; //DECIMAL(10,0)


    //PERSON        PERSON_DETAILS      CREDIT_CARD_INFO
    //1             2
    //3                                   4
}
