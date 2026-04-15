package com.fumagalli.produtosapi.controller;

import com.fumagalli.produtosapi.model.ProdutoModel;
import com.fumagalli.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public ProdutoModel salvar(@RequestBody ProdutoModel produtoModel){
        System.out.println("Produto recebido: " + produtoModel);

        var id = UUID.randomUUID().toString();
        produtoModel.setId(id);

        produtoRepository.save(produtoModel);
        return produtoModel;
    }

    @GetMapping("{id}")
    public ProdutoModel buscar(@PathVariable("id") String id){
       // Optional<ProdutoModel> produtoModel = produtoRepository.findById(id);
       // return produtoModel.isPresent() ? produtoModel.get() : null;

       return produtoRepository.findById(id).orElse(null);
    }
}
