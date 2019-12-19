package xyz.java1024.service;

import xyz.java1024.vo.User;

import java.util.List;

public interface UserService {

    User getOneUser(int id);
    List<User> findAll();
    int add(User user);
    int update(User user);
    int delete(int id);

}
