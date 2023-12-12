package br.com.poli.exercicio5;

public class Lista<T> {

	private No<T> inicio;

	// Método para adicionar um elemento a lista!!!
	public void add(T elemento) {

		if (inicio == null) {

			No<T> novo = new No<T>(elemento);
			inicio = novo;
		} else {

			No<T> aux = inicio;
			while (aux.getProximo() != null) {

				aux = aux.getProximo();
			}

			No<T> novo2 = new No<T>(elemento);
			aux.setProximo(novo2);

		}
	}

	// Método para concatenar duas listas!!!
	public Lista<T> concatenarLista(Lista<T> lista1, Lista<T> lista2) throws Exception {

		if (lista1.inicio == null || lista2.inicio == null) {
			throw new Exception("Não pode concatenar listas vazias!!!");
		}

		Lista<T> listaConcatenada = new Lista<T>();

		No<T> aux = lista1.inicio;
		while (aux != null) {

			listaConcatenada.add(aux.getInfo());
			aux = aux.getProximo();
		}

		No<T> aux2 = lista2.inicio;
		while (aux2 != null) {

			listaConcatenada.add(aux2.getInfo());
			aux2 = aux2.getProximo();
		}

		return listaConcatenada;
	}

	// Método para retornar a diferença das duas listas!!!
	public Lista<T> diferencaLista(Lista<T> lista1, Lista<T> lista2) throws Exception {
		
		if (lista1.inicio == null || lista2.inicio == null) {
			throw new Exception("Inicie as listas para utilizar o método!!!");
		}

		Lista<T> listaDiferenca = new Lista<T>();

		No<T> aux = lista1.inicio;
		while (aux != null) {

			listaDiferenca.add(aux.getInfo());
			aux = aux.getProximo();
		}

		No<T> aux2 = lista2.inicio;
		while (aux2 != null) {
			if (lista1.buscar(aux2.getInfo()) == true) {
				listaDiferenca.remover(aux2.getInfo());
				aux2 = aux2.getProximo();
			} else {
				listaDiferenca.add(aux2.getInfo());
				aux2 = aux2.getProximo();
			}
		}

		return listaDiferenca;
	}

	// Método para retornar a diferença das duas listas!!!
	public Lista<T> intersecaoLista(Lista<T> lista1, Lista<T> lista2) throws Exception {
		
		if (lista1.inicio == null || lista2.inicio == null) {
			throw new Exception("Inicie as listas para utilizar o método!!!");
		}

		Lista<T> listaIntersecao = new Lista<T>();

		No<T> aux = lista2.inicio;
		while (aux != null) {
			if (lista1.buscar(aux.getInfo()) == true) {
				listaIntersecao.add(aux.getInfo());
				aux = aux.getProximo();
			} else {
				aux = aux.getProximo();
			}
		}

		return listaIntersecao;
	}

	public boolean listaContida(Lista<T> lista1, Lista<T> lista2) throws Exception{
		
		if (lista1.inicio == null || lista2.inicio == null) {
			throw new Exception("Inicie as listas para utilizar o método!!!");
		}

		Lista<T> listaAux;
		No<T> aux;

		if (lista1.tamanho() >= lista2.tamanho()) {

			listaAux = lista1;
			aux = lista2.inicio;
		} else {
			listaAux = lista2;
			aux = lista1.inicio;
		}

		while (aux != null) {
			if (listaAux.buscar(aux.getInfo()) == false) {
				System.out.println("A lista não está contida na outra!!!");
				return false;
			} else {
				aux = aux.getProximo();
			}
		}
		System.out.println("A lista está contida na outra!!!");
		return true;

	}

	// Método para verificar se está contido na lista!!!
	public boolean buscar(T elemento) throws Exception{
		
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

	// Método para remover um elemento da lista!!!
	public void remover(T elemento) throws Exception {

		if (inicio == null) {
			throw new Exception("Lista vazia, não possui elementos para remover!!!");
		} else {

			if (buscar(elemento) == false) {
				throw new Exception("Elemento não contido na lista!!!");
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
