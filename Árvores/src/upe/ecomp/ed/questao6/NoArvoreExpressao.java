package upe.ecomp.ed.questao6;

public class NoArvoreExpressao<T> {

	private NoArvoreExpressao<T> dir;
	private NoArvoreExpressao<T> esq;
	private T info;
	private int operando;

	public NoArvoreExpressao(T info) {
		this.info = info;
	}

	public boolean isOperador() {
		return esq != null || dir != null;
	}

	public NoArvoreExpressao<T> getDir() {
		return dir;
	}

	public void setDir(NoArvoreExpressao<T> dir) {
		this.dir = dir;
	}

	public NoArvoreExpressao<T> getEsq() {
		return esq;
	}

	public void setEsq(NoArvoreExpressao<T> esq) {
		this.esq = esq;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public int getOperando() {
		return operando;
	}

	public void setOperando(int operando) {
		this.operando = operando;
	}

}
