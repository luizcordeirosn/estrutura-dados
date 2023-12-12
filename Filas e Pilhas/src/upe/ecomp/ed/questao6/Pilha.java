package upe.ecomp.ed.questao6;

public class Pilha<T> {

	private No<T> topo;
	private int size;
	private int move;

	public Pilha() {
		this.size = 0;
		this.move = 0;
	}

	// Método para adicionar a pilha!!!
	public void push(T e) {

		No<T> novo = new No<T>(e);
		if (topo == null) {
			topo = novo;
			size++;
		} else {

			if (topo.comparar(e) >= 0) {
				novo.setProximo(topo);
				topo = novo;
				size++;
			}
		}
	}

	// Método para remover da pilha!!!
	public void pop() {

		topo = topo.getProximo();
		size--;
	}

	// Método para retornar o topo da pilha!!!
	public T top() {

		T r = topo.getInfo();
		return r;
	}

	// Método para mover um bloco de uma pilha para outra!!!
	public void moverBloco(Pilha<T> p1, Pilha<T> p2) throws Exception {

		// Caso pilha1 seja nula, retornar excessão!!!
		if (p1.getTopo() == null) {
			throw new Exception("Não há blocos para mover!!!");
		}
		// Se não, verificar se pilha2 é nula ou se o bloco que irá ser movido é menor
		// do que o topo da pilha2!!!
		else if (p2.getTopo() == null || p1.getTopo().comparar(p2.getTopo().getInfo()) <= 0) {

			p2.push(p1.top());
			p1.pop();
			move++;
		}
		// Caso não seja, retornar uma excessão!!!
		else {
			throw new Exception("Você não pode mover o bloco para essa torre!!!");
		}
	}

	// Método para retornar a pilha!!!
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

	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}

}
