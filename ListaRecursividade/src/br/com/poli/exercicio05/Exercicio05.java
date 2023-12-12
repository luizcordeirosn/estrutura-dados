package br.com.poli.exercicio05;

public class Exercicio05 {

	// Método para inverter um array de inteiros!!!
	// i é igual ao tamanho do array decrescido de 1!!!
	public String inverterArrayInteiros(int[] inteiros, int i) {

		if (i == 0) {
			return "";
		} else {
			return inverterArrayInteiros(inteiros, i - 1) + " " + inteiros[inteiros.length - i] + " -";
		}
	}
}
