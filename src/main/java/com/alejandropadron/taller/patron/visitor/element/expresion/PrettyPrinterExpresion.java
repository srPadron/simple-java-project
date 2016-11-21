package com.alejandropadron.taller.patron.visitor.element.expresion;

import com.alejandropadron.taller.patron.visitor.VisitanteExpresion;

public class PrettyPrinterExpresion implements VisitanteExpresion {

	// visitar la variable en este caso es guardar en el resultado la variable
	// asociada al objeto... Observe que accedemos al estado interno del objeto
	// confiando en la visibilidad de paquete...
	@Override
	public void visitarVariable(Variable v) {
		_resultado = v._variable;
	}

	@Override
	public void visitarConstante(Constante c) {
		_resultado = String.valueOf(c._valor);
	}

	// Dado que el pretty-printer de una operación binaria es casi idéntica,
	// puedo factorizar parte del código con este método privado...
	private void visitarOpBinaria(OpBinaria op, String pOperacion) {
		op._izq.aceptar(this);
		String pIzq = obtenerResultado();

		op._der.aceptar(this);
		String pDer = obtenerResultado();

		_resultado = "(" + pIzq + pOperacion + pDer + ")";
	}

	// Por último la visita de la suma y la mult se resuelve mediante el método
	// privado que se acaba de mencionar...
	@Override
	public void visitarSuma(Suma s) {
		visitarOpBinaria(s, "+");
	}

	@Override
	public void visitarMult(Mult m) {
		visitarOpBinaria(m, "*");
	}

	// El resultado se almacena en un String privado. Se proporciona un método
	// de acceso público para que los clientes del visitante puedan acceder
	// al resultado de la visita
	public String obtenerResultado() {
		return _resultado;
	}

	private String _resultado;

}
