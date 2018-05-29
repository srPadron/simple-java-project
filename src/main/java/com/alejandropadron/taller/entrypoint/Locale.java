package com.alejandropadron.taller.entrypoint;

public class Locale {

    public static void main(final String[] args) {
	java.util.Locale l = new java.util.Locale("es");
	System.out.println(l.toString());
	System.out.println(l.getCountry());
	System.out.println(l.getLanguage());
    }

}
