/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.repository;

import com.udemy.entity.User;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Minimal
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Serializable>{
    
    public abstract  User findByUsername(String username);
}