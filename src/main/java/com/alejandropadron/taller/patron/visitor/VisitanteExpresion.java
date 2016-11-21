package com.alejandropadron.taller.patron.visitor;

import com.alejandropadron.taller.patron.visitor.element.expresion.Constante;
import com.alejandropadron.taller.patron.visitor.element.expresion.Mult;
import com.alejandropadron.taller.patron.visitor.element.expresion.Suma;
import com.alejandropadron.taller.patron.visitor.element.expresion.Variable;

public interface VisitanteExpresion {

	public void visitarSuma(Suma s);

	public void visitarMult(Mult m);

	public void visitarVariable(Variable v);

	public void visitarConstante(Constante c);
}
