package com.github.claudiaeduarda.projectavengers.service;

import java.util.Scanner;

import com.github.claudiaeduarda.projectavengers.models.Movies;
import com.github.claudiaeduarda.projectavengers.repository.MoviesTowerRepository;

public class CrudMoviesService {

private final MoviesTowerRepository moviesTowerRepository;
	
	public CrudMoviesService(MoviesTowerRepository moviesTowerRepository) {
		this.moviesTowerRepository = moviesTowerRepository;
	}
	
	public void inicial(Scanner scanner) {
		salvar(scanner);
	}
	
	private void salvar(Scanner scanner) {
		System.out.println("Nome do filme");
		String nome = scanner.next();
		Movies movies =  new Movies();
		movies.setNome(nome);
		moviesTowerRepository.save(movies);
		System.out.println("Salvo");
		
		System.out.println("Ano");
		String ano = scanner.next();
		movies.setNome(nome);
		moviesTowerRepository.save(movies);
		System.out.println("Salvo");
		
	}
}
