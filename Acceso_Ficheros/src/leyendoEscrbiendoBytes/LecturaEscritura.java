package leyendoEscrbiendoBytes;

import java.io.*;

public class LecturaEscritura {

	public static void main(String[] args) {
		
		int contador = 0;
		
		int datosEntrada[]=new int[55048];
		
		try {
			FileInputStream archivoLectura = new FileInputStream("/Users/fernando/Desktop/0001 PROGRAMACION/04_pild_info_java/001archivos/imagen-vectorial.jpg");
			boolean finalAr=false;
			while(!finalAr) { //!finalAr mientras sea false
				int byteEntrada=archivoLectura.read();
				
				if(byteEntrada!=-1) {
					datosEntrada[contador]=byteEntrada;
				}
				
				if(byteEntrada==-1) {
					finalAr = true;
				}
				
				System.out.println(datosEntrada[contador]);
				contador ++;
			}
			archivoLectura.close();
		}catch(IOException e) {
			System.out.println("Error al acceder a la imagen \n"+e.getMessage());
		}
		
		System.out.println(contador);
		
		creaFichero(datosEntrada);

	}
	
	static void creaFichero(int datosNuevoFichero[]) {
		
		try {
			
			FileOutputStream ficheroNuevo = new FileOutputStream("/Users/fernando/Desktop/0001 PROGRAMACION/04_pild_info_java/001archivos/imagen-vectorial_copia.jpg");
			
			for(int i = 0; i<datosNuevoFichero.length; i++) {
				ficheroNuevo.write(datosNuevoFichero[i]);
			}
			
			ficheroNuevo.close();
			
		}catch(IOException e) {
			System.out.println("Error al crear la imagen \n"+e.getMessage());
		}
		
	}

}
