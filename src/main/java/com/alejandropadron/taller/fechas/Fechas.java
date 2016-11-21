package com.alejandropadron.taller.fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fechas {

	private static final String formato = "yyyy-MM-dd";

	private final static SimpleDateFormat formater = new SimpleDateFormat(formato);

	public static final String FORMATO_HORA_0_23 = "H";

	public static final SimpleDateFormat SDF_FORMATO_HORA_0_23 = new SimpleDateFormat(FORMATO_HORA_0_23);

	public static void main(final String[] args) throws ParseException {
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

		String area = "EXTERIOR";
		System.out.println(areaValida(area));

		Date date = new Date();
		Long l = new Long("1476568800000");
		date.setTime(l.longValue());
		System.out.println(date.toString());
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

	public static boolean isHoraEntrada(Integer hora) {
		return (hora.compareTo(0) >= 0 && hora.compareTo(11) <= 0);
	}

	public static boolean isHoraSalida(Integer hora) {
		return (hora.compareTo(12) >= 0 && hora.compareTo(23) <= 0);
	}
}
