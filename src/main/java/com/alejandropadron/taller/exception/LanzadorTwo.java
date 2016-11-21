package com.alejandropadron.taller.exception;

public class LanzadorTwo {

	private final LanzadorOne lanzadorOne;

	public LanzadorTwo() {
		super();
		this.lanzadorOne = new LanzadorOne();
	}

	public int lanzar(boolean banana) {
		System.out.println("Ready to throw Exception");
		if (banana) {
			lanzadorOne.lanzar(banana);
		}
		return 0;

	};

}
