package br.com.poli.exercicio07;

public class Exercicio07 {

	int i = 0;

	// M�todo para contar a quantidade de K's que aparecem em um inteiro N!!!
	public int nVezes(int n, int k) {

		//Se o quociente de n/10 for = 0 e o resto diferente de K, retornar o pr�prio i, caso n�o, continuar o looping!!!
		//Caso n%10 seja = k, i++ e continuar o looping, caso n�o, continuar apenas a recursividade!!!
		if (n / 10 == 0 && n % 10 != k) {
			return i;
		} else if (n % 10 == k) {
			i++;
			return nVezes(n / 10, k);
		} else {
			return nVezes(n / 10, k);
		}
	}
}
