package ficherosDirectorios;

import java.io.*;

public class PruebasRutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File archivo = new File("ejemplo_archivo");
		
		System.out.println(archivo.getAbsolutePath());
		
		System.out.println(archivo.exists());  // devuelve true o false depende de si existe o no
		
	}

}
