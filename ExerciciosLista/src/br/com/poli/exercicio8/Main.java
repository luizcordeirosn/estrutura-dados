package br.com.poli.exercicio8;

public class Main {

	public static void main(String[] args) {

		try {

			Lista<Integer> lista = new Lista<Integer>();

			lista.add(10);
			lista.add(20);
			lista.add(30);
			lista.add(5);
			lista.print();

			lista.inverterOrdem(lista);
			lista.print();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
