package com.sunflower.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunflower.ecommerce.model.Categoria;
import com.sunflower.ecommerce.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	 public ResponseEntity<List<Categoria>> getAll() {
        return ResponseEntity.ok(categoriaRepository.findAll());
    }

//	@GetMapping("/{id}")
//	public ResponseEntity<Categoria> getById(@PathVariable long id) {
//		return repository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
//				.orElse(ResponseEntity.notFound().build());
//	}
//
//	@GetMapping("descricao/{descricao}")
//	public ResponseEntity<List<Categoria>> getByDescricao(@PathVariable String descricao_categoria) {
//		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao_categoria));
//	}
//
//	//@PutMapping
//	public ResponseEntity<Categoria> putCategoria(@Valid @RequestBody Categoria descricao_categoria) {
//		return repository.findById(descricao_categoria.getId())
//				.map(resposta -> ResponseEntity.ok().body(repository.save(descricao_categoria)))
//				.orElse(ResponseEntity.notFound().build());
//	}
//
//	//@DeleteMapping("/{id}")
//	public ResponseEntity<?> deletePostagem(@PathVariable long id) {
//		return repository.findById(id).map(resposta -> {
//			repository.deleteById(id);
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//		}).orElse(ResponseEntity.notFound().build());

	}
