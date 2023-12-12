package br.com.poli.exercicio01;

public class Exercicio01 {

	// Método para retornar o valor de (N,M) no triângulo de Pascal !!!
	// N para linha e M para coluna!!!
	public int pascal(int n, int m) {

		if (n == 0) {
			//Retornar 1 caso N e M = 0 respectivamente, caso não, retornar 0!!!
			if (m == 0) {
				return 1;
			} else
				return 0;
		} else {
			return pascal(n - 1, m) + pascal(n - 1, m - 1);
		}
	}
}
