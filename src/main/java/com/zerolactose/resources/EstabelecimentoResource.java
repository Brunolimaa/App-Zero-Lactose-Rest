package com.zerolactose.resources;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.zerolactose.domain.Estabelecimento;
import com.zerolactose.services.EstabelecimentoService;

@CrossOrigin
@RestController
@RequestMapping(value="/estabelecimentos")
public class EstabelecimentoResource {

	private EstabelecimentoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> buscarId(@PathVariable Integer id) {
		Estabelecimento obj = service.findBydId(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Estabelecimento> buscarTodos(){
		return service.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> inserir(@RequestBody Estabelecimento entity){
		entity = service.save(entity);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(entity.getId()).toUri();
		return ResponseEntity.created(uri).build();	
	}
}
