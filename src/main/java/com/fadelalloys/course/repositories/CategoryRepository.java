package com.fadelalloys.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fadelalloys.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
