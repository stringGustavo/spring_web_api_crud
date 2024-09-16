package com.crudexample.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudexample.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
