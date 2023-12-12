package br.com.poli.exercicio03;

public class Main {

	public static void main(String[] args) {

		Exercicio03 e = new Exercicio03();
		int[] teste = { 2, 5, -20, 7, 100, 1, -14, 78, 30, 0 };

		System.out.println(e.somaArrayInteiros(teste, teste.length - 1));
	}
}
