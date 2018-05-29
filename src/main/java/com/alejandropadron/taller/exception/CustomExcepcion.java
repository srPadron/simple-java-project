package com.alejandropadron.taller.exception;

public class CustomExcepcion extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8234784675812229549L;

	public CustomExcepcion(String mensaje) {
		super(mensaje);
	}
}
