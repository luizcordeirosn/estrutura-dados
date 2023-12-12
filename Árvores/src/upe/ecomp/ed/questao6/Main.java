package upe.ecomp.ed.questao6;

public class Main {

	public static void main(String[] args) {

		ArvoreExpressao<String> arvore = new ArvoreExpressao<String>();
		try {
			System.out.println(arvore.resolve("(((3-7)*9)-9)/5)"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
