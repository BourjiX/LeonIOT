package com.pfe.backend;

import com.pfe.backend.dao.entity.RoleEnum;
import com.pfe.backend.dao.entity.User;
import com.pfe.backend.dao.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
@RequiredArgsConstructor
public class TestRepo implements CommandLineRunner {
    private final UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setEmail("cbourji122@gmail.com");
        user.setPassword("rigifcjk");
        user.setRole(RoleEnum.ADMIN_ROLE);
        userRepository.save(user);
    }
}
