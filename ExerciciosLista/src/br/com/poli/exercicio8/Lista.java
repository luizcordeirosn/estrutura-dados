package br.com.poli.exercicio8;

public class Lista<T> {

	private No<T> inicio;

	// Método para adicionar ao final da lista!!!
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

	// Método para inverter a ordem da lista!!!
	public void inverterOrdem(Lista<T> lista1) throws Exception{
		
		if (inicio == null) {
			throw new Exception("Lista vazia!!!");
		}
		
		No<T> aux1 = inicio;
		No<T> aux2 = inicio;
		while (aux1.getProximo() != null) {
			aux1 = aux1.getProximo();
		}
		No<T> aux3 = aux1;

		while (aux1 != inicio) {
			if (aux1 != aux2) {
				while (aux2.getProximo() != aux1) {
					aux2 = aux2.getProximo();
				}
			}
			aux1.setProximo(aux2);
			aux1 = aux1.getProximo();
			if (aux1 == aux2) {
				aux2 = inicio;
				while (aux2.getProximo() != aux1) {
					aux2 = aux2.getProximo();

				}
			}
		}
		aux1.setProximo(null);
		inicio = aux3;
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
