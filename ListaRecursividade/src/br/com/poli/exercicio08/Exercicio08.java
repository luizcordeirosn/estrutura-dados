package br.com.poli.exercicio08;

public class Exercicio08 {
	
	//i = variável que especifica quantos divisores o número x tem!!!
	int i = 0;
	int divisor = 1;

	// Método para checar se um número é primo!!!
	public boolean primo(int x) {

		//Checar se o divisor está maior que o número especificado!!!
		//Caso i==2, retornar que o número x é true, caso não, retornar false!!!
		//Caso divisor <=x, checar se ele é divisível pelo divisor, caso não, divisor+=1 e retornar o próprio método!!!
		if (divisor > x) {
			if (i == 2) {
				return true;
			} else {
				return false;
			}
		} else if (x % divisor == 0) {
			i++;
			divisor++;
			return primo(x);
		} else {
			divisor++;
			return primo(x);
		}
	}

	//Isso é o desafio!!!
	// Verificar quais números são primso de um intervalor de N a M!!!
	//N é o primeiro valor do intervalo e M é o ultimo valor do intervalo!!!
	public String intervaloInteiros(int n, int m) {

		i = 0;
		divisor = 1;

		if (n > m) {

			return "";
		} else {
			if (primo(n) == true) {
				return n + "-" + intervaloInteiros(n + 1, m);
			} else {
				return intervaloInteiros(n + 1, m);
			}
		}
	}
}
