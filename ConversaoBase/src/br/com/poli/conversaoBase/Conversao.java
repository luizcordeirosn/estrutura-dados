package br.com.poli.conversaoBase;

import br.com.poli.funcoes.*;

public class Conversao {

	private int[] numeroAux = new int[16];
	private int[] numeroBaseY = new int[16];

	public Conversao() {

		for (int i = 0; i < 16; i++) {

			numeroAux[i] = 0;
			numeroBaseY[i] = 0;
		}
	}

	Funcoes f = new Funcoes();

	public String converterBase(String digitos, int x, int y) throws Exception {

		int numeroBase10 = 0;
		int aux = 0;

		if (digitos.length() > 16) {

			throw new Exception("Array maior que 16!!!");
		}

		if (x < 2 || y > 16) {

			throw new Exception("Bases com valores inválidos!!!");
		}

		// Checar se o primeiro bit de sinal é negativo!!!
		if (String.valueOf(digitos.charAt(0)).equals("-") || String.valueOf(digitos.charAt(0)).equals("1")) {

			if (digitos.length() == 1) {
				throw new Exception("Para representar o dígito 1, coloque um 0 na frente!!!");
			}

			else if (String.valueOf(digitos.charAt(0)).equals("1")) {
				aux = 1;
			}

			numeroBaseY[0] = 1;
			digitos = digitos.replace("-", "");
		}

		// Looping para caso digito maior do que 9, trocar o valor do dígito pelo número
		// respectivo e adicionar ao array numeroAux!!!
		for (int i = 0; i < digitos.length(); i++) {

			if (String.valueOf(digitos.charAt(digitos.length() - (1 + i))).equalsIgnoreCase("A") && x >= 11) {
				numeroAux[i] = 10;
			} else if (String.valueOf(digitos.charAt(digitos.length() - (1 + i))).equalsIgnoreCase("B") && x >= 12) {
				numeroAux[i] = 11;
			} else if (String.valueOf(digitos.charAt(digitos.length() - (1 + i))).equalsIgnoreCase("C") && x >= 13) {
				numeroAux[i] = 12;
			} else if (String.valueOf(digitos.charAt(digitos.length() - (1 + i))).equalsIgnoreCase("D") && x >= 14) {
				numeroAux[i] = 13;
			} else if (String.valueOf(digitos.charAt(digitos.length() - (1 + i))).equalsIgnoreCase("E") && x >= 15) {
				numeroAux[i] = 14;
			} else if (String.valueOf(digitos.charAt(digitos.length() - (1 + i))).equalsIgnoreCase("F") && x >= 16) {
				numeroAux[i] = 15;
			} else {
				numeroAux[i] = Integer.parseInt(String.valueOf(digitos.charAt((digitos.length() - (1 + i)))));
			}
		}

		// Looping para transformar o número da base x para base 10!!!
		for (int i = 0; i < digitos.length() - aux; i++) {

			numeroBase10 = numeroBase10 + numeroAux[i] * f.pot(x, i);
		}

		converterBaseY(numeroBase10, y, 1);
		complementoDois(y, 1);
		digitos = "";

		// Inverter a ordem do Array de int e adicionar aos dígitos!!!
		for (int i = 15; i >= 1; i--) {

			if (numeroBaseY[i] == 10) {

				digitos = digitos + "A";
			} else if (numeroBaseY[i] == 11) {

				digitos = digitos + "B";
			} else if (numeroBaseY[i] == 12) {

				digitos = digitos + "C";
			} else if (numeroBaseY[i] == 13) {

				digitos = digitos + "D";
			} else if (numeroBaseY[i] == 14) {

				digitos = digitos + "E";
			} else if (numeroBaseY[i] == 15) {

				digitos = digitos + "F";
			} else {
				digitos = digitos + numeroBaseY[i];
			}

		}

		// Adicionar o bit de Sinal!!!
		digitos = numeroBaseY[0] + digitos;

		return digitos;
	}

	// Método para converter da base 10 para uma base Y!!!
	public void converterBaseY(int numeroBase10, int y, int j) {

		if (numeroBase10 < y) {

			numeroBaseY[j] = numeroBase10;
		}

		else if (numeroBase10 % y != 0) {

			numeroBaseY[j] = numeroBase10 % y;
			j++;
			converterBaseY((numeroBase10 - numeroBase10 % y) / y, y, j);
		}

		else if (numeroBase10 % y == 0) {

			numeroBaseY[j] = numeroBase10 % y;
			j++;
			converterBaseY((numeroBase10) / y, y, j);
		}

	}

	// Método para realizar o complemento de dois, caso a base Y seja igual a 2!!!
	public void complementoDois(int y, int j) {

		if (y == 2 && numeroBaseY[0] == 1) {

			for (int i = 0; i < 16; i++) {

				if (numeroBaseY[i] == 0) {
					numeroBaseY[i] = 1;
				} else {
					numeroBaseY[i] = 0;
				}
			}
			somaComplementoDois(j);
		}
	}

	// Somar 1 após inverter os bits do dígito na base 2!!!
	public void somaComplementoDois(int j) {

		numeroBaseY[j] += 1;

		if (numeroBaseY[j] == 2) {

			numeroBaseY[j] = 0;
			somaComplementoDois(j + 1);
		}

	}

}
