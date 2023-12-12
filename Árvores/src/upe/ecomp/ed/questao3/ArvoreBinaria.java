package upe.ecomp.ed.questao3;

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

	public int alturaNo(T e) {
		NoArvoreBinaria<T> no = procurarNo(e);
		int altura = calcularAltura(no);
		return altura;
	}

	private int calcularAltura(NoArvoreBinaria<T> no) {
		int r = -1;
		if (no != null) {
			int esq = calcularAltura(no.getEsq());
			int dir = calcularAltura(no.getDir());
			r = (esq > dir) ? esq + 1 : dir + 1;
		}
		return r;
	}

	private NoArvoreBinaria<T> procurarNo(T e) {
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

	// Método para retornar os nós desbalanceados, caso exista!!!
	public T noDesbalanceado() throws Exception {

		Lista<T> lista = new Lista<T>();
		// Chamar o método aux, que percorre a árvore e adiciona os nós desbalanceados a
		// lista, caso existam!!!
		noDesbalanceadoAux(this.raiz, lista);
		// Retornar o início da lista, caso não seja nula!!!
		if (lista.getInicio() != null) {
			return lista.getInicio().getInfo();
		} else {
			throw new Exception("Árvora é AVL");
		}
	}

	private void noDesbalanceadoAux(NoArvoreBinaria<T> p, Lista<T> lista) throws Exception {

		if (p != null) {

			noDesbalanceadoAux(p.getEsq(), lista);
			noDesbalanceadoAux(p.getDir(), lista);

			if (calcularAltura(p.getEsq()) - calcularAltura(p.getDir()) > 1
					|| calcularAltura(p.getDir()) - calcularAltura(p.getEsq()) > 1) {
				lista.add(p.getInfo());
			}
		}

	}

}
