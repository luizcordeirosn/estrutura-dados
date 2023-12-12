package upe.ecomp.ed.questao6;

public class ArvoreExpressao<T> {

	private NoArvoreExpressao<T> raiz;

	// Retornar a resolução da expressão!!!
	public String resolve(String expressao) throws Exception {

		Pilha<NoArvoreExpressao<Character>> operadores = new Pilha<NoArvoreExpressao<Character>>();
		Pilha<NoArvoreExpressao<Character>> numeros = new Pilha<NoArvoreExpressao<Character>>();
		NoArvoreExpressao<Character> aux;

		for (int i = 0; i < expressao.length(); i++) {
			if (expressao.charAt(i) == '+') {
				aux = new NoArvoreExpressao<Character>(expressao.charAt(i));
				operadores.push(aux);
			} else if (expressao.charAt(i) == '-') {
				aux = new NoArvoreExpressao<Character>(expressao.charAt(i));
				operadores.push(aux);
			} else if (expressao.charAt(i) == '*') {
				aux = new NoArvoreExpressao<Character>(expressao.charAt(i));
				operadores.push(aux);
			} else if (expressao.charAt(i) == '/') {
				aux = new NoArvoreExpressao<Character>(expressao.charAt(i));
				operadores.push(aux);
			} else if (expressao.charAt(i) == ')') {
				aux = new NoArvoreExpressao<Character>(operadores.top().getInfo());
				aux.setDir(numeros.top());
				aux.setEsq(numeros.top());
				numeros.push(aux);
			} else {
				aux = new NoArvoreExpressao<Character>(expressao.charAt(i));
				numeros.push(aux);
			}
		}

		return String.valueOf((resolveAux(numeros.top())));
	}

	// Calcular a expressão!!!
	public float resolveAux(NoArvoreExpressao<Character> p) {

		float resultado = 0;
		if (p != null) {

			if (p.isOperador()) {
				float vEsq = resolveAux(p.getEsq());
				float vDir = resolveAux(p.getDir());
				resultado = aplicarOperador(p.getInfo(), vEsq, vDir);
			} else {
				resultado = Character.getNumericValue(p.getInfo());
			}

		}
		return resultado;
	}

	private float aplicarOperador(char operador, float vEsq, float vDir) {
		float r = 0;
		switch (operador) {
		case '+':
			r = vEsq + vDir;
			break;
		case '-':
			r = vEsq - vDir;
			break;
		case '*':
			r = vEsq * vDir;
			break;
		case '/':
			r = vEsq / vDir;
			break;
		}
		return r;
	}

	public NoArvoreExpressao<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(NoArvoreExpressao<T> raiz) {
		this.raiz = raiz;
	}

}
