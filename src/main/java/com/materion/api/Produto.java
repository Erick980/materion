package com.materion.api;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "produto")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Produto {

    // Geração de valores automático como chave-primária e com o Auto-incremento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Definir um tipo de dado de uma coluna em uma tabela de Banco de Dados
    @Column(columnDefinition = "TEXT")
    private String descricacao;

    // Especificação de valores de um atributo armazenados no Banco de Dados
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    // Estabelecer um relacionamento um-para-muitos entre duas entidades.
    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProdutoUN> produtoUNs;

    private Boolean quantidade;

}
