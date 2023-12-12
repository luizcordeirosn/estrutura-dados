package upe.ecomp.ed.questao2;

public class Fila<T> {

	private No<T> inicio;
	private int size;

	public Fila() {
		this.size = 0;
	}

	//M�todo para adicionar a fila!!!
	//OBS: O adicionar est� parecido com o de lista, por�m pe�o desculpas desde j�, mas utilizaria a mesma l�gica da terceira quest�o!!!
	public void enqueue(T e, String p) throws Exception {

		No<T> novo = new No<T>(e, p);
		if (p.equals("P")) {
			if (inicio == null) {
				inicio = novo;
				size++;
			}

			else if (inicio.getPrioridade().equals("N")) {
				novo.setProximo(inicio);
				inicio = novo;
				size++;
			} else {
				No<T> aux = inicio;
				while (aux.getProximo() != null && aux.getProximo().getPrioridade().equals("P")) {

					aux = aux.getProximo();
				}
				novo.setProximo(aux.getProximo());
				aux.setProximo(novo);
				size++;
			}
		} else if (p.equals("N")) {

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
		} else {
			throw new Exception("Prioridade apenas pode ser P ou N!!!");
		}
	}

	//M�todo para remover um elemento da fila!!!
	public void dequeue() throws Exception {

		if (inicio == null) {
			throw new Exception("Fila vazia, n�o pode remover elemento!!!");
		}

		inicio = inicio.getProximo();
		size--;
	}

	//M�todo para buscar um elemento da fila!!!
	public boolean buscar(T e) throws Exception {

		boolean r = false;

		if (inicio == null) {
			throw new Exception("Fila vazia, n�o pode remover elemento!!!");
		}

		No aux = inicio;
		while (aux != null) {

			if (aux.comparar(e) == 0) {
				r = true;
			}
			aux = aux.getProximo();
		}

		return r;
	}

	//M�tood para retornar a fila!!!
	public String toString() {

		String r = "Inicio da fila";

		if (inicio == null) {
			return r + " ->";
		}

		No<T> aux = inicio;
		while (aux != null) {
			r = r + " -> " + aux.getInfo() + "(" + aux.getPrioridade() + ")";
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
