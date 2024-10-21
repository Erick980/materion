package com.materion.api;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoUNRepository extends JpaRepository<ProdutoUN, Long> {

    @Query("select pv from ProdutoUN pv where pv.produto.id = :produtoId and pv.id = :produtoUNId")
    Optional<ProdutoUN> finByProdutoIdAdProdutoUNId(@Param("produtoId") Long produtoId,
            @Param("produtoUNId") Long produtoUNId);

}