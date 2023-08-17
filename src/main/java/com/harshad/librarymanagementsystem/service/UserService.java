package com.harshad.librarymanagementsystem.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.harshad.librarymanagementsystem.entity.Role;
import com.harshad.librarymanagementsystem.entity.User;
import com.harshad.librarymanagementsystem.repository.UserRepository;

import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(
            user.getUsername(),
            user.getPassword(),
            user.isEnabled(),
            true, true, true,
            getAuthorities(user.getRoles())
        );
    }

    private Collection<? extends GrantedAuthority> getAuthorities(Set<Role> roles) {
        return roles.stream()
            .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getName()))
            .collect(Collectors.toList());
    }

    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(true);

        // Assign default role (you can customize this logic)
        Role userRole = roleService.findByName("USER");
        user.setRoles(Collections.singleton(userRole));

        return userRepository.save(user);
    }

    public User registerAdmin(User admin) {
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));
        admin.setEnabled(true);

        // Assign admin role (you can customize this logic)
        Role adminRole = roleService.findByName("ADMIN");
        admin.setRoles(Collections.singleton(adminRole));

        admin.setId(2L); // Set the ID to 2
        return userRepository.save(admin);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
