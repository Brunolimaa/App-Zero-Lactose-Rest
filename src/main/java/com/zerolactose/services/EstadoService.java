package com.zerolactose.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerolactose.domain.Estado;
import com.zerolactose.repositories.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;
	
	public Estado findBydId(Integer id) {
		Optional<Estado> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Estado> findAll(){
		List<Estado> lista = repo.findAll();
		return lista;
	}
	
	public Estado save(Estado estado) {
		estado.setId(null);
		return repo.save(estado);
	}
	
	public Estado update(Estado estado) {
		return repo.save(estado);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
