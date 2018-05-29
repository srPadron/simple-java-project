package com.alejandropadron.taller.enumerados;

import java.util.Arrays;

public enum AtributosAmbitoInsafe {
	IDIOMA("idioma"),

	LANGUAGE("language"),

	COUNTRY("country"),

	PAIS_DEFAULT("pais.default"),

	PAISES("paises"),

	SOCIEDADES("sociedades"),

	REGIONES("regiones"),

	PROVINCIAS("provincias"),

	LOCALIZACIONES("localizaciones"),

	TIPOS_DOCUMENTO("tipos.documento");

	private String nombre;

	AtributosAmbitoInsafe(final String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		System.out.println(Arrays.toString(AtributosAmbitoInsafe.values()));
		return this.nombre;
	}
}
