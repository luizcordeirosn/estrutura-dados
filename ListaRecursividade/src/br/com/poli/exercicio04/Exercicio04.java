package br.com.poli.exercicio04;

public class Exercicio04 {

	// Método para retornar todos os n-termos de uma PA!!!
	public String termosPA(int termos, double atual, double razao) {

		if (termos == 1) {
			return ">>" + atual;
		} else {
			return ">>" + atual + termosPA(termos - 1, atual + razao, razao);
		}
	}
}
