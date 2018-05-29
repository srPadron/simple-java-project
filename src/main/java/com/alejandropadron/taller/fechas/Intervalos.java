package com.alejandropadron.taller.fechas;

import java.util.Calendar;

public class Intervalos {

    private static Calendar lastUpdate = Calendar.getInstance();

    private static int updateIntervalMinutes = 1;

    public static void main(final String[] args) {

	while (!isOutDate()) {
	    System.out.println("is UPDATE " + lastUpdate.get(Calendar.MINUTE));
	}
	System.out.println("is out Date " + lastUpdate.get(Calendar.MINUTE));

    }

    private static boolean isOutDate() {
	// lastUpdate.set(2017, 03, 18, 18, 50, 00);
	System.out.println("lastUpdate = " + lastUpdate.getTime());
	Calendar lastUpdatePlusInterval = Calendar.getInstance();
	lastUpdatePlusInterval.setTime(lastUpdate.getTime());
	lastUpdatePlusInterval.add(Calendar.MINUTE, updateIntervalMinutes);
	System.out.println("lastUpdate + 1min = " + lastUpdatePlusInterval.getTime());
	Calendar now = Calendar.getInstance();
	System.out.println("now = " + now.getTime());

	// if (now.getTimeInMillis() > lastUpdatePlusInterval.getTimeInMillis())
	// {
	if (now.after(lastUpdatePlusInterval)) {
	    return true;
	}
	return false;
    }

}
