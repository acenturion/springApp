/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.repository;

import com.udemy.entity.Log;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author AlejandroThalamus
 */
@Repository("logRepository")
public interface LogRepository extends JpaRepository<Log,Serializable>{
    
}
