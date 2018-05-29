package com.alejandropadron.taller.entrypoint;

public class MainInstanceOff {

    public static void main(final String[] args) {
	metodoQueHaceInstanceOff((short) 1);
	metodoQueHaceInstanceOff(1);
	metodoQueHaceInstanceOff(new Short((short) 3));
	metodoQueHaceInstanceOff(new Integer(4));
	metodoQueHaceInstanceOff(new String("125"));
    }

    public static void metodoQueHaceInstanceOff(final Object o) {
	if (o instanceof Short) {
	    System.out.println("instanceof Short");
	} else if (o instanceof Integer) {
	    System.out.println("instanceof Integer");
	} else {
	    System.out.println("No sabemos que es");
	}
    }
}
