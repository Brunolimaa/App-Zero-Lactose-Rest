package com.zerolactose.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zerolactose.domain.ModoPreparo;

@Repository
public interface ModoPreparoRepository extends JpaRepository<ModoPreparo, Integer>{

}
