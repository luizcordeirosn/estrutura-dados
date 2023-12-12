package upe.ecomp.ed.questao7;

public class Main {

	public static void main(String[] args) {

		try {

			FilaAeroporto<String> pistaEspera = new FilaAeroporto<String>();
			FilaAeroporto<String> pistaDecolagem = new FilaAeroporto<String>();

			pistaEspera.enqueue("Boing 747", "30 metros", "130 toneladas");
			pistaEspera.enqueue("Bimotor azul", "15 metros", "30 toneladas");
			pistaEspera.enqueue("F15", "19 metros", "20 toneladas");
			pistaEspera.enqueue("Barão vermelho", "6 metros", "0.6 tonelada");
			pistaEspera.autorizarDecolagem(pistaDecolagem, pistaEspera);
			pistaEspera.decolar(pistaDecolagem);

			System.out.println(pistaEspera.toString());
			System.out.println(pistaDecolagem.toString());
			System.out.println(pistaEspera.caracteristicasPrimeiroAviao());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
