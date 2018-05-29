package com.alejandropadron.taller.entrypoint;

import java.util.Date;
import java.util.Random;

/**
 * Hello world!
 * 
 */
public class ShortInteger {

    final static Short SHORT_UNO = 1;

    public static void main(final String[] args) {

	Long tipo = new Long(0);
	if (tipo > 0) {
	    System.out.println("MAyor que cero");
	}

	if (tipo == 1) {
	    System.out.println("Iguasl a uno");
	}

	Integer entero = new Integer("1234");
	System.out.println(Short.valueOf(entero.toString()));

	Integer entero2 = new Integer("12345");
	System.out.println(Short.valueOf(entero2.toString()));

	Integer entero3 = new Integer("32768");
	// System.out.println(Short.valueOf(entero3.toString()));
	//
	// Integer entero4 = new Integer("12345678");
	// System.out.println(Short.valueOf(entero4.toString()));

	String tres = "3333";
	Short shortTres = new Short(tres);
	System.out.println(shortTres);

	Short nulo = determinaShort();

	for (int i = 0; i < 50; i++) {
	    if (SHORT_UNO.equals(nulo)) {
		System.out.println("1er Compare");
	    }
	    if (nulo.equals(SHORT_UNO)) {
		System.out.println("2do Compare");
	    }
	}
    }

    private static Short determinaShort() {
	Random r = new Random(new Date().getTime());
	int u = r.nextInt();

	return u >= 0 && u <= 100 ? (short) u : null;
    }
}
