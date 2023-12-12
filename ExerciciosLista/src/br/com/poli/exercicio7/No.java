package br.com.poli.exercicio7;

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

	@Override
	public String toString() {
		return info + "";
	}
}
