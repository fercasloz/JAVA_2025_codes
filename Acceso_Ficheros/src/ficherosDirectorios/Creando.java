package ficherosDirectorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {

		File ruta=new File("/Users/fernando/Desktop/0001 PROGRAMACION/04_pild_info_java/001archivos/java_serializado/pruebaTexto.txt");
		
		//ruta.mkdir(); //para crear una nueva carpeta
		
		String archivoDestino = ruta.getAbsolutePath(); //hemos almacenado la ruta en la variables
		
		try {
			ruta.createNewFile();
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		Escribiendo accedeEs= new Escribiendo();
		accedeEs.escribir(archivoDestino);
		
	}

}

class Escribiendo{
	
	public void escribir(String rutaArchivo) {
		String frase = "Esto es un ejemplo, espero que salga";
		
		try {
			FileWriter escritura = new FileWriter(rutaArchivo);
			for(int i=0; i<frase.length(); i++) {
				escritura.write(frase.charAt(i)); //escribir caracter a caracter
			}
			escritura.close();
		}catch(IOException e) {
			System.out.print(e.getMessage());
		}
		
	}
	
}
