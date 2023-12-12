package upe.ecomp.ed.questao2;

public class Main {

	public static void main(String[] args) {

		try {
			ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
			ArvoreBinaria<Integer> arvore2 = new ArvoreBinaria<Integer>();

			arvore.add(30);
			arvore.add(40);
			arvore.add(20);
			arvore.add(25);
			arvore.add(15);
			arvore.add(35);
			arvore.add(45);

			arvore2.add(20);
			arvore2.add(25);
			arvore2.add(15);

			if (arvore.contemSub(arvore2)) {
				System.out.println("Cont�m a sub-�rvore");
			} else {
				System.out.println("N�o cont�m");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
