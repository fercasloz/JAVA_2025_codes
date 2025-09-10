package escribiendo;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

	public static void main(String[] args) {
		
		Escibiendo accedeEscritura = new Escibiendo();
		
		accedeEscritura.escribir();

	}

}

class Escibiendo{
	public void escribir() {
		String frase = "Esto es una prueba de escritura";
		
		try {
			FileWriter escritura = new FileWriter("/Users/fernando/Desktop/0001 PROGRAMACION/04_pild_info_java/ejemplo_nuevo.txt");
			//Si pones la extensión ,true a continuacion de la ruta, se sobreescribe el archivo ¿Que pasaria si no existe el fichero?
			for(int i=0; i< frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}
}
