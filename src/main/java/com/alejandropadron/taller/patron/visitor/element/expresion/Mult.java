package com.alejandropadron.taller.patron.visitor.element.expresion;

import com.alejandropadron.taller.patron.visitor.VisitanteExpresion;

public class Mult extends OpBinaria {

	public Mult(Expresion izq, Expresion der) {
		super(izq, der);
	}

	@Override
	public void aceptar(VisitanteExpresion v) {
		v.visitarMult(this);
	}

}
