package com.zerolactose.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zerolactose.domain.Alimento;

@Repository
public interface AlimentoRepository extends JpaRepository<Alimento, Integer>{
	
	List<Alimento> findByCategoria(Integer id);

}
