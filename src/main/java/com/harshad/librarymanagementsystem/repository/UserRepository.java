package com.harshad.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshad.librarymanagementsystem.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

