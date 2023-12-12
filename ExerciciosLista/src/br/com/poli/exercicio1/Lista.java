package br.com.poli.exercicio1;

public class Lista<T> {

	private No<T> inicio;

	//M�todo para adicionar os elementos a cabe�a de cada n�!!!
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

	//M�todo para adicionar um elemento em uma cabe�a espec�fica!!!
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

	//M�todo auxiliar para o addElementoCabeca!!!
	private void addElementoCabecaAux(No<T> aux, T elemento) {

		No<T> aux2 = aux.getCabeca();
		while (aux2.getProximo() != null) {
			aux2 = aux2.getProximo();
		}
		No<T> novo = new No<T>(elemento);
		aux2.setProximo(novo);
	}

	// M�todo para adicionar um elemento em ordem crescente!!!
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

	//M�todo para planificar a lista e ordenala!!!
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

	// M�todo para printar a lista!!!
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

	//M�todo para printar as cabecas das listas!!!
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
