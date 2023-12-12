package upe.ecomp.ed.questao5;

public class Main {

	public static void main(String[] args) {

		try {

			FilaRadio<String> f = new FilaRadio<String>();

			f.enqueue("Eu vou te ***", "Galo frito", "3");
			f.enqueue("Vamos pra Gaiola - Bigodin Finin, Cabelin na Régua", "Kevin o Chris ", "5");
			f.enqueue("you probably coudn't see for the lights but you were staring straight at me", "Arctic Monkeys",
					"7");

			System.out.println(f.toString());

			f.pularProximaMusica();
			f.pularProximaMusica();

			System.out.println(f.toString());
			System.out.println(f.irMusicaAnterior());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
