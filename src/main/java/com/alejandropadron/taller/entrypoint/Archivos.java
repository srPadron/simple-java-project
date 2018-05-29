package com.alejandropadron.taller.entrypoint;

import java.io.File;

public class Archivos {

	public static void main(String[] args) {
		File f = new File("src/main/resources");
		System.out.println("is File?: " + f.isFile());
		System.out.println("is Direc?: " + f.isDirectory());

		for (File fd : f.listFiles()) {
			System.out.println("---> " + fd.toString() + " | Path" + fd.getPath() + " |Parent" + fd.getParent());
		}

	}
}
