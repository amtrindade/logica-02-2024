package com.logica;

public class Calculadora {
	
	public Integer soma(Integer valor1, Integer valor2) {			
		return valor1 + valor2;				
	}
	
	public Integer subtracao(Integer valor1, Integer valor2) {
		Integer resultadoSub = 0;
		if (valor1 >= valor2) {
			resultadoSub = valor1 - valor2;
		}
		else {
			resultadoSub = valor2 - valor1;
		}
		
		return resultadoSub;
	}
	
	public Integer multiplicacao(Integer valor1, Integer valor2) {
		return valor1 * valor2;				
	}
}
