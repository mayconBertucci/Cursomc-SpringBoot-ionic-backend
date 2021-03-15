package com.mayconbertucci.mc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mayconbertucci.mc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {}
