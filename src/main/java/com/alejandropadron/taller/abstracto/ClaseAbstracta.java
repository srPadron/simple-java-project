package com.alejandropadron.taller.abstracto;

import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public abstract class ClaseAbstracta {

	final static Random r = new Random(new Date().getTime());

	public static Integer giveMeNumber() {
		return r.nextInt(99);

	}

	public static HashMap<String, String> giveMeNumbers(final int n) {
		final HashMap<String, String> res = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			final String s = giveMeNumber().toString();
			res.put(s, s);
		}
		return res;

	}
}
