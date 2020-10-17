package com.example.demo;

import lombok.Data;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Address {
    @Id
    private ObjectId id;

    private String street;

    @ToString.Exclude
    @DBRef(lazy = true)
    private List<User> users;
}
