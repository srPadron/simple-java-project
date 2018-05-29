package com.alejandropadron.taller.enumerados;

public class MainEstadoHandler {

    public static void main(final String[] args) {
	Estado e = Estado.getEstado(1);
	System.out.println(e);
	e = Estado.getEstado(2);
	System.out.println(e);
	e = Estado.getEstado(3);
	System.out.println(e);
	e = Estado.getEstado(4);
	if (e == null) {
	    System.out.println("I think so ;-)");
	} else {
	    System.out.println("Surprise :-(");
	}

    }

}
