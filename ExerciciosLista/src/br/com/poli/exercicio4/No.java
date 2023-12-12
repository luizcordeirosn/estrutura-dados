package br.com.poli.exercicio4;

public class No<T> {

	private T info;
	private int matricula;
	private No<T> proximo;

	public No(T info, int matricula) {

		this.info = info;
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
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
