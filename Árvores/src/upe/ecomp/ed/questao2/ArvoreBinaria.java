package upe.ecomp.ed.questao2;

public class ArvoreBinaria<T> {

	private NoArvoreBinaria<T> raiz;

	//Adicionar a árvore!!!
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

	// Veririficar se um elemento contém na árvore!!!
	public boolean contains(T e) throws Exception {

		boolean r = false;
		if (raiz == null) {
			throw new Exception("Árvore vazia!!!");
		} else {

			NoArvoreBinaria<T> aux = raiz;
			while (aux != null) {

				if (aux.comparar(e) < 0) {
					aux = aux.getDir();
				} else if (aux.comparar(e) > 0) {
					aux = aux.getEsq();
				} else if (aux.comparar(e) == 0) {
					r = true;
					break;
				}
			}

			return r;
		}

	}

	public NoArvoreBinaria<T> procurarNo(T e) {
		NoArvoreBinaria<T> r = null;
		NoArvoreBinaria<T> p = raiz;
		while (p != null) {
			int c = p.comparar(e);
			if (c == 0) {
				r = p;
				break;
			} else if (c > 0) { // e < p.info
				p = p.getEsq();
			} else { // e > p.info
				p = p.getDir();
			}
		}
		return r;
	}

	//Verificar se uma sub-árvore contém em uma árvore!!!
	public boolean contemSub(ArvoreBinaria<T> arv) throws Exception {

		boolean r = true;
		Lista<T> lista1 = new Lista<T>();
		Lista<T> lista2 = new Lista<T>();

		//Verificar se contém a raiz!!!
		if (this.contains(arv.raiz.getInfo())) {
			contemSubAux(procurarNo(arv.getRaiz().getInfo()), lista1);
			contemSubAux(arv.raiz, lista2);
			//Caso possua, comparar o toString de ambas, verificando se são iguais ou não!!!
			if (!lista1.toString().equals(lista2.toString())) {
				r = false;
			}
		} else {
			r = false;
		}

		return r;

	}

	private void contemSubAux(NoArvoreBinaria<T> arv, Lista<T> lista) {

		if (arv != null) {

			lista.add(arv.getInfo());
			contemSubAux(arv.getEsq(), lista);
			contemSubAux(arv.getDir(), lista);
		}

	}

	public NoArvoreBinaria<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}

}
