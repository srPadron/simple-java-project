package com.alejandropadron.taller.entrypoint;

import com.alejandropadron.taller.exception.LanzadorTwo;

/**
 * Hello world!
 * 
 */
public class Exeption {
	public static void main(String[] args) {
		LanzadorTwo lanzadorTwo = new LanzadorTwo();

		try {
			lanzadorTwo.lanzar(true);
		} catch (Exception e) {
			System.out.println("Capturado " + e);
			return;
		}
		System.out.println("No capturado");

	}

}
