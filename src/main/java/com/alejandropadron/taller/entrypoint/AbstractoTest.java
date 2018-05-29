package com.alejandropadron.taller.entrypoint;

import com.alejandropadron.taller.abstracto.ClaseAbstracta;

public class AbstractoTest {

	public static void main(final String[] args) {
		for (int i = 0; i < 24; i++) {
			System.out.println(ClaseAbstracta.giveMeNumber());
		}
	}
}
