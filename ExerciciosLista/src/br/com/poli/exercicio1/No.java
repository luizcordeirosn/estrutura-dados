package br.com.poli.exercicio1;

public class No<T> {

	private T info;
	private No<T> proximo;
	private No<T> cabeca;

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

	public No<T> getCabeca() {
		return cabeca;
	}

	public void setCabeca(No<T> cabeca) {
		this.cabeca = cabeca;
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
