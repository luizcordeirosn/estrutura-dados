package upe.ecomp.ed.questao3;

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
			arvore.add(87);
			arvore.add(70);

			System.out.println(arvore.noDesbalanceado());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
