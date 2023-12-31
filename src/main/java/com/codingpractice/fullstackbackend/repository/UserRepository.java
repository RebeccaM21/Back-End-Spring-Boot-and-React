package com.codingpractice.fullstackbackend.repository;

import com.codingpractice.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
