/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.repository;

import com.udemy.entity.Curso;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AlejandroThalamus
 */
@Repository("cursoJpaRepository")
public interface CursoJpaRepository extends JpaRepository<Curso, Serializable>{
  
}
