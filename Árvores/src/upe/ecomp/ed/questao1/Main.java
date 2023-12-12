package upe.ecomp.ed.questao1;

public class Main {

	public static void main(String[] args) {

		try {
			ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
			ArvoreBinaria<Integer> arvore2 = new ArvoreBinaria<Integer>();

			arvore.add(30);
			arvore.add(15);
			arvore.add(45);
			arvore.add(21);
			arvore.add(7);
			arvore.add(60);

			arvore2.add(17);
			arvore2.add(29);
			arvore2.add(13);
			arvore2.add(45);
			arvore2.add(30);
			arvore2.add(21);

			System.out.println(arvore.profundidade(21));
			System.out.println(arvore.elementosComum(arvore, arvore2).toString());
			System.out.println(arvore.listaEmOrdem().toString());
			System.out.println(arvore.listaPreOrdem().toString());
			System.out.println(arvore.listaPosOrdem().toString());
			System.out.println(arvore.alturaProfundidade().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
