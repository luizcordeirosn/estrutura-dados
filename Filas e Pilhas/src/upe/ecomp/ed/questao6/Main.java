package upe.ecomp.ed.questao6;

public class Main {

	public static void main(String[] args) {

		try {
			Pilha<Integer> torre1 = new Pilha<Integer>();
			Pilha<Integer> torre2 = new Pilha<Integer>();
			Pilha<Integer> torre3 = new Pilha<Integer>();

			System.out.println("Mover todos os blocos para a torre 3!!!");
			System.out.println();

			torre1.push(30);
			torre1.push(20);
			torre1.push(10);
			System.out.println(torre1.toString());
			System.out.println(torre2.toString());
			System.out.println(torre3.toString());
			System.out.println();

			torre1.moverBloco(torre1, torre3);
			System.out.println(torre1.toString());
			System.out.println(torre2.toString());
			System.out.println(torre3.toString());
			System.out.println();

			torre1.moverBloco(torre1, torre2);
			System.out.println(torre1.toString());
			System.out.println(torre2.toString());
			System.out.println(torre3.toString());
			System.out.println();

			torre1.moverBloco(torre3, torre2);
			System.out.println(torre1.toString());
			System.out.println(torre2.toString());
			System.out.println(torre3.toString());
			System.out.println();

			torre1.moverBloco(torre1, torre3);
			System.out.println(torre1.toString());
			System.out.println(torre2.toString());
			System.out.println(torre3.toString());
			System.out.println();

			torre1.moverBloco(torre2, torre1);
			System.out.println(torre1.toString());
			System.out.println(torre2.toString());
			System.out.println(torre3.toString());
			System.out.println();

			torre1.moverBloco(torre2, torre3);
			System.out.println(torre1.toString());
			System.out.println(torre2.toString());
			System.out.println(torre3.toString());
			System.out.println();

			torre1.moverBloco(torre1, torre3);
			System.out.println(torre1.toString());
			System.out.println(torre2.toString());
			System.out.println(torre3.toString());
			System.out.println();

			System.out.println(torre1.getMove());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
