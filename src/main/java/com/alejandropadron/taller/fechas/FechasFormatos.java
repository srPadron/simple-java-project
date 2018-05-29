package com.alejandropadron.taller.fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechasFormatos {

    public static final String FORMATO_FECHA_BUCH_ZK = "yyyy-MM-dd HH:mm:ss.SSS";

    public static final SimpleDateFormat SDF_FORMATO_FECHA_BUCH_ZK = new SimpleDateFormat(FORMATO_FECHA_BUCH_ZK);

    public static void main(final String[] args) throws ParseException {

	Date d = new Date();
	System.out.println("New Date =  " + d.toString());
	final String momentoString = SDF_FORMATO_FECHA_BUCH_ZK.format(d);
	System.out.println("String momentoString =  " + momentoString);
	Date momentoDate;
	try {
	    momentoDate = SDF_FORMATO_FECHA_BUCH_ZK.parse(momentoString);
	    System.out.println("Date momentoDate =  " + momentoDate);
	} catch (ParseException e) {
	    return;
	}
	System.out.println();
    }
}