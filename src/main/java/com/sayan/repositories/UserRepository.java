package com.sayan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sayan.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
