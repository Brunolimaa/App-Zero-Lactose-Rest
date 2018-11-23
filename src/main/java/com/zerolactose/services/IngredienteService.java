package com.zerolactose.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerolactose.domain.Ingrediente;
import com.zerolactose.repositories.IngredienteRepository;

@Service
public class IngredienteService {
	
	@Autowired
	private IngredienteRepository repo;
	
	public Ingrediente findBydId(Integer id) {
		Optional<Ingrediente> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Ingrediente> findAll(){
		List<Ingrediente> lista = repo.findAll();
		return lista;
	}
	
	public Ingrediente save(Ingrediente ingrediente) {
		ingrediente.setId(null);
		return repo.save(ingrediente);
	}
	
	public Ingrediente update(Ingrediente ingrediente) {
		return repo.save(ingrediente);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
