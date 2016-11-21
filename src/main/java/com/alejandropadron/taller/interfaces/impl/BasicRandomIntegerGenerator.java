package com.alejandropadron.taller.interfaces.impl;

import java.util.Random;

import com.alejandropadron.taller.interfaces.RandomIntegerGenerator;

public class BasicRandomIntegerGenerator implements RandomIntegerGenerator {

	@Override
	public Integer randonNumber() {
		Random random = new Random();
		return random.nextInt();
	}

}
