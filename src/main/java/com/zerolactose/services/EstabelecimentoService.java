package com.zerolactose.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.zerolactose.domain.Estabelecimento;
import com.zerolactose.repositories.EstabelecimentoRepository;

@Service
public class EstabelecimentoService {
	
	@Autowired
	private EstabelecimentoRepository repo;
	
	public Estabelecimento findBydId(Integer id) {
		Optional<Estabelecimento> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Estabelecimento> findBydIdCidade(Integer id) {
		return repo.findByEstado(id);
	}
	
	public List<Estabelecimento> findAll(){
		List<Estabelecimento> lista = repo.findAll();
		return lista;
	}
	
	public Estabelecimento save(Estabelecimento estabelecimento) {
		estabelecimento.setId(null);
		return repo.save(estabelecimento);
	}
	
	public Estabelecimento update(Estabelecimento estabelecimento) {
		return repo.save(estabelecimento);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
