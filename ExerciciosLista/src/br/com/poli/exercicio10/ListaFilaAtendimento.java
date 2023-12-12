package br.com.poli.exercicio10;
import java.util.Random;;

public class ListaFilaAtendimento<T> {

	private No<T> inicio;
	
	Random r = new Random();
	int senha = r.nextInt(100);

	public void retirarSenha(T prioridade) {

		if (prioridade.equals("P")) {
			retirarSenhaPrioridade(prioridade);
		} else if (prioridade.equals("N")) {
			retirarSenhaPrioridade(prioridade);
		}
	}

	private void retirarSenhaPrioridade(T prioridade) {

		No<T> novo = new No<T>(prioridade, senha);

		if (prioridade.equals("P")) {

			if (inicio == null) {
				senha++;
				inicio = novo;
			} else {

				No<T> aux = inicio;
				while (aux.getProximo().getInfo().equals("P")) {

					aux = aux.getProximo();
				}
				novo.setProximo(aux.getProximo());
				aux.setProximo(novo);
				senha++;
			}
		} else {

			if (inicio == null) {
				senha++;
				inicio = novo;
			} else {

				No<T> aux = inicio;
				while (aux.getProximo() != null) {

					aux = aux.getProximo();
				}
				senha++;
				aux.setProximo(novo);
			}
		}
	}

	// Método para remover o primeiro da lista!!!
	public void atendimento() throws Exception {

		if (inicio == null) {
			throw new Exception("Sem clientes para atender!!!");
		}

		System.out.println(
				"Cliente de prioridade " + inicio.getInfo() + " e senha " + inicio.getSenha() + " em atendimento!!!");
		inicio = inicio.getProximo();
	}

	// Método para verificar se está contido na lista!!!
	public boolean procurarSenha(int senha) throws Exception {

		if (inicio == null) {
			throw new Exception("Lista vazia, não possui elementos para remover!!!");
		}

		No<T> aux = inicio;

		while (aux != null) {

			if (aux.getSenha() == senha) {
				System.out.println("Cliente com a senha " + senha + " está na fila!!!");
				return true;
			}
			aux = aux.getProximo();
		}
		System.out.println("Cliente com a senha " + senha + " não está na fila!!!");
		return false;
	}

	// Método para remover um elemento da lista!!!
	public void removerSenha(int senha) throws Exception {

		if (inicio == null) {
			throw new Exception("Lista vazia, não possui elementos para remover!!!");
		} else {

			if (procurarSenha(senha) == false) {
				throw new Exception("Senha não contida na lista de atendimento!!!");
			}
			No<T> aux = inicio;

			if (aux.getSenha() == senha) {
				inicio = aux.getProximo();

			} else {
				while (aux != null) {

					if (aux.getProximo().getSenha() == senha) {

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

	// Método para printar a lista!!!
	public void print() throws Exception {

		No<T> aux = inicio;
		System.out.println("Prioridade" + " - Senha");

		if (inicio == null) {

			throw new Exception("Lista vazia!!!");
		}

		while (aux.getProximo() != null) {
			System.out.println(aux.getInfo() + " - " + aux.getSenha());
			aux = aux.getProximo();
		}
		System.out.println(aux.getInfo() + " - " + aux.getSenha());

	}

}
