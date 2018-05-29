package com.alejandropadron.taller.enumerados;

public enum Estado {

    ROJO(1),
    AMARILLO(2),
    VERDE(3);

    private final int idEstado;

    private Estado(final int idEstado) {
	this.idEstado = idEstado;
    }

    public int getIdEstado() {
	return this.idEstado;
    }

    public static Estado getEstado(final int idEstado) {
	for (Estado estado : Estado.values()) {
	    if (estado.getIdEstado() == idEstado) {
		return estado;
	    }
	}
	return null;
    }

}