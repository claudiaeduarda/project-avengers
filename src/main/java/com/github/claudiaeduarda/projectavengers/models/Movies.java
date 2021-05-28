package com.github.claudiaeduarda.projectavengers.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movies implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;
	
	private String nome;
	private String ano;
	
	public String nome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String Ano() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
}
