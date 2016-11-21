package com.alejandropadron.taller.entrypoint;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.alejandropadron.taller.abstracto.ClaseAbstracta;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(final String[] args) {
		final Map<String, String> mapa = ClaseAbstracta.giveMeNumbers(4);
		for (final Iterator<Entry<String, String>> iterator = mapa.entrySet().iterator(); iterator.hasNext();) {
			final Entry<String, String> type = iterator.next();
			System.out.println("Clave = " + type.getKey() + " Valor = " + type.getValue());
		}

		String hola = "";
		if ("".equals(hola)) {
			System.out.println("TRUE");
		}
		hola = "  ";
		if ("".equals(hola)) {
			System.out.println("TRUE");
		}
		hola = null;
		if ("".equals(hola)) {
			System.out.println("TRUE");
		}

		hola = "";
		if (hola.equals("")) {
			System.out.println("TRUE");
		}
		hola = "  ";
		if (hola.equals("")) {
			System.out.println("TRUE");
		}
		hola = null;
		if (hola.equals("")) {
			System.out.println("TRUE");
		}

	}

}
