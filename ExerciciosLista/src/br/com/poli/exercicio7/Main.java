package br.com.poli.exercicio7;

public class Main {

	public static void main(String[] args) {

		try {

			Lista<Integer> lista = new Lista<Integer>();

			lista.add(3);
			lista.add(7);
			lista.add(13);
			lista.add(21);

			lista.print();

			lista.removerImpares();
			lista.print();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
