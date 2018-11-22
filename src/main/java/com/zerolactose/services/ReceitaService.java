package com.zerolactose.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerolactose.domain.Receita;
import com.zerolactose.repositories.ReceitaRepository;

@Service
public class ReceitaService {
	
	@Autowired
	private ReceitaRepository repo;
	
	public Receita findBydId(Integer id) {
		Optional<Receita> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Receita> findAll(){
		List<Receita> lista = repo.findAll();
		return lista;
	}
	
	public Receita save(Receita receita) {
		receita.setId(null);
		return repo.save(receita);
	}
	
	public Receita update(Receita receita) {
		return repo.save(receita);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
