package upe.ecomp.ed.questao6;

public class NoPilha<T> {

	private NoPilha<T> proximo;
	private T info;

	public NoPilha(T e) {
		this.info = e;
	}

	public NoPilha<T> getProximo() {
		return proximo;
	}

	public void setPróximo(NoPilha<T> proximo) {
		this.proximo = proximo;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

}
