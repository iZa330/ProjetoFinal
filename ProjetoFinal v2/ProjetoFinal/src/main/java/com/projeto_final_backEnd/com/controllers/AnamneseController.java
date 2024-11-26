package com.projeto_final_backEnd.com.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projeto_final_backEnd.com.entities.Anamnese;
import com.projeto_final_backEnd.com.services.AnamneseService;

@RestController
@RequestMapping("/anamnese")
public class AnamneseController {
	
	@Autowired
	private AnamneseService service;
	
	@GetMapping
	public ResponseEntity <List<Anamnese>> getAllAnamnese(){
		return ResponseEntity.ok(service.getAllAnamnese());
	}
	

	@GetMapping(value = "/{id_anamnese}")
	public ResponseEntity<Anamnese> getByIdAnamnese(@PathVariable Long id_anamnese){
		Optional<Anamnese> anamnese =service.getByIdAnamnese(id_anamnese);
		return anamnese.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<String> createAnamnese(@RequestBody Anamnese ananmnese){
		return ResponseEntity.ok(service.saveAnamnese(ananmnese));
	}
	

	@PutMapping(value = "/{id_anamnese}")
	public ResponseEntity<String> updateAnamnese(@PathVariable Long id_anamnese , @RequestBody Anamnese updateAnamnese){
		Optional<Anamnese> existingAnamnese = service.getByIdAnamnese(id_anamnese);
		if(existingAnamnese.isPresent()) {
			updateAnamnese.setId_anamnese(id_anamnese);
			return ResponseEntity.ok(service.saveAnamnese(updateAnamnese));
		}else {
			return ResponseEntity.notFound().build();
		}
	}

		@DeleteMapping(value = "/{id_anamnese}")
		public ResponseEntity<Void> deleteAnamnese(@PathVariable Long id_anamnese){
			if(service.getByIdAnamnese(id_anamnese).isPresent()) {
				service.deleteAnamnese(id_anamnese);
				return ResponseEntity.ok().build();
			}else {
				return ResponseEntity.notFound().build();
			}
		}
		

		@PutMapping(value = "/{id_anamnese}/lesao")
		public ResponseEntity<Anamnese> perguntaTem_lesao(@PathVariable Long id_anamnese , @RequestParam boolean tem_lesao , @RequestParam(required = false) String detalhe_lesao){
			Anamnese anamnese = service.perguntaTemLesao(id_anamnese, tem_lesao, detalhe_lesao);
			return ResponseEntity.ok(anamnese);
		}
		

		@PutMapping(value = "/{id_anamnese}/cirurgia")
		public ResponseEntity<Anamnese> perguntaCirurgia(@PathVariable Long id_anamnese , @RequestParam boolean cirurgia , @RequestParam(required = false) String detalhe_cirurgia){
			Anamnese anamnese = service.perguntaTemCirurgia(id_anamnese, cirurgia, detalhe_cirurgia);
			return ResponseEntity.ok(anamnese);
		}
		

		@PutMapping(value = "/{id_anamnese}/alimentacao")
		public ResponseEntity<Anamnese> perguntaAlimentacao(@PathVariable Long id_anamnese , @RequestParam boolean dieta , @RequestParam boolean orientacao_nutricional , @RequestParam(required = false) String detalhe_dieta){
			Anamnese anamnese =service.perguntaAlimentacao(id_anamnese, dieta, orientacao_nutricional, detalhe_dieta);
			return ResponseEntity.ok(anamnese);
		}
		

		@PutMapping(value = "/{id_anamnese}/ergogenico")
		public ResponseEntity<Anamnese> perguntaErgogenico(@PathVariable Long id_anamnese , @RequestParam boolean uso_ergogenico , @RequestParam(required = false) String detalhe_ergogenico){
			Anamnese anamnese = service.perguntaErgogenico(id_anamnese, uso_ergogenico, detalhe_ergogenico);
			return ResponseEntity.ok(anamnese);
		}
		
}
