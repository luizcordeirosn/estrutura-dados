package upe.ecomp.ed.questao1;

public class No<T> {

	private char info;
	private No<T> proximo;

	public No(char info) {
		this.info = info;
	}

	public char getInfo() {
		return info;
	}

	public void setInfo(char info) {
		this.info = info;
	}

	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

}
