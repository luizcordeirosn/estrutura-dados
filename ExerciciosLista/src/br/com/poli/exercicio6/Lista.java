package br.com.poli.exercicio6;

public class Lista<T> {

	private No<T> inicio;

	// Método para adicionar um elemento em ordem crescente!!!
	public void add(T elemento) {

		No<T> novo = new No<T>(elemento);
		if (inicio == null) {
			inicio = novo;
		}

		else if (inicio.comparar(elemento) >= 0) {

			novo.setProximo(inicio);
			inicio = novo;
		}

		else {

			No<T> aux = inicio;
			while (aux != null) {
				if (aux.getProximo() == null) {
					aux.setProximo(novo);
					break;
				} else if (aux.getProximo().comparar(elemento) < 0) {
					aux = aux.getProximo();
				} else {
					novo.setProximo(aux.getProximo());
					aux.setProximo(novo);
					break;
				}
			}

		}

	}

	// Método para adicionar as listas e ordenalas!!!
	public Lista<T> listaLigada(Lista<T> lista1, Lista<T> lista2) throws Exception {

		if (lista1.inicio == null || lista2.inicio == null) {
			throw new Exception("Não pode ligar listas vazias!!!");
		}

		Lista<T> listaLigada = new Lista<T>();

		No<T> aux = lista1.inicio;
		while (aux != null) {
			listaLigada.add(aux.getInfo());
			aux = aux.getProximo();
		}

		aux = lista2.inicio;
		while (aux != null) {
			listaLigada.add(aux.getInfo());
			aux = aux.getProximo();
		}

		return listaLigada;
	}

	// Método para verificar se as listas possuem a mesma ordem de elementos!!!
	public boolean verificarOrdemLista(Lista<T> lista1, Lista<T> lista2) throws Exception {

		if (lista1.inicio == null || lista2.inicio == null) {
			throw new Exception("Inicie as listas para utilizar o método!!!");
		}

		No<T> aux1 = lista1.inicio;
		No<T> aux2 = lista2.inicio;

		while (aux1 != null && aux2 != null) {
			if (aux1.getInfo() == aux2.getInfo()) {
				aux1 = aux1.getProximo();
				aux2 = aux2.getProximo();
			} else {
				System.out.println("As listar não possuem a mesma sequência!!!");
				return false;
			}
		}

		System.out.println("As listar possuem a mesma sequência!!!");
		return true;
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

	public No<T> getInicio() {
		return inicio;
	}

	public void setInicio(No<T> inicio) {
		this.inicio = inicio;
	}

}
