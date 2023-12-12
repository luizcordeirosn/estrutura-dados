package upe.ecomp.poli.questao8;

public class Pilha<T> {

	private No<T> topo;
	private int size;

	public Pilha() {
		size = 0;
	}

	// Método para adicionar a pilha!!!
	public void push(T e) {

		No<T> novo = new No<T>(e);
		if (topo == null) {
			topo = novo;
		} else {
			novo.setProximo(topo);
			topo = novo;
		}
	}

	// Método para converter base!!!
	public void converterBase2(Pilha<Integer> p, int numeroBase10) {

		// Se numeroBase10 = 1, parar a recursividade e adicionar a pilha!!!
		if (numeroBase10 == 1) {
			p.push(numeroBase10);
		}
		// Caso não, adicionar a pilha, dividir numeroBase10 por 2 e retornar o método
		// converterBase!!!
		else {
			p.push(numeroBase10 % 2);
			converterBase2(p, numeroBase10 / 2);
		}
	}

	// Método para retornar a pilha!!!
	public String toString() {

		String r = "Numero Base2";

		if (topo == null) {
			return r + " ->";
		}

		No<T> aux = topo;
		while (aux != null) {
			r = r + " -> " + aux.getInfo();
			aux = aux.getProximo();
		}
		return r;
	}

	public No<T> getTopo() {
		return topo;
	}

	public void setTopo(No<T> topo) {
		this.topo = topo;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
