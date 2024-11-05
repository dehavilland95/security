package secutiry313.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import secutiry313.demo.models.Role;
import secutiry313.demo.models.User;

import java.util.List;

public interface UserService {
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
    User findUserById(Long userId);
    void updateUser(User user, String[] roleNames);
    List<User> getAll();
    boolean saveUser(User user, String[] roleNames);
    boolean deleteUser(Long userId);
    List<Role> getAllRoles();

}
