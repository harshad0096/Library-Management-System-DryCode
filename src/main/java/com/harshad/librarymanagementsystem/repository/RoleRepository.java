package com.harshad.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshad.librarymanagementsystem.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
