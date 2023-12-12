package upe.ecomp.ed.questao2;

public class No<T> {

	private T info;
	private String prioridade;
	private No<T> proximo;

	public No(T info, String prioridade) {
		this.info = info;
		this.prioridade = prioridade;
	}
	
	public int comparar(T e) {
		
		int r = -1;
		if(info instanceof Comparable) {
			r = ((Comparable) info).compareTo(e);
		}
		return r;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

}
