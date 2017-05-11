/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udemy.services.impl;


import com.udemy.entity.Curso;
import com.udemy.repository.CursoJpaRepository;
import com.udemy.services.CursoServicio;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author AlejandroThalamus
 */
@Service("cursoServicioImpl")
public class CursoServicioImpl implements CursoServicio {

    private static final Log LOG = LogFactory.getLog(CursoServicioImpl.class);

    @Autowired
    @Qualifier("cursoJpaRepository")
    private CursoJpaRepository cursoJpaRepository;

    @Override
    public List<Curso> listaAllCursos() {
        LOG.info("Call: "+"listAllCursos()");
        return cursoJpaRepository.findAll();
    }

    @Override
    public Curso addCurso(Curso curso) {
        LOG.info("Call: "+"listAllCursos()");
        return cursoJpaRepository.save(curso);
    }

    @Override
    public int removerCurso(int id) {
        cursoJpaRepository.delete(id);
        return 0;
    }

    @Override
    public Curso updateCurso(Curso curso) {
        return cursoJpaRepository.save(curso);
    }

}
