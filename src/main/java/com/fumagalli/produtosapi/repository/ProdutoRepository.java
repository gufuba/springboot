package com.fumagalli.produtosapi.repository;

import com.fumagalli.produtosapi.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, String> {
    List<ProdutoModel> findByNome(String nome);
}
