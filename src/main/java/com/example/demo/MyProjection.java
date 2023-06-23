package com.example.demo;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "my", types = {User.class})
public interface MyProjection {
    Address getAddress();
}
