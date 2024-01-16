package com.generation.Rapimed.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 2, max = 255, message = "A Categoria deve ter no minimo 2 caracteres e no máximo 255 caracteres")
	@NotBlank (message = "Atributo nomeCategoria é obrigatório")
	private String nomeCategoria;
	
	@Size(min = 10, max = 255, message = "A Descrição deve ter no minimo 10 caracteres e no máximo 255 caracteres")
	@NotBlank(message = "Atributo descricaoCategoria é obrigatório")
	private String descricaoCategoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
	

}
