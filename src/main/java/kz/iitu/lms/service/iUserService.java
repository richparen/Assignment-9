package kz.iitu.lms.service;

import kz.iitu.lms.model.User;

import java.util.List;

public interface iUserService {
    User update(User o);
    void deleteUserById(Long id);
    User getById(Long id);
    List<User> getAll();
    List<User> getAllByName(String name);
    User createUser(User user);
    void updateUser(Long id, User user);

}
