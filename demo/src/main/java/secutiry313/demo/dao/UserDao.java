package secutiry313.demo.dao;

import secutiry313.demo.models.User;
import java.util.List;

public interface UserDao {
    User findById(long id);
    List<User> findAll();
    void save(User user);
    void update(User user);
    void delete(long id);
}
