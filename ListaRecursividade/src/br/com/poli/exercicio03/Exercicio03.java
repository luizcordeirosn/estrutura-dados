package br.com.poli.exercicio03;

public class Exercicio03 {

	// M�todo para calcular a soma de um Array de inteiros!!!
	// i � o tamanho do array decrescido de 1!!!
	public int somaArrayInteiros(int[] inteiros, int i) {

		if (i == 0) {
			return inteiros[0];
		} else {
			return inteiros[i] + somaArrayInteiros(inteiros, i - 1);
		}
	}
}
