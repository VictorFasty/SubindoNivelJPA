package com.cursoJPA.AprofundandoJPA.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "PEDIDO")
@AllArgsConstructor
public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;


    @ManyToOne
    @JoinColumn(name = "CLIENTE_ID")
    private ClienteModel cliente;


    @Column(name = "DATA_PEDIDO")
    private LocalDateTime dataPedido;

    @Column(name = "TOTAL")
    private BigDecimal total;


}

