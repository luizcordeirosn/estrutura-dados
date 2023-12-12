package upe.ecomp.poli.questao9;

public class Lista<T> {

	private No<T> inicio;
	private int size;
	private Fila<T> fila;
	private Pilha<T> pilha;

	public Lista() {
		this.size = 0;
		fila = new Fila<T>();
		pilha = new Pilha<T>();
	}

	//Método para adicionar a lista!!!
	public void add(T e) {

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
	
	//Método para remover o elemento inicial da lista!!!
	public void remove() {
		
		inicio=inicio.getProximo();
	}

	//Método para inverter a ordem da lista e retorná-la!!!
	public Lista<T> inverterOrdem() {

		No<T> aux = inicio;
		while (aux != null) {
			//Se caracter for <=48 e <=57, adicionar a pilha!!!
			if ((char)aux.getInfo() >= 48 && (char)aux.getInfo() <= 57) {
				pilha.push(aux.getInfo());
				aux = aux.getProximo();
				remove();
			} 
			//Caso não, adicionar a fila!!!
			else {
				fila.enqueue(aux.getInfo());
				aux = aux.getProximo();
				remove();
			}
		}

		//Looping's para adicionar de volta a lista!!!
		No<T> aux2 = fila.getInicio();
		while (aux2 != null) {

			this.add(aux2.getInfo());
			aux2 = aux2.getProximo();
		}

		No<T> aux3 = pilha.getTopo();
		while (aux3 != null) {

			this.add(aux3.getInfo());
			aux3 = aux3.getProximo();
		}

		return this;
	}

	public String toString() {

		String r = "Lista";

		if (inicio == null) {
			return r + " ->";
		}

		No<T> aux = inicio;
		while (aux != null) {
			r = r + " -> " + aux.getInfo();
			aux = aux.getProximo();
		}
		return r;
	}

	public No<T> getInicio() {
		return inicio;
	}

	public void setInicio(No<T> inicio) {
		this.inicio = inicio;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Fila<T> getFila() {
		return fila;
	}

	public void setFila(Fila<T> fila) {
		this.fila = fila;
	}

	public Pilha<T> getPilha() {
		return pilha;
	}

	public void setPilha(Pilha<T> pilha) {
		this.pilha = pilha;
	}

}
