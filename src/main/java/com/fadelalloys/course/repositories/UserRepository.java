package com.fadelalloys.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fadelalloys.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
