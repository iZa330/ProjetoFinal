package com.projeto_final_backEnd.com.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Anamnese {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_anamnese;
	
	@Column(nullable=false)
	private boolean tem_lesao;
	
	@Column(nullable=false)
	private String detalhe_lesao;
	
	@Column(nullable=false)
	private String fator_limitante;
	
	@Column(nullable=false)
	private boolean cirurgia;
	
	@Column(nullable=false)
	private String detalhe_cirurgia;
	
	@Column(nullable=false)
	private String desconforto_diario;
	
	@Column(nullable=false)
	private String desconforto_exercicio;
	
	@Column(nullable=false)
	private String alimentacao;
	
	@Column(nullable=false)
	private boolean dieta;
	
	@Column(nullable=false)
	private String detalhe_dieta;
	
	@Column(nullable=false)
	private boolean orientacao_nutricional;
	
	@Column(nullable=false)
	private String detalhe_nutri;
	
	@Column(nullable=false)
	private boolean uso_ergogenico;
	
	@Column(nullable=false)
	private String detalhe_ergogenico;
	
	@Column(nullable=false)
	private Integer horas_sono;
	
	//@OneToMany(mappedBy = "anamnese")
	//private Set<Cliente> cliente_anamnese;
	
	public Anamnese() {}

	public Long getId_anamnese() {
		return id_anamnese;
	}

	public void setId_anamnese(Long id_anamnese) {
		this.id_anamnese = id_anamnese;
	}

	public boolean getTem_lesao() {
		return tem_lesao;
	}

	public void setTem_lesao(boolean tem_lesao) {
		this.tem_lesao = tem_lesao;
	}

	public String getFator_limitante() {
		return fator_limitante;
	}

	public void setFator_limitante(String fator_limitante) {
		this.fator_limitante = fator_limitante;
	}

	public boolean getCirurgia() {
		return cirurgia;
	}

	public void setCirurgia(boolean cirugia) {
		this.cirurgia = cirugia;
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

	public boolean getDieta() {
		return dieta;
	}

	public void setDieta(boolean dieta) {
		this.dieta = dieta;
	}

	public boolean getOrientacao_nutricional() {
		return orientacao_nutricional;
	}

	public void setOrientacao_nutricional(boolean orientacao_nutricional) {
		this.orientacao_nutricional = orientacao_nutricional;
	}

	public boolean getUso_ergogenico() {
		return uso_ergogenico;
	}

	public void setUso_ergogenico(boolean uso_ergogenico) {
		this.uso_ergogenico = uso_ergogenico;
	}

	public Integer getHoras_sono() {
		return horas_sono;
	}

	public String getDetalhe_lesao() {
		return detalhe_lesao;
	}

	public void setDetalhe_lesao(String detalhe_lesao) {
		this.detalhe_lesao = detalhe_lesao;
	}

	public String getDetalhe_cirurgia() {
		return detalhe_cirurgia;
	}

	public void setDetalhe_cirurgia(String detalhe_cirurgia) {
		this.detalhe_cirurgia = detalhe_cirurgia;
	}

	public String getDetalhe_dieta() {
		return detalhe_dieta;
	}

	public void setDetalhe_dieta(String detalhe_dieta) {
		this.detalhe_dieta = detalhe_dieta;
	}

	public String getDetalhe_nutri() {
		return detalhe_nutri;
	}

	public void setDetalhe_nutri(String detalhe_nutri) {
		this.detalhe_nutri = detalhe_nutri;
	}

	public String getDetalhe_ergogenico() {
		return detalhe_ergogenico;
	}

	public void setDetalhe_ergogenico(String detalhe_ergogenico) {
		this.detalhe_ergogenico = detalhe_ergogenico;
	}

	public void setHoras_sono(Integer horas_sono) {
		this.horas_sono = horas_sono;
	}

	/*public Set<Cliente> getCliente_anamnese() {
		return cliente_anamnese;
	}

	public void setCliente_anamnese(Set<Cliente> cliente_anamnese) {
		this.cliente_anamnese = cliente_anamnese;
	}*/

}
