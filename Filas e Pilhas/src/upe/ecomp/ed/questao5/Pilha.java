package upe.ecomp.ed.questao5;

public class Pilha<T> {

	private No<T> topo;

	// M�todo para adicionar a pilha!!!
	public void push(T titulo, T cantor, T tempo) {

		No<T> novo = new No<T>(titulo, cantor, tempo);
		if (topo == null) {

			topo = novo;
		} else {

			novo.setProximo(topo);
			topo = novo;
		}

	}

	// M�todo para remover da pilha!!!
	public void pop() throws Exception {

		if (topo == null) {

			throw new Exception("Primeira m�sica ainda n�o tocou!!!");
		} else {
			topo = topo.getProximo();
		}
	}

	// M�todo para retornar o topo da pilha!!!
	public String toString() {

		String r = "Tocando m�sica anterior";

		if (topo == null) {
			return r + " ->";
		}

		r = r + " -> " + topo.getTitulo() + " - " + topo.getCantor() + " - " + topo.getTempo();
		return r;
	}

	public No<T> getTopo() {
		return topo;
	}

	public void setTopo(No<T> topo) {
		this.topo = topo;
	}

}
