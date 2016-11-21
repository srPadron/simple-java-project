package com.alejandropadron.taller.patron.visitor.element.expresion;

import com.alejandropadron.taller.patron.visitor.VisitanteExpresion;

public class Constante extends Expresion {

	public Constante(int valor) {
		_valor = valor;
	}

	@Override
	public void aceptar(VisitanteExpresion v) {
		v.visitarConstante(this);
	}

	int _valor;

}
