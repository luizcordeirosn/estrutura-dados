package br.com.poli.funcoes;

public class Funcoes {
	
	// Método para calcular potência!!!
		public int pot(int a, int b) {

			if (a == 0) {
				return 0;
			} else if (b == 0) {
				return 1;
			} else {
				return a * pot(a, b - 1);
			}
		}
	//Merilo, não sei como você é meu mentor!!!
}
