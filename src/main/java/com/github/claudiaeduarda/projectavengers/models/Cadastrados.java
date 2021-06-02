package com.github.claudiaeduarda.projectavengers.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Cadastrados {

	private String id;
	private String nomeAvenger;
	private String nomeFilme;
	
	@ManyToOne
	private Avengers avengers;
	private Movies movies;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomeAvenger() {
		return nomeAvenger;
	}
	public void setNomeAvenger(String nomeAvenger) {
		this.nomeAvenger = nomeAvenger;
	}
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public Avengers getAvengers() {
		return avengers;
	}
	public void setAvengers(Avengers avengers) {
		this.avengers = avengers;
	}
	public Movies getMovies() {
		return movies;
	}
	public void setMovies(Movies movies) {
		this.movies = movies;
	}
	
	
}

