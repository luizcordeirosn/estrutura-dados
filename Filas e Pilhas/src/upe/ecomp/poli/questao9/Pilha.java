package upe.ecomp.poli.questao9;

public class Pilha<T> {
	
	private No<T> topo;
	
	//M�todo para adicionar a pilha!!!
	public void push(T e) {
		
		No<T> novo = new No<T>(e);
		if(topo==null) {
			topo=novo;
		}
		else {
			
			novo.setProximo(topo);
			topo=novo;
		}
	}
	
	//M�todo para remover o topo da pilha!!!
	public T pop() {
		
		T r;
		r = topo.getInfo();
		topo=topo.getProximo();
		return r;
	}
	
	//M�todo para retornar o elemento do topo!!!
	public T top() {
		
		T r;
		r = topo.getInfo();
		return r;
	}

	public No<T> getTopo() {
		return topo;
	}

	public void setTopo(No<T> topo) {
		this.topo = topo;
	}

}
