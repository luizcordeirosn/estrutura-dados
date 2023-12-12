package upe.ecomp.ed.questao6;

public class No<T> {

	private T info;
	private No<T> proximo;

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

	public int comparar(T e) {

		int r = -1;
		if (info instanceof Comparable) {
			r = ((Comparable) info).compareTo(e);
		}
		return r;
	}

}
