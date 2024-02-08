package com.logica;

public class MainCalculadora {

	public static void main(String[] args) {
		
		Calculadora calc01 = new Calculadora();		
		
		Integer resultado = calc01.soma(1, 5);
			
		System.out.println("A soma é: "+resultado);
		
		resultado = calc01.soma(10, resultado);
		
		System.out.println("A soma é: "+resultado);
		
	}

}
