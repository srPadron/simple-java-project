package com.alejandropadron.taller.fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Horas {

	private static final String formato = "yyyy-MM-dd";

	private final static SimpleDateFormat formater = new SimpleDateFormat(formato);

	public static void main(final String[] args) throws ParseException {
		final String dates = formater.format(new Date());
		final Date hoy = formater.parse(dates);
		final Calendar cal = new GregorianCalendar();
		System.out.println(dates);
		System.out.println(hoy);
		System.out.println(cal.getTime());
		cal.setTime(hoy);
		System.out.println(cal.getTime());
		Long l = new Long("1470133945415");
		cal.setTime(new Date(l.longValue()));
		System.out.println(cal.getTime());
	}
}
