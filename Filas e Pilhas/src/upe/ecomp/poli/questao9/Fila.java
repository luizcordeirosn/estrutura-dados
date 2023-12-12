package upe.ecomp.poli.questao9;

public class Fila<T> {

	private No<T> inicio;

	//Método para adicionar a fila!!!
	public void enqueue(T e) {

		No<T> novo = new No<T>(e);
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

	//Método para remover o inicio da fila!!!
	public void dequeue() {

		inicio = inicio.getProximo();
	}

	public No<T> getInicio() {
		return inicio;
	}

	public void setInicio(No<T> inicio) {
		this.inicio = inicio;
	}

}
