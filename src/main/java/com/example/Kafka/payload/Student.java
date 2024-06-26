package com.example.Kafka.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class Student {

    private UUID id;

    private String firstName;

    private String lastName;
}
