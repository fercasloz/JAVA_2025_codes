package ficherosDirectorios;

import java.io.*;

public class AccesoFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
		File ruta=new File("/Users/fernando/Desktop/0001 PROGRAMACION/04_pild_info_java/001archivos/java_serializado");
		
		System.out.println(ruta.getAbsolutePath());
		
		String[]nombreArchivos = ruta.list();
		
		for(String archivo : nombreArchivos) {
			System.out.println(archivo);
			
			File f = new File(ruta.getAbsolutePath(),archivo);
			
			if(f.isDirectory()) {
				String[] archivosSubcarpeta = f.list();
				for(String archivo1: archivosSubcarpeta) {
					System.out.println(archivo1);
				}
			}
		}
		}catch(Exception e) {
		System.out.println(e.getMessage());
		}
	}

}
