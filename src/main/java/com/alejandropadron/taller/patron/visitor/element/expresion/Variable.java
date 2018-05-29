package com.alejandropadron.taller.patron.visitor.element.expresion;

import com.alejandropadron.taller.patron.visitor.VisitanteExpresion;

public class Variable extends Expresion {

	@Override
	public void aceptar(VisitanteExpresion visitanteExpresion) {
		visitanteExpresion.visitarVariable(this);

	}

	public Variable(String variable) {
		_variable = variable;
	}

	String _variable;
}
