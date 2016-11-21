package com.alejandropadron.taller.interfaces.entrypoint;

import com.alejandropadron.taller.interfaces.RandomIntegerGenerator;
import com.alejandropadron.taller.interfaces.impl.BasicRandomIntegerGenerator;

public class RandomNumberMachine {

	public static void main(String[] args) {

		RandomIntegerGenerator randomNumbre = new BasicRandomIntegerGenerator();

		System.out.println("Random number: " + randomNumbre.randonNumber());

	}

}
