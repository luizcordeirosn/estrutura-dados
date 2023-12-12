package upe.ecomp.ed.questao3;

public class Fila<T> {

	private No<T> inicio;
	private int size;

	public Fila() {
		this.size = 0;
	}

	// Método para adicionar a fila!!!
	public void enqueue(T e) {

		No<T> novo = new No<T>(e);
		if (inicio == null) {
			inicio = novo;
			size++;
		} else {

			No<T> aux = inicio;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
			size++;
		}
	}

	// Método para remover um elemento específico da fila!!!
	public Fila<T> dequeue(T e, Fila<T> f) throws Exception {

		Fila<T> filaAux = new Fila<T>();

		if (f.getInicio() == null) {
			throw new Exception("Fila vazia, não pode remover elemento!!!");
		} else {

			No<T> aux = f.getInicio();
			while (aux != null) {
				// Se comparar = 0, remova o elemento!!!
				if (aux.comparar(e) == 0) {
					f.dequeueAux();
					f.setSize(f.getSize() - 1);
					aux = aux.getProximo();
				}
				// Caso não, adicionar a uma fila auxiliar!!!
				else {

					filaAux.enqueue(f.dequeueAux());
					f.setSize(f.getSize() - 1);
					aux = aux.getProximo();
				}
			}

			// Looping para adicionar de volta a fila!!!
			No<T> aux2 = filaAux.getInicio();
			while (aux2 != null) {
				f.enqueue(filaAux.dequeueAux());
				aux2 = aux2.getProximo();
			}
		}

		return f;
	}

	// Método para remover o elemento inicial da fila!!!
	public T dequeueAux() {

		T r;
		r = inicio.getInfo();
		inicio = inicio.getProximo();
		return r;
	}

	// Método para retornar a fila!!!
	public String toString() {

		String r = "Inicio da fila";

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

}
