package com.br.vinicanalles.aws_project01.repository;

import com.br.vinicanalles.aws_project01.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {

    //Se encontrar, retorna o produto
    //Caso não encontre, ele retorna um objeto vazio
    Optional<Product> findByCode(String code);
}