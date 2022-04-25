package com.pfe.backend.services.model;

import com.pfe.backend.dao.entity.RoleEnum;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserDTO {
    private long id;
    private String email;
    private RoleEnum role;
    private String password;
}
