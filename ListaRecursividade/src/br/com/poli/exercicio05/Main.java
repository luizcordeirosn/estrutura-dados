package br.com.poli.exercicio05;

public class Main {

	public static void main(String[] args) {

		Exercicio05 e = new Exercicio05();
		int[] teste = { 1, 0, -20, 14, 27, -38, 10, 19, -730, 90, 78 };

		System.out.println(e.inverterArrayInteiros(teste, teste.length));
	}
}
