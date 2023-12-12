package br.com.poli.exercicio9;

public class Main {

	public static void main(String[] args) {
		
		try {
	
		ListaDuplamenteLigada<Integer> lista = new ListaDuplamenteLigada<Integer>();
		ListaDuplamenteLigada<Integer> lista2 = new ListaDuplamenteLigada<Integer>();
		
		lista.add(23);
		lista.add(45);
		lista.add(289);
		lista.add(390);
		lista.print();
		
		lista2.add(78);
		lista2.add(11);
		lista2.add(34);
		lista2.add(21);
		lista2.add(79);
		lista2.add(90);
		lista2.add(67);
		lista2.print();
		
		lista.concatenarLista(lista, lista2).print();
		lista.intercalarLista(lista, lista2).print();
		System.out.println();
		
		lista2.separarListaMetade(lista2);
		lista2.getListaMetadeInicio().print();
		lista2.getListaMetadeFim().print();
		lista2.print();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
