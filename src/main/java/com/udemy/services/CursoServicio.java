/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.services;

import com.udemy.entity.Curso;
import java.util.List;

/**
 *
 * @author AlejandroThalamus
 */
public interface CursoServicio {
    public abstract  List<Curso> listaAllCursos();
    public abstract Curso addCurso(Curso curso);
    public abstract int removerCurso(int id);
    public abstract Curso updateCurso(Curso curso);
    
    
}
