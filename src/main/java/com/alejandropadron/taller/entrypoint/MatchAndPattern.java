package com.alejandropadron.taller.entrypoint;

import java.util.regex.Pattern;

public class MatchAndPattern {

    final static Pattern AREA_EXTERIOR_BLANCO_PATTERN = Pattern.compile("^\\s*$");

    public static void main(final String[] args) {
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("  ").matches());
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("\t").matches());
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("	").matches());
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("").matches());
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("\t\t").matches());
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("\n").matches());
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("").matches());

	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("  d  ").matches());
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("  d").matches());
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("d  d").matches());
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("d  ").matches());
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("dd").matches());
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("d").matches());

	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("\td").matches());
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("d").matches());
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("d").matches());
	System.out.println(AREA_EXTERIOR_BLANCO_PATTERN.matcher("d").matches());
    }

}
