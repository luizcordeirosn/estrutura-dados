package upe.ecomp.ed.questao1;

public class Main {

	public static void main(String[] args) {

		try {
			Pilha<String> p = new Pilha<String>();

			if (p.palabrapalindroma("543753357345") == true) {
				System.out.println("Palavra � pal�ndroma");
			} else {
				System.out.println("Palavra n�o � pal�ndroma");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
