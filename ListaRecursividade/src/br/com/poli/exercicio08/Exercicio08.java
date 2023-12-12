package br.com.poli.exercicio08;

public class Exercicio08 {
	
	//i = vari�vel que especifica quantos divisores o n�mero x tem!!!
	int i = 0;
	int divisor = 1;

	// M�todo para checar se um n�mero � primo!!!
	public boolean primo(int x) {

		//Checar se o divisor est� maior que o n�mero especificado!!!
		//Caso i==2, retornar que o n�mero x � true, caso n�o, retornar false!!!
		//Caso divisor <=x, checar se ele � divis�vel pelo divisor, caso n�o, divisor+=1 e retornar o pr�prio m�todo!!!
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

	//Isso � o desafio!!!
	// Verificar quais n�meros s�o primso de um intervalor de N a M!!!
	//N � o primeiro valor do intervalo e M � o ultimo valor do intervalo!!!
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
