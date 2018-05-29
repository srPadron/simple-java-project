package com.alejandropadron.taller.patron.visitor;

import com.alejandropadron.taller.patron.visitor.element.expresion.Constante;
import com.alejandropadron.taller.patron.visitor.element.expresion.Expresion;
import com.alejandropadron.taller.patron.visitor.element.expresion.Mult;
import com.alejandropadron.taller.patron.visitor.element.expresion.PrettyPrinterExpresion;
import com.alejandropadron.taller.patron.visitor.element.expresion.Suma;
import com.alejandropadron.taller.patron.visitor.element.expresion.Variable;

public class Main {

	static public void main(String argv[]) {
		// Construcción de una expresión (a+5)*(b+1)
		Expresion expresion = new Mult(new Suma(new Variable("a"), new Constante(5)), new Suma(new Variable("b"),
				new Constante(1)));

		// Pretty-printing...
		PrettyPrinterExpresion pretty = new PrettyPrinterExpresion();
		expresion.aceptar(pretty);

		// Visualizacion de resultados
		System.out.println("Resultado: " + pretty.obtenerResultado());
	}

}
