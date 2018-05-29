package com.alejandropadron.taller.entrypoint;

import java.util.ArrayList;
import java.util.List;

public class CollectionGame2 {

	public static void main(final String[] args) {

		final List<Integer> losQueVanHaFirmar = new ArrayList<Integer>();
		losQueVanHaFirmar.addAll(elQueRetorna(1));
		losQueVanHaFirmar.addAll(elQueRetorna(2));
		losQueVanHaFirmar.addAll(elQueRetorna(3));
	}

	private static List<Integer> elQueRetorna(final int caso) {

		List<Integer> nuevaYVacia = null;
		switch (caso) {
			case 1:
				final List<Integer> df = new ArrayList<Integer>();
				df.add(69);
				df.add(70);
				nuevaYVacia = df;
				break;
			case 2:
				nuevaYVacia = new ArrayList<Integer>();
				break;
			case 3:
				nuevaYVacia = null;
				break;

			default:
				break;
		}
		return nuevaYVacia;

	}

}
