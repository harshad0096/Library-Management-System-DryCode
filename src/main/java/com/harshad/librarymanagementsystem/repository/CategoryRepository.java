package com.harshad.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harshad.librarymanagementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
