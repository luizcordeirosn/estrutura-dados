package upe.ecomp.ed.questao4;

public class Main {

	public static void main(String[] args) {

		Pilha<Integer> p = new Pilha<Integer>();
		Pilha<Integer> p2 = new Pilha<Integer>();

		p.push(30);
		p.push(40);
		p.push(50);
		p.push(60);

		p2.push(9);
		p2.push(18);
		p2.push(36);
		p2.push(27);
		System.out.println(p2.toString());
		System.out.println(p2.getSize());

		p.pop(27, p2);
		System.out.println(p2.toString());
		System.out.println(p2.getSize());
	}

}
