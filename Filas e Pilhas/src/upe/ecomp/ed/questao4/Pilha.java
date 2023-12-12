package upe.ecomp.ed.questao4;

public class Pilha<T> {

	private No<T> topo;
	private int size;

	public Pilha() {
		this.size = 0;
	}

	// M�todo para adicionar a pilha!!!
	public void push(T e) {

		No<T> novo = new No<T>(e);
		if (topo == null) {
			topo = novo;
			size++;
		} else {
			novo.setProximo(topo);
			topo = novo;
			size++;
		}
	}

	// M�todo para remover um elemento espec�fico da pilha!!!
	public void pop(T e, Pilha<T> p) {

		Pilha<T> pAux = new Pilha<T>();
		No<T> aux = p.getTopo();
		while (aux != null) {

			// Se comparar = 0, remova o elemento!!!
			if (aux.comparar(e) == 0) {
				p.popAux();
				p.setSize(p.getSize() - 1);
				break;
			}
			// Caso n�o, adicionar a uma fila auxiliar!!!
			else {

				pAux.push(p.top());
				p.popAux();
			}

			aux = aux.getProximo();
		}

		// Looping para adicionar de volta a pilha!!!
		while (pAux.getTopo() != null) {

			p.push(pAux.top());
			pAux.popAux();
		}

	}

	// M�todo para remover o elemento do topo da pilha!!!
	public void popAux() {

		if (topo != null) {
			topo = topo.getProximo();
		}
	}

	// M�todo para retornar o elemento do topo da pilha!!!
	public T top() {

		return topo.getInfo();
	}

	// M�todo para retornar a pilha!!!
	public String toString() {

		String r = "Topo da pilha";

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
