package com.cursoJPA.AprofundandoJPA.repositories;

import com.cursoJPA.AprofundandoJPA.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
