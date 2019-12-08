package com.appstude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appstude.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}
