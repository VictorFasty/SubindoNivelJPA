package com.cursoJPA.AprofundandoJPA.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "PRODUTO")
@Getter
@Setter
@NoArgsConstructor
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRICAO", length = 100)
    private String descricao;


    @Column(name = "PRECO_UNITARIO", precision = 20, scale = 2)
    private BigDecimal precoUnitario;


    @OneToMany(mappedBy = "produto")
    private List<ItemPedidoModel> itens;
}