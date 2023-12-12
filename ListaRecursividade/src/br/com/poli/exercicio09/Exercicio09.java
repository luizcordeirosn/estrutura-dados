package br.com.poli.exercicio09;

public class Exercicio09 {

	// Letra A:

	// Método para retornar o mmc de dois número(N e M)!!!
	public int mmc(int n, int m) {

		int primoNum1 = 1;
		int primoNum2 = 1;
		int nAux = 0;
		int mAux = 0;

		// Caso N e M sejam = 1 respectivamente, retornar 1!!!
		if (n == 1 && m == 1) {
			return 1;
		} else {

			// Só serve para inverter os termos, poupa trabalho lá em baixo!!!
			if (n > m) {
				nAux = m;
				mAux = n;
			} else {
				nAux = n;
				mAux = m;
			}

			// Looping para o número n desde 2 até n!!!
			for (int i = 2; i <= nAux; i++) {
				if (nAux % i == 0) {
					// Caso m também seja divisível por i, primoNum1 = primoNum2, se não, igualar
					// apenas primoNum1 = i!!!
					if (mAux % i == 0) {
						primoNum1 = i;
						primoNum2 = i;
					} else {
						primoNum1 = i;
					}
					break;
				}
			}

			// Caso m também seja divisível por i, caso primoNum1 diferente de primoNum2!!!
			for (int j = 2; j <= mAux; j++) {
				if (primoNum2 == 1) {
					if (mAux % j == 0) {
						primoNum2 = j;
						break;
					}
				}
			} 

			// Retorno dependendte se primoNum1 seja igual ou não a primoNum2!!!
			if (primoNum1 == primoNum2) {
				return primoNum1 * mmc(nAux / primoNum1, mAux / primoNum2);
			} else {
				return primoNum1 * primoNum2 * mmc(nAux / primoNum1, mAux / primoNum2);
			}
		}
	}
	
	//Segunda forma de fazer o MMC!!!
	public int mmcResumido(int n, int m) {
		
		//No retorno, chamar o mdc para dividir pelo produto de N e M!!!
		return n*m/ mdc(n, m, 2);
	}
	
	//Método para calcular o MDC!!!
	//Descobri depois que podia fazer dessa maneira, PogChamp!!!
	public int mdc(int n, int m, int i) {
		
		if(n==1 || m==1) {
			return 1;
		}
		
		else if(n%i==0 && m%i==0) {
			return i;
		}
		else {
			return mdc(n,m,i+1);
		}
		
	}

	// Letra B:

	// Método para retornar a soma de todos os fatoriais divisíveis por K!!!
	public int somaFat(int inicio, int fim, int k) {

		if (inicio == fim) {
			return fat(inicio);
		} else {
			// Utilizar funcão fat como auxiliar para o looping!!!
			if (fat(inicio) % k == 0) {
				return fat(inicio) + somaFat(inicio + 1, fim, k);
			} else {
				return somaFat(inicio + 1, fim, k);
			}
		}
	}

	// Método para função fat!!!
	public int fat(int x) {

		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else {
			return x * fat(x - 1);
		}
	}

}
