package br.com.poli.exercicio7;

import br.com.poli.exercicio5.No;

public class Lista<T> {

	private No<T> inicio;

	// M�todo para adicionar ao final da lista!!!
	public void add(T elemento) {

		No<T> novo = new No<T>(elemento);
		if (inicio == null) {

			inicio = novo;
		} else {

			No<T> aux = inicio;
			while (aux.getProximo() != null) {

				aux = aux.getProximo();
			}

			aux.setProximo(novo);
		}
	}
	
	//M�todo para remover as posi��es �mpares da lista!!!
	public void removerImpares() throws Exception{
		
		if (inicio == null) {
			throw new Exception("Lista vazia!!!");
		}
		
		No<T> aux = inicio;
		int contador=0;
		while(aux!=null) {
			if(contador%2!=0) {
				remover(aux.getInfo());
				contador++;
				aux=aux.getProximo();
			}
			else {
				contador++;
				aux=aux.getProximo();
			}
		}
	}

	// M�todo para verificar se est� contido na lista!!!
	public boolean buscar(T elemento) throws Exception {
		
		if (inicio == null) {
			throw new Exception("Lista vazia!!!");
		}

		No<T> aux = inicio;

		while (aux != null) {

			if (aux.getInfo().equals(elemento)) {
				return true;
			}
			aux = aux.getProximo();
		}
		return false;
	}

	// M�todo para remover um elemento da lista!!!
	public void remover(T elemento) throws Exception {

		if (inicio == null) {
			throw new Exception("Lista vazia, n�o possui elementos para remover!!!");
		} else {

			if (buscar(elemento) == false) {
				throw new Exception("Elemento n�o contido na lista!!!");
			}
			No<T> aux = inicio;

			if (aux.getInfo().equals(elemento)) {
				inicio = aux.getProximo();

			} else {
				while (aux != null) {

					if ((aux.getProximo().getInfo().equals(elemento))) {

						if (aux.getProximo().getProximo() == null) {
							aux.setProximo(null);
						} else {
							aux.setProximo(aux.getProximo().getProximo());
						}
						break;
					} else {
						aux = aux.getProximo();
					}

				}

			}
		}
	}

	// M�todo para printar a lista!!!
	public void print() throws Exception {

		int contador = 0;
		
		No<T> aux = inicio;

		if (inicio == null) {

			throw new Exception("Lista vazia!!!");
		}

		while (aux.getProximo() != null) {
			System.out.print(aux + "(" + contador + ") " + "-> ");
			contador++;
			aux = aux.getProximo();
		}
		System.out.print(aux + "(" + contador + ") " + "-> ");
		System.out.println(aux.getProximo());
	}

}
