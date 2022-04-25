package com.pfe.backend.dao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)

    private RoleEnum role;
}
