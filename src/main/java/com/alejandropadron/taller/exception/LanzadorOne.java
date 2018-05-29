package com.alejandropadron.taller.exception;

public class LanzadorOne {

	public int lanzar(boolean banana) throws CustomExcepcion {
		System.out.println("Ready to throw Exception");
		if (banana) {
			throw new CustomExcepcion("Manejable");
		}
		return 0;

	};

}
