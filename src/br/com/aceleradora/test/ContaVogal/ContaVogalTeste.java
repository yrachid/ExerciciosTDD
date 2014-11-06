package br.com.aceleradora.test.ContaVogal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContaVogalTeste {

	private ContaVogal contaVogal;
	private char testeChar;
	private String testeString;

	@Before
	public void setUp() {
		contaVogal = new ContaVogal();
		testeChar = 'a';
		testeString = "minion";
	}

	@Test
	public void retornaVerdadeSeCharForVogalOuFalsoSeNaoFor() {
		boolean result = contaVogal.eVogal(testeChar);		
		boolean resultErrado = contaVogal.eVogal('b');		

		assertTrue(result);
		assertFalse(resultErrado);
	}
	
	@Test
	public void retornaQuantidadeDeVogaisDeUmaString(){		
		int result = contaVogal.contaVogais(testeString);
		int resultErrado = contaVogal.contaVogais("css");

		assertEquals(3, result);
		assertNotEquals(2, result);		
		assertEquals(0, resultErrado);
	}
}
