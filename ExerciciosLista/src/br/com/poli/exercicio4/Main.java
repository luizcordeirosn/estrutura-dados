package br.com.poli.exercicio4;

public class Main {
	public static void main(String[] args) {

		try {

			ListaAluno<String> lista1 = new ListaAluno<>();
			lista1.adicionarAluno("joao");
			lista1.adicionarAluno("luiz");
			lista1.adicionarAluno("carlos");
			lista1.adicionarAluno("neto");
			lista1.print();
			System.out.println();
			lista1.removeAluno("neto");
			lista1.adicionarAluno("Merilo");
			lista1.print();

			System.out.println();
			System.out.println("Tamanho: " + lista1.tamanho());

			lista1.buscar("joao");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
