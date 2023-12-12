package upe.ecomp.ed.questao5;

public class Main {

	public static void main(String[] args) {

		try {
			ArvoreBinaria<Integer> arvore1 = new ArvoreBinaria<>();

			arvore1.add(10);
			arvore1.add(8);
			arvore1.add(15);
			arvore1.add(6);
			arvore1.add(9);
			arvore1.add(12);
			arvore1.add(18);

			System.out.println(arvore1.somaFolhas());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
