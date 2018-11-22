package com.zerolactose.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zerolactose.domain.ModoPreparo;
import com.zerolactose.repositories.ModoPreparoRepository;

@Service
public class ModoPreparoService {
	
	private ModoPreparoRepository repo;
	
	public ModoPreparo findBydId(Integer id) {
		Optional<ModoPreparo> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<ModoPreparo> findAll(){
		List<ModoPreparo> lista = repo.findAll();
		return lista;
	}
	
	public ModoPreparo save(ModoPreparo modoPreparo) {
		modoPreparo.setId(null);
		return repo.save(modoPreparo);
	}
	
	public ModoPreparo update(ModoPreparo ingrediente) {
		return repo.save(ingrediente);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
