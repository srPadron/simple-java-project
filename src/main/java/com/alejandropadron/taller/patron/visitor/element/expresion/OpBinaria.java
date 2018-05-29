package com.alejandropadron.taller.patron.visitor.element.expresion;


public abstract class OpBinaria extends Expresion {

	public OpBinaria(Expresion izq, Expresion der) {
		_izq = izq;
		_der = der;
	}

	Expresion _izq, _der;

}
