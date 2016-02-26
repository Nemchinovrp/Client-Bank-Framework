package com.becomejavasenior.mvc.dao;

import com.becomejavasenior.mvc.model.User;

import java.util.List;


public interface UserDao {
/*    User createUser(User user);*/

    List<User> getAllUser();

  /*  User getUserById(int id);

    void updateUser(User user);

    void deleteUser(int id);*/
}
