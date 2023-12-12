package upe.ecomp.ed.questao5;

public class ArvoreBinaria<T> {

	private NoArvoreBinaria<T> raiz;

	// Adicionar a árvore!!!
	public void add(T e) {
		NoArvoreBinaria<T> novo = new NoArvoreBinaria<T>(e);
		if (raiz == null) {
			raiz = novo;
		} else {
			NoArvoreBinaria<T> aux = raiz;
			while (aux != null) {
				if (aux.getDir() != null && aux.comparar(e) < 0) {
					aux = aux.getDir();
				} else if (aux.getEsq() != null && aux.comparar(e) > 0) {
					aux = aux.getEsq();
				} else {

					if (aux.comparar(e) < 0) {
						aux.setDir(novo);
						break;
					} else if (aux.comparar(e) > 0) {
						aux.setEsq(novo);
						break;
					} else {
						break;
					}
				}
			}

		}
	}

	// Retornar o somatório das folhas(Raíz não entra na conta)!!!
	public int somaFolhas() {

		int i = 0;
		Lista<T> lista = new Lista<T>();

		somaFolhasAux(this.raiz, lista);
		NoLista<T> aux = lista.getInicio().getProximo();
		while (aux != null) {
			i = i + (int) aux.getInfo();
			aux = aux.getProximo();
		}

		return i;
	}

	private void somaFolhasAux(NoArvoreBinaria<T> p, Lista<T> lista) {

		if (p != null) {
			lista.add(p.getInfo());
			somaFolhasAux(p.getEsq(), lista);
			somaFolhasAux(p.getDir(), lista);
		}
	}
}
