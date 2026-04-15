package com.fumagalli.produtosapi.repository;

import com.fumagalli.produtosapi.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, String> {
}
