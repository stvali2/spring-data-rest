package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@RepositoryRestResource(collectionResourceRel = "addresses", path = "addresses")
public class Address {
    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private Long id;

    private String street;

    @OneToMany(mappedBy = "address")
    private Set<User> residents = new HashSet<>();
}
