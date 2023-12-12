package upe.ecomp.ed.questao5;

public class No<T> {

	private T titulo;
	private T cantor;
	private T tempo;
	private No<T> proximo;

	public No(T titulo, T cantor, T tempo) {

		this.titulo = titulo;
		this.cantor = cantor;
		this.tempo = tempo;
	}

	public T getTitulo() {
		return titulo;
	}

	public void setTitulo(T titulo) {
		this.titulo = titulo;
	}

	public T getCantor() {
		return cantor;
	}

	public void setCantor(T cantor) {
		this.cantor = cantor;
	}

	public T getTempo() {
		return tempo;
	}

	public void setTempo(T tempo) {
		this.tempo = tempo;
	}

	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

}
