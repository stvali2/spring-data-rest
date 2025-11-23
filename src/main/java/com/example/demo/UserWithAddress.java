package com.example.demo;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "withAddress", types = {User.class})
public interface UserWithAddress {
    String getName();
    Integer getAge();
    Address getAddress();
}
