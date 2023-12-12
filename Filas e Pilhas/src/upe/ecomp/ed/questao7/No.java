package upe.ecomp.ed.questao7;

public class No<T> {

	private T info;
	private T tamanho;
	private T peso;
	private No<T> proximo;

	public No(T info, T tamanho, T peso) {
		this.info = info;
		this.tamanho = tamanho;
		this.peso = peso;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public T getTamanho() {
		return tamanho;
	}

	public void setTamanho(T tamanho) {
		this.tamanho = tamanho;
	}

	public T getPeso() {
		return peso;
	}

	public void setPeso(T peso) {
		this.peso = peso;
	}

	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

}
