package com.example.demo;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "My", types = {User.class})
public interface MyProjection {
    Address getAddress();
}
