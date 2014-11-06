package br.com.aceleradora.test.FizzBuzz;
import java.util.Random;

public class FizzBuzz {
	public boolean isMultiploTres(int i) {
		return i % 3 == 0;
	}

	public boolean isMultiploCinco(int i) {
		return i % 5 == 0;
	}

	public boolean isMultiploTresECinco(int i) {
		return (i % 3 == 0 && i % 5 == 0);
	}

	public String classificar(int i) {
		if (isMultiploTresECinco(i))
			return "FizzBuzz";

		if (isMultiploCinco(i))
			return "Buzz";

		if (isMultiploTres(i))
			return "Fizz";

		return Integer.toString(i);
	}

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		Random r = new Random();
		
		for (int i = 0; i < 101; i++) {			
			System.out.println(fb.classificar(r.nextInt(1001)));
		}
	}
}
