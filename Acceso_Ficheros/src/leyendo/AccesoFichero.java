package leyendo;

import java.io.*;

public class AccesoFichero {

	public static void main(String[] args) {
		
		leerFichero accediendo = new leerFichero();
		
		accediendo.lee(); 
		
	}

}


class leerFichero{
	
	public void lee() {
		
		try {
			
			 entrada = new FileReader("/Users/fernando/Desktop/0001 PROGRAMACION/04_pild_info_java/ejemplo.txt");
			 
			 BufferedReader mibuffer = new BufferedReader(entrada);  //mas eficiente
			
			//int c = 0; 
			 
			 String linea = "";
			
			while(linea!=null) { //mientras while no haya llegado al final de los datos del fichero txt
				
				//c=entrada.read();
				
				//char letra = (char)c; //casting para que aparezcan las letras y sea legible
				
				linea = mibuffer.readLine(); //almacena en la variable linea la primera linea
				
				if(linea!=null)
					System.out.println(linea);
				
			}
			
			//entrada.close();
			
		} catch (IOException e) {
			
			System.out.println("No se ha encontrado el archivo \n" + e.getMessage());
			
		}finally {
			try {
				entrada.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		
		}
	
		FileReader entrada;
	}
