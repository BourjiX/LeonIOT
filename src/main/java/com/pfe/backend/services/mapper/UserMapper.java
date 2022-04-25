package com.pfe.backend.services.mapper;


import com.pfe.backend.dao.entity.User;
import com.pfe.backend.services.model.UserDTO;

public class UserMapper {
   public static User mapToEntity(UserDTO userDTO){
       if (userDTO==null){
           return null;
       }
       User user =new User();
       user.setId(userDTO.getId());
       user.setEmail(userDTO.getEmail());
       user.setRole(userDTO.getRole());
       user.setPassword(userDTO.getPassword());
       return user;
   }
    public static UserDTO mapToDTO(User user){
        if (user==null){
            return null;
        }
        UserDTO userDTO =new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setRole(user.getRole());
        return userDTO;
    }

}
