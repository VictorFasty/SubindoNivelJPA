package com.cursoJPA.AprofundandoJPA.repositories;

import com.cursoJPA.AprofundandoJPA.model.ItemPedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedidoModel, Long> {
}
