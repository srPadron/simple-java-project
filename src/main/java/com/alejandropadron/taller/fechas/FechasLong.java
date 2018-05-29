package com.alejandropadron.taller.fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechasLong {

    private static final String formato = "yyyy-MM-dd";

    @SuppressWarnings("unused")
    private final static SimpleDateFormat formater = new SimpleDateFormat(formato);

    public static final String FORMATO_HORA_0_23 = "H";

    public static final SimpleDateFormat SDF_FORMATO_HORA_0_23 = new SimpleDateFormat(FORMATO_HORA_0_23);

    public static void main(final String[] args) throws ParseException {

	Date ayer = formater.parse("2017-10-15");

	System.out.println(ayer);
	System.out.println(ayer.getTime());

	Long fechaCreacion = new Long("1354268065000");
	Long fechaUltimaPublicacion = new Long("1368011980000");

	ayer.setTime(fechaCreacion);
	System.out.println(ayer); // Fri Nov 30 10:34:25 CET 2012

	ayer.setTime(fechaUltimaPublicacion);
	System.out.println(ayer); // Wed May 08 13:19:40 CEST 2013

	System.out.println("versionUltimaPublicada	13");
	fechaCreacion = new Long("1354268065000");
	ayer.setTime(fechaCreacion);
	System.out.println("fechaCreacion	:" + ayer);
	fechaCreacion = new Long("1368011980000");
	ayer.setTime(fechaCreacion);
	System.out.println("fechaUltimaPublicacion	:" + ayer);
	System.out.println("versionUltimaPublicada	12");
	fechaCreacion = new Long("1366303756000");
	ayer.setTime(fechaCreacion);
	System.out.println("fechaCreacion	:" + ayer);
	fechaCreacion = new Long("1366303786000");
	ayer.setTime(fechaCreacion);
	System.out.println("fechaUltimaPublicacion	:" + ayer);

	// final String dates = formater.format(new Date());
	// final Date hoy = formater.parse(dates);
	// final Calendar cal = new GregorianCalendar();
	// System.out.println(dates);
	// System.out.println(hoy);
	// System.out.println(cal.getTime());
	// cal.setTime(hoy);
	// System.out.println(cal.getTime());
	// Long l = new Long("1470133945415");
	// cal.setTime(new Date(l.longValue()));
	// System.out.println(cal.getTime());
	//
	// String area = "EXTERIOR";
	// System.out.println(areaValida(area));

	/*
	 * { comentario = ""; fechaAperturaDesde = 1508889600;
	 * fechaAperturaHasta = 1508889600; fechaMaterialEnTiendaDesde =
	 * 1508889600; fechaMaterialEnTiendaHasta = 1508889600; idPresupuesto =
	 * 43233; idTipoGestion = 1; lidCheck = ( ); origenMercancia =
	 * "ESPA\U00d1A"; }
	 */

	// Date date = new Date();
	// date.getTime();
	// Long l = new Long("1506410000000");
	// Long l = new Long("1506910000000");
	// date.setTime(l.longValue());
	// System.out.println(date.toString());

	// Date fecha = new Date();
	// Long l = new Long("1508889600");
	// fecha.setTime(l);
	// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	// String s = sdf.format(fecha);
	// System.out.println(fecha.toString());
	// fecha = sdf.parse(s);
	// System.out.println(fecha.toString());
	// java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());

	// System.out.println(fecha);
    }

    public static boolean areaValida(final String area) {
	final Integer hora = Integer.valueOf(SDF_FORMATO_HORA_0_23.format(new Date()));
	if (area.equalsIgnoreCase("EXTERIOR") && isHoraEntrada(hora)) {
	    return true;
	}
	if (area.equalsIgnoreCase("INTERIOR") && isHoraSalida(hora)) {
	    return true;
	}
	return false;
    }

    public static boolean isHoraEntrada(final Integer hora) {
	return hora.compareTo(0) >= 0 && hora.compareTo(11) <= 0;
    }

    public static boolean isHoraSalida(final Integer hora) {
	return hora.compareTo(12) >= 0 && hora.compareTo(23) <= 0;
    }
}
