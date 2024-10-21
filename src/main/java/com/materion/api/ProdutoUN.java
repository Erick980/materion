package com.materion.api;

import java.math.BigDecimal;

// import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "produtoun")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class ProdutoUN {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricacao;

    private Boolean unidade;

    private BigDecimal preco;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto; // Relação Adicionada

}
