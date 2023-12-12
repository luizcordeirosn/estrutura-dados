package br.com.poli.exercicio10;

public class Main {

	public static void main(String[] args) {

		try {

			ListaFilaAtendimento<String> filaAtendimento = new ListaFilaAtendimento<String>();

			filaAtendimento.retirarSenha("P");
			filaAtendimento.retirarSenha("N");
			filaAtendimento.retirarSenha("P");
			filaAtendimento.retirarSenha("N");
			filaAtendimento.retirarSenha("P");
			filaAtendimento.retirarSenha("P");
			filaAtendimento.retirarSenha("N");
			filaAtendimento.retirarSenha("N");
			filaAtendimento.retirarSenha("P");
			filaAtendimento.print();

			System.out.println();
			filaAtendimento.atendimento();
			filaAtendimento.atendimento();
			filaAtendimento.print();
			filaAtendimento.procurarSenha(6);
			filaAtendimento.removerSenha(10);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
