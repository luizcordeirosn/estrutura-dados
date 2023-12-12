package upe.ecomp.ed.questao2;

public class Fila<T> {

	private No<T> inicio;
	private int size;

	public Fila() {
		this.size = 0;
	}

	//Método para adicionar a fila!!!
	//OBS: O adicionar está parecido com o de lista, porém peço desculpas desde já, mas utilizaria a mesma lógica da terceira questão!!!
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

	//Método para remover um elemento da fila!!!
	public void dequeue() throws Exception {

		if (inicio == null) {
			throw new Exception("Fila vazia, não pode remover elemento!!!");
		}

		inicio = inicio.getProximo();
		size--;
	}

	//Método para buscar um elemento da fila!!!
	public boolean buscar(T e) throws Exception {

		boolean r = false;

		if (inicio == null) {
			throw new Exception("Fila vazia, não pode remover elemento!!!");
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

	//Métood para retornar a fila!!!
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
