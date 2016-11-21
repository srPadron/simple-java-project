package com.alejandropadron.taller.entrypoint;

import com.alejandropadron.taller.enumerados.AtributosAmbitoInsafe;

/**
 * Hello world!
 * 
 */
public class TestEnumedos {
	public static void main(final String[] args) {
		final String administrador = "language";

		if (AtributosAmbitoInsafe.LANGUAGE.getNombre().equals(administrador)) {
			System.out.println("IGUALES");
		}
	}
}
