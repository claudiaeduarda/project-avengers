package com.github.claudiaeduarda.projectavengers;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.claudiaeduarda.projectavengers.service.CrudAvengersService;

@SpringBootApplication
public class ProjectAvengersApplication implements CommandLineRunner {
	
	private final CrudAvengersService avengersService;
	
	private Boolean system = true;
	
	public ProjectAvengersApplication(CrudAvengersService avengersService) {
		this.avengersService = avengersService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjectAvengersApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		while(system) {
			System.out.println("Qual acao deseja executar");
			System.out.println("0 = Sair");
			System.out.println("1 = Avengers");
			
			int action = scanner.nextInt();
			if (action == 1) {
				avengersService.inicial(scanner);
			} else {
				system = false;
			}
		}
	}

}
