package com.pfe.backend.dao;

import com.pfe.backend.dao.entity.User;

import java.util.List;
public interface UserDao {

    User add(User user);

    List<User> findAll();

    User findById(long id);

    User findByEmail(String email);

    User update(User user,long id);

    void deleteById(long id);
}
