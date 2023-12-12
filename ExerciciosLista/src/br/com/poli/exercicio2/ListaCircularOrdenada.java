package br.com.poli.exercicio2;

public class ListaCircularOrdenada<T> extends ListaCircular<T> {

	// Método para adicionar de maneira ordenada na lista circular!!!
	public void addOrdenado(T elemento) {
		if (getInicio() == null) {

			No<T> novo = new No<T>(elemento);
			setInicio(novo);
			setFim(novo);
			getInicio().setProximo(getFim());
			getFim().setProximo(getInicio());
		} else {

			No<T> novo2 = new No<T>(elemento);

			if (novo2.comparar(getInicio().getInfo()) < 0) {
				No<T> aux = getInicio();
				while (aux.getProximo().getProximo() != getInicio())
					aux = aux.getProximo();

				aux.getProximo().setProximo(novo2);
				novo2.setProximo(getInicio());
				setInicio(novo2);

			} else {

				No<T> aux = getInicio();

				while (aux.getProximo().comparar(elemento) < 0 && aux.getProximo() != getInicio())
					aux = aux.getProximo();

				novo2.setProximo(aux.getProximo());
				aux.setProximo(novo2);
			}
		}

	}

	// Método para intercalar duas listas circulares!!!
	//Entretanto, esse método não está funfando, desculpa!!!
	public ListaCircularOrdenada<T> listaIntercalada(ListaCircularOrdenada<T> lista1, ListaCircularOrdenada<T> lista2)
			throws Exception {

		if (lista1.getInicio() == null || lista2.getInicio() == null) {
			throw new Exception("Inicie as listas para utilizar o método!!!");
		}

		ListaCircularOrdenada<T> listaAux = new ListaCircularOrdenada<T>();

		if (lista1.tamanho() != lista2.tamanho()) {

			throw new Exception("Só intercalam se as duas listas possuirem o mesmo tamanho!!!");
		} else {

			No<T> aux = lista1.getInicio();
			No<T> aux2 = lista2.getInicio();
			while (aux.getProximo() != lista1.getInicio()) {

				aux.setProximo(aux2);
				aux2.setProximo(aux.getProximo());
				aux = aux.getProximo();
				aux2 = aux2.getProximo();
			}

			aux.setProximo(aux2);
			aux2.setProximo(lista1.getInicio());
		}

		return listaAux;

	}

}
