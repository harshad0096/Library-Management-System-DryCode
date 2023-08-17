package com.harshad.librarymanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshad.librarymanagementsystem.entity.Role;
import com.harshad.librarymanagementsystem.repository.RoleRepository;



@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role findByName(String roleName) {
        return roleRepository.findByName(roleName);
    }

    public java.util.List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}

