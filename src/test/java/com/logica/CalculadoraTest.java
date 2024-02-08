package com.logica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	@Test
	public void somaDoisNumerosPositivos() {	
		Calculadora calculadora = new Calculadora();	
		Integer resultado = calculadora.soma(10, 15);
		
		assertEquals(25, resultado);				
	}
	
	@Test
	public void somaComNumeroNegativo() {
		Calculadora calculadora = new Calculadora();
		assertEquals(-17, calculadora.soma(-5, -12));		
	}
	
	@Test
	public void subtracaoValor1Maior() {
		Calculadora calculadora = new Calculadora();
		
		assertEquals(18, calculadora.subtracao(20, 2));
	}
	
	@Test
	public void subracaoValor2Maior() {		
		Calculadora calculadora = new Calculadora();
		
		assertEquals(18, calculadora.subtracao(2, 20));		
	}
	
	@Test
	public void multiplicacaoValoresPositivos() {
		Calculadora calculadora = new Calculadora();
		assertEquals(8, calculadora.multiplicacao(2, 4));
	}
	
	@Test
	public void multiplicacaoValoresNegativos() {
		Calculadora calculadora = new Calculadora();
		assertEquals(8, calculadora.multiplicacao(-2, -4));
	}
	
	@Test
	public void multiplicacaoValor1Negativo() {
		Calculadora calculadora = new Calculadora();
		assertEquals(-8, calculadora.multiplicacao(2, -4));
	}
	

}
