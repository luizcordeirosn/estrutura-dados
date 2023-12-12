package upe.ecomp.ed.questao1;

public class Pilha<T> {

	private No<T> topo;
	private int size;

	public Pilha() {
		this.size = 0;
	}

	// Método para verificar se a palavra é palíndroma!!!
	public boolean palabrapalindroma(String palavra) throws Exception {

		boolean r = false;
		String p = "";

		// Adicionar todos cada char da string a pilha!!!
		for (int i = 0; i < palavra.length(); i++) {

			push(palavra.charAt(i));
		}
		// Concatenar cada elemento da pilha em um String p!!!
		for (int i = palavra.length() - 1; i >= 0; i--) {

			p = p + top();
			pop();
		}
		// Se palavra igual a p, retornar true!!!
		if (palavra.equals(p)) {
			r = true;
		}

		return r;
	}

	// Método para adicionar a pilha!!!
	public void push(char e) {

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

	// Método para remover da pilha!!!
	public void pop() throws Exception {

		if (size > 0) {
			topo = topo.getProximo();
			size--;
		} else {
			throw new Exception("Pilha vazia!!!");
		}
	}

	// Método para retornar o topo da pilha!!!
	public char top() throws Exception {

		char r = ' ';

		if (size > 0) {
			r = topo.getInfo();
		} else {
			throw new Exception("Pilha vazia!!!");
		}
		return r;
	}

	public No<T> getInicio() {
		return topo;
	}

	public void setInicio(No<T> inicio) {
		this.topo = inicio;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
