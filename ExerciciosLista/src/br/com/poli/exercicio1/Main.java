package br.com.poli.exercicio1;

public class Main {

	public static void main(String[] args) {

		//João Miguel e Luiz Cordeiro!!!
		
		try {

			Lista<Integer> lista = new Lista<Integer>();

			lista.add(5);
			lista.add(6);
			lista.add(20);

			lista.addElementoCabeca(7, 5);
			lista.addElementoCabeca(21, 5);
			lista.addElementoCabeca(8, 6);
			lista.addElementoCabeca(88, 6);
			lista.addElementoCabeca(90, 6);
			lista.addElementoCabeca(13, 20);
			lista.addElementoCabeca(27, 20);
			lista.addElementoCabeca(36, 20);

			lista.printCabeca();
			System.out.print("Lista das cabeças: ");
			lista.print();

			System.out.print("Lista planificada: ");
			lista.planificar().print();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
