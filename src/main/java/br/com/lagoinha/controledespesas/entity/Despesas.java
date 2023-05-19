package br.com.lagoinha.controledespesas.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Despesas {

    @Id
    @Column(name = "despesas_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(length = 30, nullable = false)
    private String credor;

    @Column(nullable = false)
    private Date dataVencimento = new Date();


    private Date dataPagamento = new Date();

    @Column(precision = 19, scale = 2, nullable = false)
    private BigDecimal valorDespesa;

    private String descicaoDespesa;

    @Column(nullable = false)
    private Boolean pendente = true;
}
