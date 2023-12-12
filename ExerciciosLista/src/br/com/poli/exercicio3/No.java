package br.com.poli.exercicio3;

public class No<T> {

	private T info;
	private No<T> proximo;

	public No(T elemento) {

		info = elemento;
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
