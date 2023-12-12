package upe.ecomp.ed.questao4;

public class Lista<T> {

	private NoLista<T> inicio;

	// Adicionar a lista!!!
	public void add(T e) {
		NoLista<T> novo = new NoLista<T>(e);
		if (inicio == null) {
			inicio = novo;
		} else {

			NoLista<T> aux = inicio;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
		}
	}

	// Retornar a lista!!!
	public String toString() {

		String r = "";
		NoLista<T> aux = inicio;
		while (aux != null) {
			r = r + " " + aux.getInfo();
			aux = aux.getProximo();
		}
		return "Início ->" + r;
	}

	public NoLista<T> getInicio() {
		return inicio;
	}

	public void setInicio(NoLista<T> inicio) {
		this.inicio = inicio;
	}

}
