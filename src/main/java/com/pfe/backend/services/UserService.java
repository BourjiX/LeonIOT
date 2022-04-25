package com.pfe.backend.services;


import com.pfe.backend.services.model.UserDTO;

import java.util.List;


public interface UserService {

    UserDTO add(UserDTO userDTO);

    UserDTO findById(long id);

    List<UserDTO> findAll();

    UserDTO findByEmail(String email);

    UserDTO update(UserDTO userDto,long id);

    void deleteById(long id);

}
