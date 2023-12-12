package br.com.poli.conversaoBase;

public class Main {

	public static void main(String[] args) {
		
		//Luiz Cordeiro e Abner Rodrigues!!!
		
		Conversao teste = new Conversao();
		
		//Quando for digitar, digite com carinho!!!
		//Caso o primeiro dígito for 1, considere como bit de sinal - Ex: 11 = -1!!!
		//Se mesmo assim queira representar o número, coloque um dígito a mais na esquerda para bit de sinal!!!
		try {
			System.out.println(teste.converterBase("420", 10, 16));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Bit do sinal é o dígito mais significativo: 0 para números POSITIVOS e 1 para NEGATIVOS");
	}
}


