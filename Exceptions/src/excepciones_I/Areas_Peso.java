package excepciones_I;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas_Peso {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
		
		try {
		
			figura=entrada.nextInt(); //almacenar un entero con la clase scannner
		
			//entrada.close();
		
		}catch(Exception e) {
			System.out.println("Ha ocurrido un error: " + e.getClass());
		}finally { //se va a ejecutar siempre
			entrada.close();
		}
		
		switch(figura) {
		
			case 1:
				
				int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
				System.out.println(Math.pow(lado, 2));
				break;
				
			case 2:
				
				int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
				int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
				System.out.println(base*altura);
				break;
			
			case 3:
				
				int baseTriangulo=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triangulo"));
				int alturaTriangulo=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
				System.out.println((baseTriangulo*alturaTriangulo)/2);
				break;
			
			case 4:
				
				int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));
				System.out.println(Math.PI*(Math.pow(radio, 2)));
				
			default:
				System.out.println("La opcion elegica no es correcta");
				
		}

//----------------------------------------------------------------------------------------------------------------------------
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		System.out.println("Si eres hombre tu peso ideal es: " + (altura -110) + " kg");
		System.out.println("Si eres mujer tu peso ideal es: " + (altura -120) + " kg");
		
	}
	
		static int figura;  //tipo entero

}
