package br.com.poli.exercicio3;

public class Main {

	public static void main(String[] args) {

		ListaSite<String> lista = new ListaSite<String>();

		try {

			lista.add("www.google.com");
			lista.add("www.facebook.com");
			lista.add("www.youtube.com");
			lista.add("www.konami.com");
			lista.add("www.discord.com");

			System.out.println("Tamanho da lista: " + lista.tamanho());
			lista.print();
			lista.buscar("www.facebook.com");
			lista.print();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
