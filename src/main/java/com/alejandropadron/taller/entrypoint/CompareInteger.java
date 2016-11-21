package com.alejandropadron.taller.entrypoint;

/**
 * Hello world!
 * 
 */
public class CompareInteger {
	public static void main(String[] args) {
		final Integer RESULTADO_OK = 0;

		System.out.println("RESULTADO_OK = " + RESULTADO_OK);

		Integer entero1 = new Integer("1");

		System.out.println("entero1 = " + entero1);

		if (entero1 < 0) {
			System.out.println("entero1 menor que cero");
		}

		if (entero1 == 0) {
			System.out.println("entero1 igual que cero");
		}

		if (entero1 > 0) {
			System.out.println("entero1 mayor que cero");
		}

	}
}
