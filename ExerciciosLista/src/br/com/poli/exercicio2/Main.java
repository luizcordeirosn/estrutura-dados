package br.com.poli.exercicio2;

public class Main {

	public static void main(String[] args) {

		try {

			ListaCircular<Integer> lista1 = new ListaCircular<Integer>();
			ListaCircular<Integer> lista2 = new ListaCircular<Integer>();
			ListaCircularOrdenada<Integer> listaOrdenada1 = new ListaCircularOrdenada<Integer>();
			ListaCircularOrdenada<Integer> listaOrdenada2 = new ListaCircularOrdenada<Integer>();

			lista1.add(30);
			lista1.add(40);
			lista1.add(50);
			lista1.add(75);

			lista2.add(90);
			lista2.add(120);
			lista2.add(130);
			lista2.add(145);

			listaOrdenada1.addOrdenado(30);
			listaOrdenada1.addOrdenado(20);
			listaOrdenada1.addOrdenado(10);
			listaOrdenada1.addOrdenado(9);
			//listaOrdenada1.addOrdenado(25);
			//listaOrdenada1.addOrdenado(8);
			//listaOrdenada1.addOrdenado(7);
			//listaOrdenada1.addOrdenado(6);

			listaOrdenada2.addOrdenado(100);
			listaOrdenada2.addOrdenado(110);
			listaOrdenada2.addOrdenado(120);
			listaOrdenada2.addOrdenado(9);

			System.out.println("Tamanho da Lista1 - " + lista1.tamanho());
			System.out.println("Tamanho da Lista2 - " + lista2.tamanho());
			System.out.print("Lista1: ");
			lista1.print();
			System.out.print("Lista2: ");
			lista2.print();

			System.out.println("Tamanho da ListaAux - " + lista1.concatenarLista(lista1, lista2).tamanho());
			System.out.print("Lista concatenada: ");
			lista1.concatenarLista(lista1, lista2).print();

			System.out.print("Lista ordenada1: ");
			listaOrdenada1.print();
			System.out.print("Lista ordenada2: ");
			listaOrdenada2.print();
			
			//listaOrdenada1.listaIntercalada(listaOrdenada1, listaOrdenada2).print();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
