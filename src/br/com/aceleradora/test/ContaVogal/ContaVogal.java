package br.com.aceleradora.test.ContaVogal;

public class ContaVogal {

	public boolean eVogal(char teste) {

		if (teste == 'a')
			return true;
		if (teste == 'e')
			return true;
		if (teste == 'i')
			return true;
		if (teste == 'o')
			return true;
		if (teste == 'u')
			return true;
		return false;
	}

	public int contaVogais(String testeString) {
		testeString = testeString.toLowerCase();
		int contador = 0;
		for (int i = 0; i < testeString.length(); i++) {
			if (eVogal(testeString.charAt(i)))
				contador++;
		}

		return contador;
	}

}
