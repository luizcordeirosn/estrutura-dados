package upe.ecomp.ed.questao1;

public class ArvoreBinaria<T> {

	private NoArvoreBinaria<T> raiz;

	// Adicionar na árvore!!!
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

	// Verificar se contém na árvore!!!
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

	// Achar a profundidade de um nó!!!
	public int profundidade(T e) throws Exception {

		int profundidade = 0;

		if (raiz == null) {
			throw new Exception("Árvore vazia!!!");
		} else if (contains(e) == false) {
			throw new Exception("Elemento não contido na árvore!!!");
		} else {

			NoArvoreBinaria<T> aux = raiz;
			while (aux != null && aux.comparar(e) != 0) {

				if (aux.comparar(e) > 0) {
					aux = aux.getEsq();
					profundidade++;
				} else {
					aux = aux.getDir();
					profundidade++;
				}
			}

			return profundidade;
		}
	}

	// Retornar uma lista com os elementos em comum de duas árvores
	public Lista<T> elementosComum(ArvoreBinaria<T> arv1, ArvoreBinaria<T> arv2) throws Exception {

		Lista<T> lista = new Lista<T>();
		elementosComumAux(arv1, arv2.raiz, lista);
		return lista;
	}

	private void elementosComumAux(ArvoreBinaria<T> arv1, NoArvoreBinaria<T> p, Lista<T> lista) throws Exception {

		if (p != null) {

			if (arv1.contains(p.getInfo()) == true) {
				lista.add(p.getInfo());
			}
			elementosComumAux(arv1, p.getEsq(), lista);
			elementosComumAux(arv1, p.getDir(), lista);
		}

	}

	// Percorrer a árvore e adicionar a lista com percurso em-ordem!!!
	public Lista<T> listaEmOrdem() {

		Lista<T> lista = new Lista<T>();
		listaEmOrdemAux(this.raiz, lista);
		return lista;
	}

	private void listaEmOrdemAux(NoArvoreBinaria<T> p, Lista<T> lista) {

		if (p != null) {

			listaPreOrdemAux(p.getEsq(), lista);
			lista.add(p.getInfo());
			listaPreOrdemAux(p.getDir(), lista);
		}
	}

	// Percorrer a árvore e adicionar a lista com percurso pré-ordem!!!
	public Lista<T> listaPreOrdem() {

		Lista<T> lista = new Lista<T>();
		listaPreOrdemAux(this.raiz, lista);
		return lista;
	}

	private void listaPreOrdemAux(NoArvoreBinaria<T> p, Lista<T> lista) {

		if (p != null) {

			lista.add(p.getInfo());
			listaPreOrdemAux(p.getEsq(), lista);
			listaPreOrdemAux(p.getDir(), lista);
		}
	}

	// Percorrer a árvore e adicionar a lista com percurso pós-ordem!!!
	public Lista<T> listaPosOrdem() {

		Lista<T> lista = new Lista<T>();
		listaPosOrdemAux(this.raiz, lista);
		return lista;
	}

	private void listaPosOrdemAux(NoArvoreBinaria<T> p, Lista<T> lista) {

		if (p != null) {

			listaPosOrdemAux(p.getEsq(), lista);
			listaPosOrdemAux(p.getDir(), lista);
			lista.add(p.getInfo());
		}
	}

	// Retornar os nós que tem a mesma altura e profundidade!!!
	public Lista<T> alturaProfundidade() throws Exception {

		Lista<T> lista = new Lista<T>();
		alturaProfundidadeAux(this.raiz, lista);
		return lista;
	}

	private void alturaProfundidadeAux(NoArvoreBinaria<T> p, Lista<T> lista) throws Exception {

		if (p != null) {

			if (alturaNo(p.getInfo()) == profundidade(p.getInfo())) {
				lista.add(p.getInfo());
			}
			alturaProfundidadeAux(p.getEsq(), lista);
			alturaProfundidadeAux(p.getDir(), lista);
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

}
