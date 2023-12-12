package br.com.poli.exercicio10;

public class Exercicio10 {

	//Método para retomar a soma de todos os algarísmos de um inteiro X!!!
	public int somaDigitosInteiro(int x) {

		if (x / 10 == 0) {
			return x % 10;
		} else {
			return x % 10 + somaDigitosInteiro(x / 10);
		}
	}

}
