package com.alejandropadron.taller.exceptions;

public class Operaciones {

    private String operacion;

    public int principal() {

	if (this.operacion == null) {
	    throw new RuntimeException();
	}

	return new Integer(this.operacion).intValue();

    }
}
