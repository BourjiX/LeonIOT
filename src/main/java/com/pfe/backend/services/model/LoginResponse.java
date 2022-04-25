package com.pfe.backend.services.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {

   private String accessToken;

   private UserDTO userDTO;
}
