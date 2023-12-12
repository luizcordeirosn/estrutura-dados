package br.com.poli.exercicio6;

public class Main {

	public static void main(String[] args) {

		try {

			Lista<Integer> lista1 = new Lista<Integer>();
			Lista<Integer> lista2 = new Lista<Integer>();

			lista1.add(30);
			lista1.add(40);
			lista1.add(25);
			lista1.add(24);
			lista1.add(35);
			lista1.add(36);
			lista1.add(12);
			lista1.add(46);
			lista1.add(36);

			lista2.add(12);
			lista2.add(25);
			lista2.add(24);

			lista1.print();
			lista2.print();
			lista1.listaLigada(lista1, lista2).print();
			lista1.verificarOrdemLista(lista1, lista2);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
