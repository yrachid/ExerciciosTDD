package br.com.aceleradora.test.FizzBuzz;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class FizzBuzzTest {
	private FizzBuzz fb;

	@Before
	public void setUp() {
		fb = new FizzBuzz();
	}
	
	@Test
	public void quandoEuPassarUmMultiploDeTresEleMeRetornaraVerdade(){
		boolean result = fb.isMultiploTres(6);
		
		assertTrue(result);
	}
	
	@Test
	public void quandoEuPassarUmNumeroQueNaoSejaMultiploDeTresEleMeRetornaraFalso(){
		boolean result = fb.isMultiploTres(4);
		
		assertFalse(result);
	}
	
	@Test
	public void quandoEuPassarUmMultiploDeCincoEleMeRetornaraVerdade(){
		boolean result = fb.isMultiploCinco(10);
		
		assertTrue(result);
	}
	
	@Test
	public void quandoEuPassarUmNumeroQueNaoSejaMultiploDeCincoEleMeRetornaraFalso(){
		boolean result = fb.isMultiploCinco(8);
		
		assertFalse(result);
	}
	
	@Test
	public void retornaVerdadeQuandoEuPassarUmMultiploDeTresEDeCinco(){
		boolean result = fb.isMultiploTresECinco(15);
		
		assertTrue(result);
	}
	
	@Test
	public void quandoEuPassarUmNumeroQueNaoSejaMultiploDeTresECincoEleMeRetornaraFalso(){
		boolean result = fb.isMultiploTresECinco(7);
		
		assertFalse(result);
	}
	
	@Test
	public void retornaFizzQuandoMultiploDeTres(){
		String result = fb.classificar(3);
		
		assertEquals("Fizz", result);		
	}
	
	@Test
	public void retornaBuzzQuandoMultiploDeCinco(){
		String result = fb.classificar(5);
		
		assertEquals("Buzz", result);
	}
	
	@Test
	public void retornaFizzBuzzQuandoMultiploDeTresECinco(){
		String result = fb.classificar(15);
		
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void retornaNumeroQuandoNaoMultiploDeTresOuCinco(){
		String result = fb.classificar(7);
		
		assertEquals("7", result);
	}	
}
