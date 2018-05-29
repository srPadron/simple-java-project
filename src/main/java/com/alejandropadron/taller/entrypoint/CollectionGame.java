package com.alejandropadron.taller.entrypoint;

import java.util.ArrayList;
import java.util.List;

public class CollectionGame {

	public static void main(final String[] args) {

		final List<Integer> losQueVanHaFirmar = calcularFirmantesActuales();

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for (final Integer firma : losQueVanHaFirmar) {
			System.out.println(firma);
		}
	}

	private static List<Integer> calcularFirmantesActuales() {

		// Random random = new Random();
		// random.nextInt();

		final Integer uno = new Integer(1);
		final Integer dos = new Integer(2);
		final Integer tres = new Integer(3);
		final Integer i = new Integer("1");
		final Integer iii = new Integer("3");

		final List<Integer> losQueHanFirmado = new ArrayList<Integer>();
		losQueHanFirmado.add(i);
		losQueHanFirmado.add(iii);

		final List<Integer> losQueVanHaFirmar = new ArrayList<Integer>();
		losQueVanHaFirmar.add(uno);
		losQueVanHaFirmar.add(dos);
		losQueVanHaFirmar.add(tres);

		for (final Integer firmado : losQueHanFirmado) {
			if (losQueVanHaFirmar.contains(firmado)) {
				losQueVanHaFirmar.remove(firmado);
			}
		}

		for (final Integer firma : losQueVanHaFirmar) {
			System.out.println(firma);
		}

		return losQueVanHaFirmar;
	}

}
