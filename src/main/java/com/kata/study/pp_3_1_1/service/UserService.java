package com.kata.study.pp_3_1_1.service;

import com.kata.study.pp_3_1_1.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User employee);

    User getUserById(long id);

    void deleteUserById(long id);

}
