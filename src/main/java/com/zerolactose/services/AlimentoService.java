package com.zerolactose.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerolactose.domain.Alimento;
import com.zerolactose.repositories.AlimentoRepository;

@Service
public class AlimentoService {

	@Autowired
	private AlimentoRepository repo;
	
	public Alimento findById(Integer id) {
		Optional<Alimento> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Alimento> findAll() {
		return repo.findAll();
	}
	
	public Alimento save(Alimento alimento) {
		alimento.setId(null);
		return repo.save(alimento);
	}
	
}
