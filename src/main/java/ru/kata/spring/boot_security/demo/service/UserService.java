package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

public interface UserService extends UserDetailsService {

    List<User> getAllUsers();

    void createUser(User user, Set<Role> role);

    User getUserById(Long id);

    User updateUser(User user, Set<Role> role);

    void deleteUser(Long id);

    User getUserByLogin(String email);

    UserDetails loadUserByUsername(String email);
}
