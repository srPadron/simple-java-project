package com.alejandropadron.taller.entrypoint;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Hello world!
 * 
 */
public class ContentTypeTest {
	public static void main(String[] args) {

		byte[] contenido = new byte[] { 1, 2, 3, 4 };

		if (contenido != null) {
			FileInputStream fileInputStream = null;

			// File file = new File("C:\\contentTypeTemp.txt");
			File file = new File("");

			try {
				// convert file into array of bytes
				// fileInputStream = new FileInputStream(file);
				// fileInputStream.read(contenido);
				// fileInputStream.close();

				// convert array of bytes into file
				FileOutputStream fileOuputStream = new FileOutputStream(file);
				fileOuputStream.write(contenido);
				fileOuputStream.close();

				String type = null;
				URL u = new URL(file.getCanonicalPath());
				URLConnection uc = null;
				uc = u.openConnection();
				type = uc.getContentType();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
