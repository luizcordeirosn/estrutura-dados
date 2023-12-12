package upe.ecomp.ed.questao3;

public class Main {

	public static void main(String[] args) {

		try {
			Fila<Integer> f1 = new Fila<Integer>();
			Fila<Integer> f2 = new Fila<Integer>();

			f1.enqueue(9);
			f1.enqueue(18);
			f1.enqueue(27);
			f1.enqueue(36);
			f1.enqueue(45);

			f2.enqueue(10);
			f2.enqueue(20);
			f2.enqueue(30);
			f2.enqueue(40);
			f2.enqueue(50);

			System.out.println(f1.dequeue(30, f2).toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
