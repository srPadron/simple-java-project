package com.alejandropadron.taller.patron.visitor.element.expresion;

import com.alejandropadron.taller.patron.visitor.VisitanteExpresion;

/*
 * Esta es la superclase de una jerarquía que permite representar expresiones 
 * aritméticas simples y sobre la que deseamos definir visitantes. 
 */
public abstract class Expresion {

	abstract public void aceptar(VisitanteExpresion visitanteExpresion);

}
