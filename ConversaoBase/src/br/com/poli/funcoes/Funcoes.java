package br.com.poli.funcoes;

public class Funcoes {
	
	// M�todo para calcular pot�ncia!!!
		public int pot(int a, int b) {

			if (a == 0) {
				return 0;
			} else if (b == 0) {
				return 1;
			} else {
				return a * pot(a, b - 1);
			}
		}
	//Merilo, n�o sei como voc� � meu mentor!!!
}
