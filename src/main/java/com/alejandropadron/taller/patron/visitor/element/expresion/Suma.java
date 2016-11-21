package com.alejandropadron.taller.patron.visitor.element.expresion;

import com.alejandropadron.taller.patron.visitor.VisitanteExpresion;

public class Suma extends OpBinaria {

	public Suma(Expresion izq, Expresion der) {
		super(izq, der);
	}

	@Override
	public void aceptar(VisitanteExpresion v) {
		v.visitarSuma(this);
	}

}
