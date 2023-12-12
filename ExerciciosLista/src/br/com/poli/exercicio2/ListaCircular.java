package br.com.poli.exercicio2;

public class ListaCircular<T> {

	private No<T> inicio;
	private No<T> fim;

	// Método para adicionar ao início da lista circular!!!
	public void add(T elemento) {

		if (inicio == null) {

			No<T> novo = new No<T>(elemento);
			inicio = novo;
			fim = inicio;
			inicio.setProximo(fim);
			fim.setProximo(inicio);
		} else {

			No<T> novo2 = new No<T>(elemento);
			novo2.setProximo(inicio);
			inicio = novo2;
			fim.setProximo(inicio);
		}

	}

	// Método para retornar o tamanho da lista circular!!!
	public int tamanho() {

		int tamanho = 1;

		No<T> aux = inicio;
		if (aux == null) {
			tamanho = 0;
		} else {

			while (aux.getProximo() != inicio) {

				tamanho++;
				aux = aux.getProximo();
			}
		}

		return tamanho;
	}

	// Método para concatenar duas listas circulares!!!
	public ListaCircular<T> concatenarLista(ListaCircular<T> lista1, ListaCircular<T> lista2) throws Exception {

		if (lista1.inicio == null || lista2.inicio == null) {
			throw new Exception("Inicie as listas para utilizar o método!!!");
		}

		ListaCircular<T> listaAux = new ListaCircular<T>();

		No<T> aux = lista1.inicio;
		while (aux.getProximo() != lista1.inicio) {

			listaAux.add(aux.getInfo());
			aux = aux.getProximo();
		}
		listaAux.add(aux.getInfo());

		aux = lista2.inicio;
		while (aux.getProximo() != lista2.inicio) {

			listaAux.add(aux.getInfo());
			aux = aux.getProximo();
		}
		listaAux.add(aux.getInfo());

		return listaAux;
	}

	// Método para printar a lista circular!!!
	public void print() throws Exception {

		No<T> aux = inicio;
		if (inicio == null) {
			throw new Exception("Lista vazia!!!");
		} else {
			while (aux.getProximo() != inicio) {
				System.out.print(aux + "-> ");
				aux = aux.getProximo();
			}
			System.out.print(aux + "-> ");
			System.out.println(aux.getProximo());
		}
	}

	public No<T> getInicio() {
		return inicio;
	}

	public void setInicio(No<T> inicio) {
		this.inicio = inicio;
	}

	public No<T> getFim() {
		return fim;
	}

	public void setFim(No<T> fim) {
		this.fim = fim;
	}

}
