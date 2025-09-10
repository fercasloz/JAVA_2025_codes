package excepciones_I;

import javax.swing.*;

public class Fallos {

	public static void main(String[] args) {
		
		int [] miMatriz = new int [5];
		
		miMatriz[0] = 5;
		miMatriz[1] = 38;
		miMatriz[2] = -15;
		miMatriz[3] = 92;
		miMatriz[4] = 71;
		miMatriz[5] = 81; //una excepcion porque el array se sale de su definición

		for (int i=0; i<5; i++) {
			System.out.println("Posición " + i + " = " + miMatriz[i]);
		}
		
		//Petición datos personales 
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		System.out.println("Hola " + nombre + " Tienes " + edad + " años. " + " El programa terminó su ejecucción");
	}

}
