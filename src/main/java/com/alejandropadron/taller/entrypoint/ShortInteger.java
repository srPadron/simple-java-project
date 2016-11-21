package com.alejandropadron.taller.entrypoint;

/**
 * Hello world!
 * 
 */
public class ShortInteger {
	public static void main(String[] args) {
		Integer entero = new Integer("1234");
		System.out.println(Short.valueOf(entero.toString()));

		Integer entero2 = new Integer("12345");
		System.out.println(Short.valueOf(entero2.toString()));

		Integer entero3 = new Integer("32768");
		System.out.println(Short.valueOf(entero3.toString()));
		//
		// Integer entero4 = new Integer("12345678");
		// System.out.println(Short.valueOf(entero4.toString()));

		String tres = "3333";
		Short shortTres = new Short(tres);
		System.out.println(shortTres);

	}
}
