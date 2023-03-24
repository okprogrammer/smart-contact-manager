package com.smart.contact.manager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.contact.manager.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
