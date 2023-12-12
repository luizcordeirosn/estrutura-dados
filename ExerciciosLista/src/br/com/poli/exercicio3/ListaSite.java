package br.com.poli.exercicio3;

import br.com.poli.exercicio2.No;

public class ListaSite<T> {

	private No<T> inicio;

	// Método para adicionar ao início da lista!!!
	public void add(T elemento) {

		if (inicio == null) {

			No<T> novo = new No<T>(elemento);
			inicio = novo;
		} else {

			No<T> novo2 = new No<T>(elemento);
			novo2.setProximo(inicio);
			inicio = novo2;
		}
	}

	// Método para buscar um elemento na lista!!!
	public boolean buscar(T elemento) throws Exception{
		
		if (inicio == null) {
			throw new Exception("Lista vazia!!!");
		}

		No<T> aux = inicio;

		while (aux != null) {

			if (aux.getProximo().getInfo().equals(elemento)) {

				if (aux.getProximo().getProximo() != null) {

					No<T> novo = new No<T>(aux.getProximo().getInfo());
					aux.setProximo(aux.getProximo().getProximo());
					novo.setProximo(inicio);
					inicio = novo;
					return true;
				} else {
					No<T> novo = new No<T>(aux.getProximo().getInfo());
					aux.setProximo(null);
					novo.setProximo(inicio);
					inicio = novo;
					return true;
				}
			}
			aux = aux.getProximo();
		}

		System.out.println("FALSE - Elemento não contido na lista!!!");
		return false;
	}

	// Método para retornar o tamanho da lista!!!
	public int tamanho() {

		int tamanho = 1;

		No<T> aux = inicio;
		if (aux == null) {
			tamanho = 0;
		} else {

			while (aux.getProximo() != null) {

				tamanho++;
				aux = aux.getProximo();
			}
		}

		return tamanho;
	}

	// Método para printar a lista!!!
	public void print() throws Exception {

		No<T> aux = inicio;

		if (inicio == null) {

			throw new Exception("Lista vazia!!!");
		}

		while (aux.getProximo() != null) {
			System.out.print(aux + "-> ");
			aux = aux.getProximo();
		}
		System.out.print(aux + "-> ");
		System.out.println(aux.getProximo());
	}
}
