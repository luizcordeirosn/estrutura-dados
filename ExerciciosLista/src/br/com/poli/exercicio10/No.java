package br.com.poli.exercicio10;

public class No<T> {

	private T info;
	private int senha;
	private No<T> proximo;

	public No(T info, int senha) {

		this.info = info;
		this.senha = senha;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
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
