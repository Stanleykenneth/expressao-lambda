package br.com.kenneth.lambdastream;

public class Main {

	public static void main(String[] args) {
		
		Operador op = (x, y) -> x * y;
		System.out.println(op.execute(5, 2));
	}

}
