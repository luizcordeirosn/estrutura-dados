package br.com.poli.exercicio1;

public class Lista<T> {

	private No<T> inicio;

	//Método para adicionar os elementos a cabeça de cada nó!!!
	public void add(T elemento) {

		No<T> novo = new No<T>(elemento);
		No<T> novo2 = new No<T>(elemento);

		if (inicio == null) {

			inicio = novo;
			inicio.setCabeca(novo2);
		} else {

			No<T> aux = inicio;

			while (aux.getProximo() != null) {

				aux = aux.getProximo();
			}

			aux.setProximo(novo);
			aux.getProximo().setCabeca(novo2);
		}
	}

	//Método para adicionar um elemento em uma cabeça específica!!!
	public void addElementoCabeca(T elemento, T cabeca) {

		No<T> aux = inicio;
		while (aux != null) {
			if (aux.getInfo() == cabeca) {
				addElementoCabecaAux(aux, elemento);
				break;
			} else {
				aux = aux.getProximo();
			}
		}

	}

	//Método auxiliar para o addElementoCabeca!!!
	private void addElementoCabecaAux(No<T> aux, T elemento) {

		No<T> aux2 = aux.getCabeca();
		while (aux2.getProximo() != null) {
			aux2 = aux2.getProximo();
		}
		No<T> novo = new No<T>(elemento);
		aux2.setProximo(novo);
	}

	// Método para adicionar um elemento em ordem crescente!!!
	public void addOrdenado(T elemento) {

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

	//Método para planificar a lista e ordenala!!!
	public Lista<T> planificar() throws Exception {
		
		if (inicio == null) {
			throw new Exception("Lista vazia!!!");
		}

		Lista<T> planificar = new Lista<T>();
		No<T> aux = inicio;
		while (aux != null) {
			No<T> aux2 = aux.getCabeca();
			while (aux2 != null) {
				planificar.addOrdenado(aux2.getInfo());
				aux2 = aux2.getProximo();
			}
			aux = aux.getProximo();
		}

		return planificar;
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

	//Método para printar as cabecas das listas!!!
	public void printCabeca() throws Exception{
		
		if (inicio == null) {
			throw new Exception("Lista vazia!!!");
		}

		No<T> aux = inicio;
		while (aux != null) {
			No<T> aux2 = aux.getCabeca();
			while (aux2 != null) {

				System.out.print(aux2 + "-> ");
				aux2 = aux2.getProximo();
			}
			aux = aux.getProximo();
			System.out.println("null");
		}
	}

}
