package upe.ecomp.ed.questao4;

public class ArvoreBinaria<T> {

	private NoArvoreBinaria<T> raiz;

	// Adicionar a �rvore!!!
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

	// Veririficar se um elemento cont�m na �rvore!!!
	public boolean contains(T e) throws Exception {

		boolean r = false;
		if (raiz == null) {
			throw new Exception("�rvore vazia!!!");
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

	// Calcular a profundidade de um n�!!!
	public int profundidade(T e) throws Exception {

		int profundidade = 0;

		if (raiz == null) {
			throw new Exception("�rvore vazia!!!");
		} else if (contains(e) == false) {
			throw new Exception("Elemento n�o contido na �rvore!!!");
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

	// Retornar uma lista com todos os n�s de um determinado n�vel!!!
	public Lista<T> nivelArvore(int n) throws Exception {

		Lista<T> lista = new Lista<T>();
		nivelArvoreAux(raiz, lista, n);
		return lista;
	}

	private void nivelArvoreAux(NoArvoreBinaria<T> p, Lista<T> lista, int n) throws Exception {

		if (p != null) {

			if (profundidade(p.getInfo()) == n) {
				lista.add(p.getInfo());
			}
			nivelArvoreAux(p.getEsq(), lista, n);
			nivelArvoreAux(p.getDir(), lista, n);
		}
	}

}
