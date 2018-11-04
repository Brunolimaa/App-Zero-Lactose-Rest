package com.zerolactose;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zerolactose.domain.Alimento;
import com.zerolactose.domain.Categoria;
import com.zerolactose.repositories.AlimentoRepository;
import com.zerolactose.repositories.CategoriaRepository;
import com.zerolactose.repositories.EstabelecimentoRepository;

@SpringBootApplication
public class ZerolactApplication implements CommandLineRunner{

	@Autowired
	private AlimentoRepository alimentoRepository;
	@Autowired
	private CategoriaRepository categoriaRepo;
	@Autowired
	private EstabelecimentoRepository estaRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ZerolactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*		this.descricao = descricao;
		this.detalhe = detalhe;
		this.foto = foto;
		this.nome = nome;*/
		//Categoria categoria = new Categoria(1,"legumentos");

		//Alimento alimento = new Alimento(1, "teste", "teste detalhe", "", "banana", categoria);
		//Alimento alimento1 = new Alimento(2, "teste 1", "teste detalhe 1", "", "mamao", categoria);
		//List<Alimento> alimentos = new ArrayList<>();
		//alimentos.add(alimento);
		//alimentos.add(alimento1);
		
//		categoriaRepo.save(categoria);
//
//		alimentoRepository.save(alimento);
		//alimentoRepository.save(alimento1);
		
		
		

		
	}
	
	
}
