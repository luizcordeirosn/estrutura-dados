package br.com.poli.exercicio02;

public class Exercicio02 {

	// M�todo para calcular a pot�ncia ( base^expoente)!!!
	public int potencia(int base, int expoente) {

		//Se base = 0, retornar o pr�prio 0, caso base direferente de 0 e expoente = 0, retornar 1!!!
		if (base == 0) {
			return 0;
		} else if (expoente == 0) {
			return 1;
		} else {

			return base * potencia(base, expoente - 1);
		}
	}
}
