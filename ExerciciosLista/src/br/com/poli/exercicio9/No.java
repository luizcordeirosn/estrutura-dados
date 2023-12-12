package br.com.poli.exercicio9;

public class No<T> {

	private T info;
	private No<T> proximo;
	private No<T> anterior;

	public No(T info) {

		this.info = info;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

	public No<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(No<T> anterior) {
		this.anterior = anterior;
	}

	public int comparar(T elemento) {

		int r = -1;

		if (info instanceof Comparable) {
			r = ((Comparable) info).compareTo(elemento);
		}

		return r;
	}

	@Override
	public String toString() {
		return info + "";
	}
}
