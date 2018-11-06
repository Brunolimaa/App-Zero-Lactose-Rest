package com.zerolactose.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerolactose.domain.Cidade;
import com.zerolactose.repositories.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;
	
	public Cidade findBydId(Integer id) {
		Optional<Cidade> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Cidade> findAll(){
		List<Cidade> lista = repo.findAll();
		return lista;
	}
	
	public Cidade save(Cidade cidade) {
		cidade.setId(null);
		return repo.save(cidade);
	}
	
	public Cidade update(Cidade cidade) {
		return repo.save(cidade);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
