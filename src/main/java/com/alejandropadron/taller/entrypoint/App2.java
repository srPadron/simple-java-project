package com.alejandropadron.taller.entrypoint;

import com.alejandropadron.taller.pojo.documento.Documento;
import com.alejandropadron.taller.pojo.documento.DocumentoPRLCarta;
import com.alejandropadron.taller.pojo.documento.DocumentoPRLCertificado;

/**
 * Hello world!
 * 
 */
public class App2 {
	public static void main(String[] args) {
		Documento documento = new DocumentoPRLCarta();
		Class<? extends Documento> clazz = documento.getClass();

		String nombreCanonico = clazz.getCanonicalName();
		System.out.println(nombreCanonico);

		if (documento instanceof DocumentoPRLCarta) {
			System.out.println(DocumentoPRLCarta.class);
		}
		if (documento instanceof DocumentoPRLCertificado) {
			System.out.println(DocumentoPRLCertificado.class);
		}

		Class<? extends Documento> fr = documento.getClass();
		// Object o = fr.cast(DocumentoPRLCertificado.class);
		// System.out.println(o.getClass());
		Object o2 = fr.cast(DocumentoPRLCarta.class);
		System.out.println(o2.getClass());
	}
}
