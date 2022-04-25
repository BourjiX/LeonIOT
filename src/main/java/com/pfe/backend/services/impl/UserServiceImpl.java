package com.pfe.backend.services.impl;


import com.pfe.backend.dao.UserDao;
import com.pfe.backend.services.UserService;
import com.pfe.backend.services.mapper.UserMapper;
import com.pfe.backend.services.model.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private  final UserDao userDao;

    @Override
    public UserDTO add(UserDTO userDTO) {
        return UserMapper.mapToDTO(userDao.add(UserMapper.mapToEntity(userDTO)));
    }

    @Override
    public UserDTO findById(long id) {
        return UserMapper.mapToDTO(userDao.findById(id));
    }

    @Override
    public List<UserDTO> findAll() {
        return userDao.findAll().stream().map(UserMapper::mapToDTO).collect(Collectors.toList());
    }

    @Override
    public UserDTO findByEmail( String email) {
        return UserMapper.mapToDTO(userDao.findByEmail(email));
    }

    @Override
    public UserDTO update(UserDTO userDTO,long id) {
        return UserMapper.mapToDTO(userDao.update(UserMapper.mapToEntity(userDTO),id));
    }

    @Override
    public void deleteById(long id) {
        userDao.deleteById(id);
    }
}
