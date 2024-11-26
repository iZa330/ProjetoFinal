package com.projeto_final_backEnd.com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_final_backEnd.com.entities.Anamnese;
import com.projeto_final_backEnd.com.repositories.AnamneseRepository;

@Service
public class AnamneseService {

	@Autowired
	private AnamneseRepository repository;
	
	public List<Anamnese>getAllAnamnese(){
		return repository.findAll();
	}
	
	public Optional<Anamnese> getByIdAnamnese(Long id_anamnese) {
		return repository.findById(id_anamnese);
	}
	
	
	public String saveAnamnese(Anamnese anamnese) {
		   repository.save(anamnese);
		return "Anamnese salva com sucesso!";
	}
	
	public void deleteAnamnese(Long id_anamnese) {
		repository.deleteById(id_anamnese);
	}
	
	public Anamnese perguntaTemLesao(Long id_anamnese , boolean tem_lesao , String detalhe_lesao) {
		Optional<Anamnese> optionalAnamnese = repository.findById(id_anamnese);
		
		if(optionalAnamnese.isPresent()) {
			Anamnese anamnese = optionalAnamnese.get();
			anamnese.setTem_lesao(tem_lesao);
			
			if(tem_lesao) {
				anamnese.setDetalhe_lesao(detalhe_lesao);
			}else {
				anamnese.setDetalhe_lesao("Não");
			}
			
			return repository.save(anamnese);
			
		}else {
			throw new RuntimeException("Anamnese não encontrada  para o ID:" + id_anamnese);
		}
	}
	
	public Anamnese perguntaTemCirurgia(Long id_anamnese , boolean cirurgia , String detalhe_cirurgia) {
		Optional<Anamnese> optionalAnamnese = repository.findById(id_anamnese);
		
		if(optionalAnamnese.isPresent()) {
			Anamnese anamnese = optionalAnamnese.get();
			anamnese.setCirurgia(cirurgia);
			
			if(cirurgia) {
				anamnese.setDetalhe_cirurgia(detalhe_cirurgia);;
			}else {
				anamnese.setDetalhe_cirurgia("Não");
			}
			return repository.save(anamnese);
			
		}else {
			throw new RuntimeException("Anamnese não encontrada  para o ID:" + id_anamnese);
		}
	}
	
	public Anamnese perguntaAlimentacao (Long id_anamnese , boolean dieta , boolean orientacao_nutricional , String detalhe_dieta) {
		Optional<Anamnese> optionalAnamnese = repository.findById(id_anamnese);
		
		if(optionalAnamnese.isPresent()) {
			Anamnese anamnese = optionalAnamnese.get();
			
			anamnese.setDieta(dieta);
			
			if(dieta) {
				if(orientacao_nutricional = true) {
					anamnese.setOrientacao_nutricional(orientacao_nutricional);
					
					if(!orientacao_nutricional) {
						anamnese.setDetalhe_dieta(detalhe_dieta);
					}
					
				}else {
					throw new IllegalArgumentException("É necessário responder se há orientação nutricional.");

				}
				
			}else {
				anamnese.setOrientacao_nutricional(false);
				anamnese.setDetalhe_dieta(null);
			}
			
			return repository.save(anamnese);
		}else {
			throw new RuntimeException("Anamnese não encontrada para o ID: " + id_anamnese);
		}
		
	}
	
	public Anamnese perguntaErgogenico(Long id_anamnese , boolean uso_ergogenico , String detalheErgogenico ) {
		Optional<Anamnese> optionalAnamnese = repository.findById(id_anamnese);
		
		if(optionalAnamnese.isPresent()) {
			Anamnese anamnese = optionalAnamnese.get();
			anamnese.setUso_ergogenico(uso_ergogenico);
			if(uso_ergogenico) {
				anamnese.setDetalhe_ergogenico(detalheErgogenico);
			}else {
				anamnese.setDetalhe_ergogenico("Não");
			}
			return repository.save(anamnese);
		}else {
			throw new RuntimeException("Anamnese não encontrada  para o ID:" + id_anamnese);
		}
	}
	
	
	
}
