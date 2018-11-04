package com.zerolactose.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerolactose.domain.Categoria;
import com.zerolactose.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> res = repo.findById(id);
		return res.orElse(null);
	}
	
	public List<Categoria> buscarTodos(){
		List<Categoria> lista = repo.findAll();
		return lista;
	}
	
	public Categoria save(Categoria categoria) {
		categoria.setId(null);
		return repo.save(categoria);
	}
	
	public Categoria update(Categoria categoria) {
		return repo.save(categoria);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
