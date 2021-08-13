package com.smpro.cursospring.services;

import com.smpro.cursospring.domain.Categoria;
import com.smpro.cursospring.repositories.CategoriaRepository;
import com.smpro.cursospring.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow( ()->new ObjectNotFoundException("Objeto não encontrado! Id: "+id+",Tipo: "+ Categoria.class.getName()));
    }

}
