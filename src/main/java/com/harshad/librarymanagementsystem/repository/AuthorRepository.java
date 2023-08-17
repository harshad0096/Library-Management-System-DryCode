package com.harshad.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshad.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
