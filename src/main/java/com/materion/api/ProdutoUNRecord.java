package com.materion.api;

import java.math.BigDecimal;

public record ProdutoUNRecord(

        String nome,

        String descricacao,

        BigDecimal unidade,

        Boolean preco) {

}