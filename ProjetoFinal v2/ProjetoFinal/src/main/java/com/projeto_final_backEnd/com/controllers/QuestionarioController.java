package com.projeto_final_backEnd.com.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto_final_backEnd.com.dto.QuestionarioDTO;
import com.projeto_final_backEnd.com.services.QuestionarioService;

@RestController
@RequestMapping("/questionario")
public class QuestionarioController {
	
	private final QuestionarioService questionarioService;
	
	public QuestionarioController(QuestionarioService questionarioService) {
		this.questionarioService = questionarioService;
	}
	
	@PostMapping
	public ResponseEntity<String> saveQuestionario(@RequestBody QuestionarioDTO dto){
		questionarioService.saveQuestionario(dto);
		return ResponseEntity.ok("Questionário salvo com sucesso!");
	}
	@GetMapping("/ultimo")
    public ResponseEntity<QuestionarioDTO> getUltimoQuestionario() {
        return ResponseEntity.ok(questionarioService.getUltimoQuestionario());
    }

    @GetMapping
    public ResponseEntity<List<QuestionarioDTO>> getTodosQuestionarios() {
        return ResponseEntity.ok(questionarioService.getTodosQuestionarios());
    }

}
