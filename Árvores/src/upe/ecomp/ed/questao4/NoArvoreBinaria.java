package upe.ecomp.ed.questao4;

public class NoArvoreBinaria<T> {

	private NoArvoreBinaria<T> dir;
	private NoArvoreBinaria<T> esq;
	private T info;

	public NoArvoreBinaria(T info) {
		this.info = info;
	}

	// Método para comparar info ao elemento, retornando -1,0 ou 1!!!
	public int comparar(T e) {
		int r = -1;
		if (info instanceof Comparable) {
			r = ((Comparable) info).compareTo(e);
		}
		return r;
	}

	public NoArvoreBinaria<T> getDir() {
		return dir;
	}

	public void setDir(NoArvoreBinaria<T> dir) {
		this.dir = dir;
	}

	public NoArvoreBinaria<T> getEsq() {
		return esq;
	}

	public void setEsq(NoArvoreBinaria<T> esq) {
		this.esq = esq;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

}
