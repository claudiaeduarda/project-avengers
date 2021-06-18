package com.github.claudiaeduarda.projectavengers.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.github.claudiaeduarda.projectavengers.models.Avengers;
import com.github.claudiaeduarda.projectavengers.repository.AvengersTowerRepository;

@Service
public class CrudAvengersService {

	private final AvengersTowerRepository avengersTowerRepository;
	
	public CrudAvengersService(AvengersTowerRepository avengersTowerRepository) {
		this.avengersTowerRepository = avengersTowerRepository;
	}
	
	public void inicial(Scanner scanner) {
		salvar(scanner);
	}
	
	private void salvar(Scanner scanner) {
		System.out.println("Nome do avenger");
		String nome = scanner.next();
		Avengers avengers =  new Avengers();
		avengers.setNome(nome);
		avengersTowerRepository.save(avengers);
		System.out.println("Salvo");
		
		System.out.println("Codinome do avenger");
		String codinome = scanner.next();
		avengersTowerRepository.save(avengers);
		System.out.println("Salvo");
		
		System.out.println("Filme do avenger");
		String filme = scanner.next();
		avengersTowerRepository.save(avengers);
		System.out.println("Salvo");
		
	}
}
