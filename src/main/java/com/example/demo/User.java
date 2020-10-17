package com.example.demo;

import lombok.Data;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class User {

    @Id
    private ObjectId id;

    private String name;

    private int age;

    @ToString.Exclude
    @DBRef(lazy = true)
    private Address address;
}
