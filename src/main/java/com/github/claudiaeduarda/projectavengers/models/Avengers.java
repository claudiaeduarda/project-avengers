package com.github.claudiaeduarda.projectavengers.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_AVENGERS")
public class Avengers implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;
	private String nome;
	private String codinome;
	private String filme;
	
	@OneToMany
	private List<Cadastrados> cadastrados;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodinome() {
		return codinome;
	}
	public void setCodinome(String codinome) {
		this.codinome = codinome;
	}
	public String getFilme() {
		return filme;
	}
	public void setFlme(String filme) {
		this.filme = filme;
	}
}
