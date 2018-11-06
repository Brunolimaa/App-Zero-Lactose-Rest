package com.zerolactose.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zerolactose.domain.Estabelecimento;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Integer> {
	List<Estabelecimento> findByEstado(Integer id);
}
