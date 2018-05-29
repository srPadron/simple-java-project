package com.alejandropadron.taller.fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Horas {

    private static final String formato = "yyyy-MM-dd HH:mm:ss.SSS";

    private final static SimpleDateFormat formater = new SimpleDateFormat(formato);

    public static void main(final String[] args) throws ParseException {

	// final String dates = formater.format(new Date());
	// final Date hoy = formater.parse(dates);
	// hoy.getTime();
	// final Calendar cal = new GregorianCalendar();
	// System.out.println(dates);
	// System.out.println(hoy);
	// System.out.println(cal.getTime());
	// cal.setTime(hoy);
	// System.out.println(cal.getTime());
	// Long l = new Long("1487778567500");
	// cal.setTime(new Date(l.longValue()));
	// System.out.println(cal.getTime());
	// System.out.println("-------------------------");
	// Long l0 = new Long("1487778566249");
	// Date d0 = new Date(l0);
	// System.out.println(formater.format(d0));
	// l0 = new Long("1487778567500");
	// d0 = new Date(l0);
	// System.out.println(formater.format(d0));

	final String date5 = "2017-02-24T12:05:05.383Z";
	final String formato5 = "yyyy-MM-dd HH:mm:ss.SSS";
	SimpleDateFormat formater5 = new SimpleDateFormat(formato5);
	// try {
	// formater5.parse(date5);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// final String FORMATO_FECHA_BUCH_ZK = "yyyy-MM-dd HH:mm:ss.SSS";
	// formater5 = new SimpleDateFormat(FORMATO_FECHA_BUCH_ZK);
	// try {
	// formater5.parse(date5);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// final String FORMATO_FECHA_BUCH_ZK_2 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
	// formater5 = new SimpleDateFormat(FORMATO_FECHA_BUCH_ZK_2);
	// try {
	// formater5.parse(date5);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }

	final String FORMATO_FECHA_BUCH_ZK_3 = "yyyy-MM-dd'T'HH:mm:ss.SSS";
	formater5 = new SimpleDateFormat(FORMATO_FECHA_BUCH_ZK_3);
	Date fechasss = null;
	try {
	    fechasss = formater5.parse(date5);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	System.out.println(fechasss);
    }
}
