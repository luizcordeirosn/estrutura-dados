package upe.ecomp.ed.questao5;

public class FilaRadio<T> {

	private No<T> inicio;
	private int size;
	private Pilha<T> musicaAnterior;

	public FilaRadio() {
		this.size = 0;
		musicaAnterior = new Pilha<T>();
	}

	// M�todo para adicionar a fila!!!
	public void enqueue(T titulo, T cantor, T tempo) {

		No<T> novo = new No<T>(titulo, cantor, tempo);
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

	// M�todo para pular para pr�xima m�sica!!!
	public FilaRadio<T> pularProximaMusica() throws Exception {

		if (inicio == null) {

			throw new Exception("Fila de m�sica vazia!!!");
		} else {

			// Antes de remover, adicionar a uma pilha!!!
			musicaAnterior.push(inicio.getTitulo(), inicio.getCantor(), inicio.getTempo());
			inicio = inicio.getProximo();
			size--;
		}

		return this;
	}

	// M�todo para retornar a m�sica anterior!!!
	public String irMusicaAnterior() throws Exception {

		String r;
		r = musicaAnterior.toString();
		musicaAnterior.pop();
		return r;
	}

	// M�todo para retornar a fila!!!
	public String toString() {

		String r = "Fila das m�sicas para tocar";

		if (inicio == null) {
			return r + " ->";
		}

		No<T> aux = inicio;
		while (aux != null) {
			r = r + " -> " + aux.getTitulo() + " - " + aux.getCantor() + " - " + aux.getTempo();
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

	public Pilha<T> getMusicaAnterior() {
		return musicaAnterior;
	}

	public void setMusicaAnterior(Pilha<T> musicaAnterior) {
		this.musicaAnterior = musicaAnterior;
	}

}
