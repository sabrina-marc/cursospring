package com.smpro.cursospring.repositories;

import com.smpro.cursospring.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {
}
