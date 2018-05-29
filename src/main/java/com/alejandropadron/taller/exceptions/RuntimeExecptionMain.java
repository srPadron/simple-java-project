package com.alejandropadron.taller.exceptions;

public class RuntimeExecptionMain {

    public static void main(final String[] args) {

	Operaciones o = new Operaciones();

	try {
	    o.principal();
	} catch (Exception e) {
	    System.out.println("Capturado");
	}

    };

}
