package com.alejandropadron.taller.entrypoint;

public class StringRegexp {

	public static void main(final String[] args) {

		// final String cadena = new
		// String("<script>(function(){alert('KO')});</script>");
		final String cadena = new String("function p$apapaap d lp");

		System.out.println(cadena.matches("^.*[\'\"<>,;%*+/=^\\|]+.*$"));

	}

}
