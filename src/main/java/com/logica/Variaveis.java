package com.logica;

public class Variaveis {

	// função ou método
	public static void imprime(String valorASerImpresso) {
		System.out.println(valorASerImpresso);
	}

	public static void main(String[] args) {

		// Criação de uma variável do tipo string
		String curso1 = "Lógica de programação";
		String curso2 = "Automação de testes com WebDriver";

		imprime(curso1 + " - " + curso2);
		imprime("06/02/2024");
		imprime("Antônio");
		imprime("4505");
		
		Integer num = 123;
		imprime(num.toString());


	}
}
