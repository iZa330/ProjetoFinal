package com.projeto_final_backEnd.com.dto;

import java.time.LocalDate;


public class QuestionarioDTO {

	// Dados do Cliente
	    private String nome_completo;
	    private LocalDate data_nascimento;
	    private String contato_nome;
	    private String contato_telefone;

	    // Dados de Hábito de Treino
	    private Integer horas_trabalho_por_dia;
	    private String atividade_trabalho;
	    private Integer dias_musculacao;
	    private Integer dias_aerobico;
	    private Integer tempo_musculacao;
	    private Integer tempo_aerobico;
	    private String exercicio_favorito;
	    private String exercicio_nao_gosta;
	    private String grupoMuscular_favorito;
	    private String gosta_alongamento;

	    // Dados de Anamnese
	    private Boolean tem_lesao;
	    private String detalhe_lesao;
	    private String fator_limitante;
	    private Boolean cirurgia;
	    private String detalhe_cirurgia;
	    private String desconforto_diario;
	    private String desconforto_exercicio;
	    private String alimentacao;
	    private Boolean dieta;
	    private String detalhe_dieta;
	    private Boolean orientacao_nutricional;
	    private String detalhe_nutri;
	    private Boolean uso_ergogenico;
	    private String detalhe_ergogenico;
	    private Integer horas_sono;
	    
	    public QuestionarioDTO() {}
	    
	    
		public QuestionarioDTO(String nome_completo, LocalDate data_nascimento, String contato_nome,
				String contato_telefone, Integer horas_trabalho_por_dia, String atividade_trabalho,
				Integer dias_musculacao, Integer dias_aerobico, Integer tempo_musculacao, Integer tempo_aerobico,
				String exercicio_favorito, String exercicio_nao_gosta, String grupo_muscular_favorito,
				String gosta_alongamento, boolean tem_lesao, String detalhe_lesao, String fator_limitante,
				boolean cirurgia, String detalhe_cirurgia, String desconforto_diario, String desconforto_exercicio,
				String alimentacao, boolean dieta, String detalhe_dieta2, boolean orientacao_nutricional,
				String detalhe_nutri, boolean uso_ergogenico, String detalhe_ergogenico, Integer horas_sono, String grupoMuscular_favorito, String detalhe_dieta, Long id_habitos, Long id_anamnese, Long id_cliente) {
			
			this.nome_completo = nome_completo;
		     this.data_nascimento = data_nascimento;
		     this.contato_nome = contato_nome;
		     this.contato_telefone = contato_telefone;
		     this.horas_trabalho_por_dia = horas_trabalho_por_dia;
		     this.atividade_trabalho = atividade_trabalho;
		     this.dias_musculacao = dias_musculacao;
		     this.dias_aerobico = dias_aerobico;
		     this.tempo_musculacao = tempo_musculacao;
		     this.tempo_aerobico = tempo_aerobico;
		     this.exercicio_favorito = exercicio_favorito;
		     this.exercicio_nao_gosta = exercicio_nao_gosta;
		     this.grupoMuscular_favorito = grupoMuscular_favorito;
		     this.gosta_alongamento = gosta_alongamento;
		     this.tem_lesao = tem_lesao;
		     this.detalhe_lesao = detalhe_lesao;
		     this.fator_limitante = fator_limitante;
		     this.cirurgia = cirurgia;
		     this.detalhe_cirurgia = detalhe_cirurgia;
		     this.desconforto_diario = desconforto_diario;
		     this.desconforto_exercicio = desconforto_exercicio;
		     this.alimentacao = alimentacao;
		     this.dieta = dieta;
		     this.detalhe_dieta = detalhe_dieta;
		     this.orientacao_nutricional = orientacao_nutricional;
		     this.detalhe_nutri = detalhe_nutri;
		     this.uso_ergogenico = uso_ergogenico;
		     this.detalhe_ergogenico = detalhe_ergogenico;
		   
		}
		
		
		public String getNome_completo() {
			return nome_completo;
		}
		public void setNome_completo(String nome_completo) {
			this.nome_completo = nome_completo;
		}
		public LocalDate getData_nascimento() {
			return data_nascimento;
		}
		public void setData_nascimento(LocalDate data_nascimento) {
			this.data_nascimento = data_nascimento;
		}
		public String getContato_nome() {
			return contato_nome;
		}
		public void setContato_nome(String contato_nome) {
			this.contato_nome = contato_nome;
		}
		public String getContato_telefone() {
			return contato_telefone;
		}
		public void setContato_telefone(String contato_telefone) {
			this.contato_telefone = contato_telefone;
		}
		public Integer getHoras_trabalho_por_dia() {
			return horas_trabalho_por_dia;
		}
		public void setHoras_trabalho_por_dia(Integer horas_trabalho_por_dia) {
			this.horas_trabalho_por_dia = horas_trabalho_por_dia;
		}
		public String getAtividade_trabalho() {
			return atividade_trabalho;
		}
		public void setAtividade_trabalho(String atividade_trabalho) {
			this.atividade_trabalho = atividade_trabalho;
		}
		public Integer getDias_musculacao() {
			return dias_musculacao;
		}
		public void setDias_musculacao(Integer dias_musculacao) {
			this.dias_musculacao = dias_musculacao;
		}
		public Integer getDias_aerobico() {
			return dias_aerobico;
		}
		public void setDias_aerobico(Integer dias_aerobico) {
			this.dias_aerobico = dias_aerobico;
		}
		public Integer getTempo_musculacao() {
			return tempo_musculacao;
		}
		public void setTempo_musculacao(Integer tempo_musculacao) {
			this.tempo_musculacao = tempo_musculacao;
		}
		public Integer getTempo_aerobico() {
			return tempo_aerobico;
		}
		public void setTempo_aerobico(Integer tempo_aerobico) {
			this.tempo_aerobico = tempo_aerobico;
		}
		public String getExercicio_favorito() {
			return exercicio_favorito;
		}
		public void setExercicio_favorito(String exercicio_favorito) {
			this.exercicio_favorito = exercicio_favorito;
		}
		public String getExercicio_nao_gosta() {
			return exercicio_nao_gosta;
		}
		public void setExercicio_nao_gosta(String exercicio_nao_gosta) {
			this.exercicio_nao_gosta = exercicio_nao_gosta;
		}
		public String getGrupoMuscular_favorito() {
			return grupoMuscular_favorito;
		}
		public void setGrupoMuscular_favorito(String grupoMuscular_favorito) {
			this.grupoMuscular_favorito = grupoMuscular_favorito;
		}
		public String getGosta_alongamento() {
			return gosta_alongamento;
		}
		public void setGosta_alongamento(String gosta_alongamento) {
			this.gosta_alongamento = gosta_alongamento;
		}
		public Boolean getTem_lesao() {
			return tem_lesao;
		}
		public void setTem_lesao(Boolean tem_lesao) {
			this.tem_lesao = tem_lesao;
		}
		public String getDetalhe_lesao() {
			return detalhe_lesao;
		}
		public void setDetalhe_lesao(String detalhe_lesao) {
			this.detalhe_lesao = detalhe_lesao;
		}
		public String getFator_limitante() {
			return fator_limitante;
		}
		public void setFator_limitante(String fator_limitante) {
			this.fator_limitante = fator_limitante;
		}
		public Boolean getCirurgia() {
			return cirurgia;
		}
		public void setCirurgia(Boolean cirurgia) {
			this.cirurgia = cirurgia;
		}
		public String getDetalhe_cirurgia() {
			return detalhe_cirurgia;
		}
		public void setDetalhe_cirurgia(String detalhe_cirurgia) {
			this.detalhe_cirurgia = detalhe_cirurgia;
		}
		public String getDesconforto_diario() {
			return desconforto_diario;
		}
		public void setDesconforto_diario(String desconforto_diario) {
			this.desconforto_diario = desconforto_diario;
		}
		public String getDesconforto_exercicio() {
			return desconforto_exercicio;
		}
		public void setDesconforto_exercicio(String desconforto_exercicio) {
			this.desconforto_exercicio = desconforto_exercicio;
		}
		public String getAlimentacao() {
			return alimentacao;
		}
		public void setAlimentacao(String alimentacao) {
			this.alimentacao = alimentacao;
		}
		public Boolean getDieta() {
			return dieta;
		}
		public void setDieta(Boolean dieta) {
			this.dieta = dieta;
		}
		public String getDetalhe_dieta() {
			return detalhe_dieta;
		}
		public void setDetalhe_dieta(String detalhe_dieta) {
			this.detalhe_dieta = detalhe_dieta;
		}
		public Boolean getOrientacao_nutricional() {
			return orientacao_nutricional;
		}
		public void setOrientacao_nutricional(Boolean orientacao_nutricional) {
			this.orientacao_nutricional = orientacao_nutricional;
		}
		public String getDetalhe_nutri() {
			return detalhe_nutri;
		}
		public void setDetalhe_nutri(String detalhe_nutri) {
			this.detalhe_nutri = detalhe_nutri;
		}
		public Boolean getUso_ergogenico() {
			return uso_ergogenico;
		}
		public void setUso_ergogenico(Boolean uso_ergogenico) {
			this.uso_ergogenico = uso_ergogenico;
		}
		public String getDetalhe_ergogenico() {
			return detalhe_ergogenico;
		}
		public void setDetalhe_ergogenico(String detalhe_ergogenico) {
			this.detalhe_ergogenico = detalhe_ergogenico;
		}
		public Integer getHoras_sono() {
			return horas_sono;
		}
		public void setHoras_sono(Integer horas_sono) {
			this.horas_sono = horas_sono;
		}
}
