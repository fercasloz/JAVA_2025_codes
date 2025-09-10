package arrayList;

import java.io.*;

public class UsoArrayList {

	public static void main(String[] args) {
		
		ArrayList2 archivos = new ArrayList2(5);
		
		
		archivos.add("Juan");
		archivos.add("Fer");
		archivos.add("Maria");
		archivos.add("Ana");
		//archivos.add("Sandra");
		archivos.add(new File("ejemplo.txt"));
		

		String nombrePersona = (String)archivos.get(4);
		
		
		
		
		System.out.println();
		
		
	}

}
