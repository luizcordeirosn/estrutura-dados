package upe.ecomp.ed.questao2;

public class Main {

	public static void main(String[] args) {

		try {
			Fila<Integer> p = new Fila<Integer>();

			p.enqueue(30, "N");
			p.enqueue(40, "N");
			p.enqueue(50, "P");
			p.enqueue(60, "P");
			p.enqueue(5, "N");
			p.enqueue(3, "P");

			System.out.println(p.toString());
			System.out.println(p.getSize());

			if (p.buscar(5)) {
				System.out.println("Elemento contido na lista!!!");
			} else {
				System.out.println("Elemento não contido na lista!!!");
			}

			p.dequeue();
			p.dequeue();
			System.out.println(p.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
