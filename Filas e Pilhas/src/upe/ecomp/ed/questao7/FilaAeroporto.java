package upe.ecomp.ed.questao7;

public class FilaAeroporto<T> {

	private No<T> inicio;
	private int size;

	public FilaAeroporto() {
		this.size = 0;
	}

	// Método par adicionar a fila!!!
	public void enqueue(T e, T t, T p) {

		No<T> novo = new No<T>(e, t, p);
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

	// Método para remover da fila caso não seja nula, além de retornar seu
	// inicio!!!
	public T dequeue() throws Exception {

		T r;

		if (inicio != null) {
			r = inicio.getInfo();
			inicio = inicio.getProximo();
			size--;
		} else {
			throw new Exception("Fila vazia!!!");
		}

		return r;
	}

	// Método para autorizar a decolagem do avião!!!
	public void autorizarDecolagem(FilaAeroporto<T> filaDecolagem, FilaAeroporto<T> filaEspera) throws Exception {

		// Se a fila de decolagem for nula, autorizar decolagem
		if (filaDecolagem.getInicio() == null) {

			filaDecolagem.enqueue(filaEspera.dequeue(), filaEspera.getInicio().getTamanho(),
					filaEspera.getInicio().getPeso());
		}
		// Caso não, retornar uma excessão!!!
		else {
			throw new Exception("Avião aguardando para decolar!!!");
		}
	}

	// Método para avião da fila de decolagem partir!!!
	public void decolar(FilaAeroporto<T> filaDecolagem) throws Exception {

		// Se a fila de decolagem for nula, retornar uma excessão!!!
		if (filaDecolagem.getInicio() == null) {
			throw new Exception("Autorizar decolagem do próximo avião!!!");
		}
		// Se não, remover elemento da fila de decolagem!!!
		else {
			filaDecolagem.dequeue();
		}
	}

	// Método para retornar as características do primeiro avião!!!
	public String caracteristicasPrimeiroAviao() {

		String r = "";

		if (inicio == null) {
			return r;
		}

		r = r + "Nome: " + inicio.getInfo() + " Tamanho: " + inicio.getTamanho() + " Peso: " + inicio.getPeso();
		return r;
	}

	// Método para retornar a fila!!!
	public String toString() {

		String r = "Topo da fila";

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
