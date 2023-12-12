package upe.ecomp.ed.questao4;

public class Main {

	public static void main(String[] args) {

		try {
			ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();

			arvore.add(30);
			arvore.add(15);
			arvore.add(45);
			arvore.add(21);
			arvore.add(7);
			arvore.add(60);

			System.out.println(arvore.nivelArvore(0).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
