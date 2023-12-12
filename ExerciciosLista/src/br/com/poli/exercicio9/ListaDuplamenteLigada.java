package br.com.poli.exercicio9;

public class ListaDuplamenteLigada<T> {

	private No<T> inicio;
	private ListaDuplamenteLigada<T> listaMetadeInicio;
	private ListaDuplamenteLigada<T> listaMetadeFim;

	// Método para adicionar um elemento ao fim da lista!!!
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
			novo.setAnterior(aux);
		}
	}

	// Método para adicionar um elemento em ordem crescente!!!
	public void addOrdenado(T elemento) {

		No<T> novo = new No<T>(elemento);
		if (inicio == null) {
			inicio = novo;
		}

		else if (inicio.comparar(elemento) >= 0) {

			novo.setProximo(inicio);
			novo.setAnterior(inicio);
			inicio = novo;
		}

		else {

			No<T> aux = inicio;
			while (aux != null) {
				if (aux.getProximo() == null) {
					novo.setAnterior(aux);
					aux.setProximo(novo);
					break;
				} else if (aux.getProximo().comparar(elemento) < 0) {
					aux = aux.getProximo();
				} else {
					novo.setProximo(aux.getProximo());
					novo.setAnterior(aux.getProximo());
					aux.setProximo(novo);
					break;
				}
			}

		}

	}

	// Método para concatenar duas listas duplamente ligadas!!!
	public ListaDuplamenteLigada<T> concatenarLista(ListaDuplamenteLigada<T> lista1, ListaDuplamenteLigada<T> lista2)
			throws Exception {

		if (lista1.inicio == null || lista2.inicio == null) {
			throw new Exception("Inicie as listas para utilizar o método!!!");
		}

		ListaDuplamenteLigada<T> listaAux = new ListaDuplamenteLigada<T>();

		No<T> aux = lista1.inicio;
		while (aux.getProximo() != null) {

			listaAux.add(aux.getInfo());
			aux = aux.getProximo();
		}
		listaAux.add(aux.getInfo());

		aux = lista2.inicio;
		while (aux.getProximo() != null) {

			listaAux.add(aux.getInfo());
			aux = aux.getProximo();
		}
		listaAux.add(aux.getInfo());

		return listaAux;
	}

	//Método para separar a lista na metade e igualar a outras duas!!!
	public void separarListaMetade(ListaDuplamenteLigada<T> lista) throws Exception {

		if (lista == null) {
			throw new Exception("Lista vazia!!!");
		}

		listaMetadeInicio = new ListaDuplamenteLigada<T>();
		listaMetadeFim = new ListaDuplamenteLigada<T>();

		int metadeInicio;
		int metadeFim;
		No<T> aux = inicio;

		if (lista.tamanho() % 2 == 0) {
			metadeInicio = lista.tamanho() / 2;
			metadeFim = lista.tamanho() / 2 + 1;
		} else {
			metadeInicio = lista.tamanho() / 2 + 1;
			metadeFim = lista.tamanho() / 2 + 2;
		}

		int i = 0;
		while (i < metadeInicio) {

			listaMetadeInicio.add(aux.getInfo());
			aux = aux.getProximo();
			i++;
		}

		i = metadeFim;
		while (i <= lista.tamanho()) {
			listaMetadeFim.add(aux.getInfo());
			aux = aux.getProximo();
			i++;
		}

	}

	// Método para intercalar duas listas duplamente ligadas ordenadas!!!
	public ListaDuplamenteLigada<T> intercalarLista(ListaDuplamenteLigada<T> lista1, ListaDuplamenteLigada<T> lista2)
			throws Exception {

		if (lista1.inicio == null || lista2.inicio == null) {
			throw new Exception("Inicie as listas para utilizar o método!!!");
		}

		ListaDuplamenteLigada<T> listaAux = new ListaDuplamenteLigada<T>();
		No<T> aux;
		No<T> aux2;

		if (lista1.tamanho() >= lista2.tamanho()) {
			aux = lista2.inicio;
			aux2 = lista1.inicio;
		} else {
			aux = lista1.inicio;
			aux2 = lista2.inicio;
		}

		while (aux != null) {

			listaAux.add(aux.getInfo());
			listaAux.add(aux2.getInfo());
			aux = aux.getProximo();
			aux2 = aux2.getProximo();
		}

		while (aux2 != null) {
			listaAux.add(aux2.getInfo());
			aux2 = aux2.getProximo();
		}

		return listaAux;

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

	public ListaDuplamenteLigada<T> getListaMetadeInicio() {
		return listaMetadeInicio;
	}

	public void setListaMetadeInicio(ListaDuplamenteLigada<T> listaMetadeInicio) {
		this.listaMetadeInicio = listaMetadeInicio;
	}

	public ListaDuplamenteLigada<T> getListaMetadeFim() {
		return listaMetadeFim;
	}

	public void setListaMetadeFim(ListaDuplamenteLigada<T> listaMetadeFim) {
		this.listaMetadeFim = listaMetadeFim;
	}

}
