package com.example.aulaid;

import com.exemple.aulaid.services.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaidSpringApplication implements CommandLineRunner {

	 /*Também posso fazer dessa forma a injeção da dependência.
	Coloco um Autowired e se a classe estiver dita como sendo do tipo Component (ou service por ex,
	o SB já vai entender que eu quero injetar a dependência e eu não preciso fazer mais nada*/
	@Autowired
	private PayService payService;

	public static void main(String[] args) {
		SpringApplication.run(AulaidSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RESULTADO = " + payService.finalPrice(300.0, "SC"));/*Vou precisar instanciar
		o PayService*/
	}
}
