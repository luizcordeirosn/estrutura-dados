package br.com.poli.exercicio4;

import br.com.poli.exercicio4.No;

public class ListaAluno<T> {

	private No<T> inicio;

	int contador = 1;

	// M�todo parA adicionar um aluno ao in�cio da lista!!!
	public void adicionarAluno(T aluno) {

		if (inicio == null) {

			No<T> novo = new No<T>(aluno, contador);
			contador++;
			inicio = novo;
		} else {

			No<T> aux = inicio;

			while (aux.getProximo() != null) {

				aux = aux.getProximo();

			}

			No<T> novo2 = new No<T>(aluno, contador);
			contador++;
			aux.setProximo(novo2);

		}
	}

	// M�todo para remover um aluno da lista!!!
	public void removeAluno(T aluno) throws Exception {

		if (inicio == null) {
			throw new Exception("Lista vazia!!!");
		}

		else if (buscar(aluno) == false) {
			throw new Exception("Aluno n�o matriculado.");
		}

		else if (inicio == null) {
			throw new Exception("A escola ta passando fome, n�o tem alunos!!!");
		} else {
			No<T> aux = inicio;

			if (aux.getInfo().equals(aluno)) {
				inicio = aux.getProximo();

			} else {
				while (aux != null) {

					if ((aux.getProximo().getInfo().equals(aluno))) {

						if (aux.getProximo().getProximo() == null) {
							aux.setProximo(null);
						} else {
							aux.setProximo(aux.getProximo().getProximo());
						}
						break;
					} else {
						aux = aux.getProximo();
					}

				}

			}
		}
	}

	// M�todo para verificar se o aluno est� contido na lista!!!
	public boolean buscar(T aluno) throws Exception {
		
		if (inicio == null) {
			throw new Exception("Lista vazia!!!");
		}

		No<T> aux = inicio;

		while (aux != null) {

			if (aux.getInfo().equals(aluno)) {
				System.out.println("Aluno " + aux.getInfo() + " contido na disciplina.");
				return true;

			}
			aux = aux.getProximo();
		}
		System.out.println("Aluno " + aluno + " n�o contido na disciplina.");
		return false;
	}

	// M�todo para retornar o tamanho da lista!!!
	public int tamanho() {

		int tamanho = 1;

		No<T> aux = inicio;
		if (aux == null) {
			tamanho = 0;
		} else {

			while (aux.getProximo() != null) {

				tamanho++;
				aux = aux.getProximo();
			}
		}

		return tamanho;
	}

	// M�todo para printar a lista!!!
	public void print() throws Exception {

		No<T> aux = inicio;
		System.out.println("Aluno" + " - Matricula");

		if (inicio == null) {

			throw new Exception("Lista vazia!!!");
		}

		while (aux.getProximo() != null) {
			System.out.println(aux.getInfo() + " - " + aux.getMatricula());
			aux = aux.getProximo();
		}
		System.out.println(aux.getInfo() + " - " + aux.getMatricula());

	}
}
