package com.alejandropadron.taller.numeros;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Numeros {

	public Integer tract(Integer f) {
		if (f > 1) {
			return f * tract(--f);
		}
		return f;
	}

	public Integer subTrack(Integer f) {
		if (f != null && f > 1) {
			Integer resultado = new Integer(f);
			while (f > 1) {
				resultado = resultado * --f;
			}
			return resultado;
		}
		return f;

	}

	public static void main(String[] args) throws IOException {
		Numeros numeros = new Numeros();
		// int r = numeros.tract(5);
		int r = numeros.subTrack(5);
		System.out.println(r);

		String zipname = "data.zip";
		File f = new File(".");
		System.out.println(f.getAbsolutePath());

		ZipFile zipFile = new ZipFile(zipname);
		Enumeration enumeration = zipFile.entries();
		while (enumeration.hasMoreElements()) {
			ZipEntry zipEntry = (ZipEntry) enumeration.nextElement();
			System.out.println(zipEntry.getExtra());
			System.out.println(zipEntry.getComment());
			// InputStream is = new FileInputStream();
			// System.out.println(zipEntry.);
			// System.out.println(zipEntry.getExtra());
		}
	}
}
