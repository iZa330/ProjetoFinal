package com.projeto_final_backEnd.com.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projeto_final_backEnd.com.dto.QuestionarioDTO;
import com.projeto_final_backEnd.com.entities.Anamnese;
import com.projeto_final_backEnd.com.entities.Cliente;
import com.projeto_final_backEnd.com.entities.HabitosTreino;
import com.projeto_final_backEnd.com.repositories.AnamneseRepository;
import com.projeto_final_backEnd.com.repositories.ClienteRepository;
import com.projeto_final_backEnd.com.repositories.HabitosTreinoRepository;


@Service
public class QuestionarioService {

	private final ClienteRepository clienteRepository;
	private final AnamneseRepository anamneseRepository;
	private final HabitosTreinoRepository habitosRepository;
	
	
	public QuestionarioService(
			ClienteRepository clienteRepository,
			AnamneseRepository anamneseRepository,
			HabitosTreinoRepository habitosRepository) {
		this.clienteRepository = clienteRepository;
		this.anamneseRepository = anamneseRepository;
		this.habitosRepository = habitosRepository;
	}
	
	public void saveQuestionario(QuestionarioDTO dto) {
		Cliente cliente = new Cliente();
		cliente.setNome_completo(dto.getNome_completo());
		cliente.setData_nascimento(dto.getData_nascimento());
		cliente.setContato_nome(dto.getContato_nome());
		cliente.setContato_telefone(dto.getContato_telefone());
		clienteRepository.save(cliente);
		
		Anamnese anamnese = new Anamnese();
		anamnese.setTem_lesao(dto.getTem_lesao());
		anamnese.setDetalhe_lesao(dto.getDetalhe_lesao());
		anamnese.setFator_limitante(dto.getFator_limitante());
		anamnese.setCirurgia(dto.getCirurgia());
		anamnese.setDetalhe_cirurgia(dto.getDetalhe_cirurgia());
		anamnese.setDesconforto_diario(dto.getDesconforto_diario());
		anamnese.setDesconforto_exercicio(dto.getDesconforto_exercicio());
		anamnese.setAlimentacao(dto.getAlimentacao());
		anamnese.setDieta(dto.getDieta());
		anamnese.setDetalhe_dieta(dto.getDetalhe_dieta());
		anamnese.setOrientacao_nutricional(dto.getOrientacao_nutricional());
		anamnese.setDetalhe_nutri(dto.getDetalhe_nutri());
		anamnese.setUso_ergogenico(dto.getUso_ergogenico());
		anamnese.setHoras_sono(dto.getHoras_sono());
		if (dto.getDetalhe_ergogenico() == null) {
		    anamnese.setDetalhe_ergogenico("");  // ou um valor padrão
		} else {
		    anamnese.setDetalhe_ergogenico(dto.getDetalhe_ergogenico());
		}

		anamneseRepository.save(anamnese);
		
		HabitosTreino habitos = new HabitosTreino();
		habitos.setHoras_trabalho_por_dia(dto.getHoras_trabalho_por_dia());
		habitos.setAtividade_trabalho(dto.getAtividade_trabalho());
		habitos.setDias_musculacao(dto.getDias_musculacao());
		habitos.setDias_aerobico(dto.getDias_aerobico());
		habitos.setTempo_musculacao(dto.getTempo_musculacao());
		habitos.setTempo_aerobico(dto.getTempo_aerobico());
		habitos.setExercicio_favorito(dto.getExercicio_favorito());
		habitos.setExercicio_nao_gosta(dto.getExercicio_nao_gosta());
		habitos.setGrupo_muscular_favorito(dto.getGrupoMuscular_favorito());;
		habitos.setGosta_alongamento(dto.getGosta_alongamento());
		habitosRepository.save(habitos);
	}
	
	
	public QuestionarioDTO getUltimoQuestionario() {
	    Cliente ultimoCliente = clienteRepository.findTopByOrderById_clienteDesc()
	            .orElseThrow(() -> new RuntimeException("Nenhum cliente encontrado."));
	    Anamnese anamnese = anamneseRepository.findById(ultimoCliente.getId_cliente())
	            .orElseThrow(() -> new RuntimeException("Anamnese não encontrada."));
	    HabitosTreino habitos = habitosRepository.findById(ultimoCliente.getId_cliente())
	            .orElseThrow(() -> new RuntimeException("Hábitos de treino não encontrados."));

	    return new QuestionarioDTO(
	            ultimoCliente.getNome_completo(),
	            ultimoCliente.getData_nascimento(),
	            ultimoCliente.getContato_nome(),
	            ultimoCliente.getContato_telefone(),
	            habitos.getHoras_trabalho_por_dia(),
	            habitos.getAtividade_trabalho(),
	            habitos.getDias_musculacao(),
	            habitos.getDias_aerobico(),
	            habitos.getTempo_musculacao(),
	            habitos.getTempo_aerobico(),
	            habitos.getExercicio_favorito(),
	            habitos.getExercicio_nao_gosta(),
	            habitos.getGrupo_muscular_favorito(),
	            habitos.getGosta_alongamento(),
	            anamnese.getTem_lesao(),
	            anamnese.getDetalhe_lesao(),
	            anamnese.getFator_limitante(),
	            anamnese.getCirurgia(),
	            anamnese.getDetalhe_cirurgia(),
	            anamnese.getDesconforto_diario(),
	            anamnese.getDesconforto_exercicio(),
	            anamnese.getAlimentacao(),
	            anamnese.getDieta(),
	            anamnese.getDetalhe_dieta(),
	            anamnese.getOrientacao_nutricional(),
	            anamnese.getDetalhe_nutri(),
	            anamnese.getUso_ergogenico(),
	            anamnese.getDetalhe_ergogenico(),
	            anamnese.getHoras_sono(), null, null, null, null, null
	    );
	}

    
    public List<QuestionarioDTO> getTodosQuestionarios() {
        List<Cliente> clientes = clienteRepository.findAll();

        return clientes.stream().map(cliente -> {
            Anamnese anamnese = anamneseRepository.findById(cliente.getId_cliente()).orElseThrow();
            HabitosTreino habitos = habitosRepository.findById(cliente.getId_cliente()).orElseThrow();

            return new QuestionarioDTO(
            	
                    cliente.getNome_completo(),
                    cliente.getData_nascimento(),
                    cliente.getContato_nome(),
                    cliente.getContato_telefone(),
                    habitos.getHoras_trabalho_por_dia(),
                    habitos.getAtividade_trabalho(),
                    habitos.getDias_musculacao(),
                    habitos.getDias_aerobico(),
                    habitos.getTempo_musculacao(),
                    habitos.getTempo_aerobico(),
                    habitos.getExercicio_favorito(),
                    habitos.getExercicio_nao_gosta(),
                    habitos.getGrupo_muscular_favorito(),
                    habitos.getGosta_alongamento(),
                    anamnese.getTem_lesao(),
                    anamnese.getDetalhe_lesao(),
                    anamnese.getFator_limitante(),
                    anamnese.getCirurgia(),
                    anamnese.getDetalhe_cirurgia(),
                    anamnese.getDesconforto_diario(),
                    anamnese.getDesconforto_exercicio(),
                    anamnese.getAlimentacao(),
                    anamnese.getDieta(),
                    anamnese.getDetalhe_dieta(),
                    anamnese.getOrientacao_nutricional(),
                    anamnese.getDetalhe_nutri(),
                    anamnese.getUso_ergogenico(),
                    anamnese.getDetalhe_ergogenico(),
                    anamnese.getHoras_sono(), null, null, null, null, null
            );
        }).collect(Collectors.toList());
    }
}
