package upe.ecomp.ed.questao6;

public class Pilha<T> {

	private NoPilha<T> topo;

	public void push(T e) {

		NoPilha<T> novo = new NoPilha<T>(e);
		if (topo == null) {
			topo = novo;
		} else {
			novo.setPróximo(topo);
			topo = novo;
		}
	}

	public void pop() throws Exception {

		if (topo != null) {
			topo = topo.getProximo();
		} else {
			throw new Exception("Pilha vazia");
		}
	}

	public T top() throws Exception {

		NoPilha<T> aux = topo;
		if (topo != null) {
			pop();
			return aux.getInfo();
		} else {
			throw new Exception("Pilha vazia");
		}
	}

	// Método para retornar a pilha!!!
	public String toString() {

		String r = "Topo da pilha";

		if (topo == null) {
			return r + " ->";
		}

		NoPilha<T> aux = topo;
		while (aux != null) {
			r = r + " -> " + aux.getInfo();
			aux = aux.getProximo();
		}
		return r;
	}

}
