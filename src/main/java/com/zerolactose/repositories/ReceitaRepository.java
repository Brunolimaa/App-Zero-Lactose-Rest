package com.zerolactose.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zerolactose.domain.Receita;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Integer> {

}
