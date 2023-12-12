package upe.ecomp.poli.questao9;

public class Main {

	public static void main(String[] args) {

		Lista<Character> l = new Lista<Character>();

		l.add('8');
		l.add('A');
		l.add('7');
		l.add('B');
		l.add('6');
		l.add('C');
		l.add('c');
		l.add('1');
		l.add('*');

		System.out.println(l.toString());
		System.out.println(l.inverterOrdem().toString());
	}

}
