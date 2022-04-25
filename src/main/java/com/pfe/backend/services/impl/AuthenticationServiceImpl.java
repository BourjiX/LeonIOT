package com.pfe.backend.services.impl;

import com.pfe.backend.services.AuthenticationService;
import com.pfe.backend.services.UserService;
import com.pfe.backend.services.model.LoginRequest;
import com.pfe.backend.services.model.LoginResponse;
import com.pfe.backend.services.model.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private  final UserService userService;
    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        UserDTO userDTO = userService.findByEmail(loginRequest.getEmail());
        LoginResponse loginResponse=new LoginResponse();
        loginResponse.setAccessToken(userDTO.getEmail()+userDTO.getId());
        loginResponse.setUserDTO(userDTO);
        return loginResponse;
    }

    @Override
    public UserDTO signUp(UserDTO userDTO) {
        return userService.add(userDTO);
    }
}
