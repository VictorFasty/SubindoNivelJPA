package com.cursoJPA.AprofundandoJPA.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ITEM_PEDIDO")
@Getter
@Setter
@NoArgsConstructor
public class ItemPedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;


    @ManyToOne
    @JoinColumn(name = "PEDIDO_ID")
    private PedidoModel pedido;


    @ManyToOne
    @JoinColumn(name = "PRODUTO_ID")
    private ProdutoModel produto;


    @Column(name = "QUANTIDADE")
    private Integer quantidade;
}