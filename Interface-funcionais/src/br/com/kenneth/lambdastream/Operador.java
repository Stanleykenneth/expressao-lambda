package br.com.kenneth.lambdastream;

@FunctionalInterface
public interface Operador {
	
	int execute (int x, int y); // Interface Funcional é uma interface que só tem um método implementado.
	
	default void falar() {
		System.out.println("Eu sou um operador!");
	}
}
