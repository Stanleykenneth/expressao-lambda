package br.com.kenneth.lambdastream;

@FunctionalInterface
public interface Operador {
	
	int execute (int x, int y); // Interface Funcional � uma interface que s� tem um m�todo implementado.
	
	default void falar() {
		System.out.println("Eu sou um operador!");
	}
}
