package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
