package br.com.poli.exercicio5;

public class Main {

	public static void main(String[] args) {

		try {
			Lista<Integer> lista1 = new Lista<>();
			Lista<Integer> lista2 = new Lista<>();

			lista1.add(1);
			lista1.add(2);
			lista1.add(3);
			lista1.add(45);
			lista1.add(6);

			lista2.add(1);
			lista2.add(6);
			lista2.add(3);
			lista2.add(2);

			lista1.print();
			lista2.print();

			lista1.concatenarLista(lista1, lista2).print();
			lista1.diferencaLista(lista1, lista2).print();
			lista1.intersecaoLista(lista1, lista2).print();
			lista1.listaContida(lista1, lista2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}