package excepciones_I;

import java.io.IOException;
import java.util.*;

public class Entrada_datos {

	public static void main(String[] args) {
		
		System.out.println("¿Qué deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada = new Scanner (System.in);
		
		int decision = entrada.nextInt();
		
		if(decision==1) {
			
			try {
					pedirDatos();
					
			}catch(Exception e) {  //como IOException hereda de exception podemos capturar exception
				
				System.out.println("No has introducido bien la edad");
			}
			
		}else {
			
			System.out.println("Adios");
			System.exit(0);
			
		}
		
		entrada.close();
		
	}
	
	static void pedirDatos() throws IOException{
		
		//Si la excepcion que lanza nuestro metodo hereda de IOException nos obliga a capturar la excepcion
	
	//try {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce tu nombre, por favor");
			String nombreUsuario = entrada.nextLine();
	
			System.out.println("Introduce tu edad, por favor");
			int edad = entrada.nextInt();
	
			System.out.println("Hola " + nombreUsuario + 
					". El año que viene tendrás " + (edad+1) + " años");
	
			entrada.close();
			
	//	}catch(Exception e) {
	//		System.out.println("Daton introducido no válido"); }
			
			System.out.println("Hemos terminado");
		
	}

}








