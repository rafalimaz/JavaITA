package com.limaz.javaita.S1L3.carro;

public class Carro {
	int potencia;
	int velocidade;
	String nome;
	
	void acelerar() {
		velocidade += potencia;
	}
	
	void frear() {
		velocidade = velocidade/2;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	
	void imprimir() {
		System.out.println("O carro " + nome + " est� a velocidade de " + getVelocidade() + " km/h");
	}
}
