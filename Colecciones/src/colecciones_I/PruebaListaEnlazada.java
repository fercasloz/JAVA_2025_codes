package colecciones_I;

import java.util.*;

public class PruebaListaEnlazada {

	public static void main(String[] args) {
		
		LinkedList<String>paises=new LinkedList<String>();
		paises.add("España");
		paises.add("Colombia");
		paises.add("México");
		paises.add("Perú");
		
		LinkedList<String>capitales=new LinkedList<String>();
		capitales.add("Madrid");
		capitales.add("Bogotá");
		capitales.add("DF");
		capitales.add("Lima");
		
		//Comprobación de que se guardan elementos
		System.out.println(paises);
		System.out.println(capitales);
		
		//Añadir elementos de capitales a paises en el orden correspondiente pais-capital
		ListIterator<String> iterA = paises.listIterator();
		ListIterator<String> iterB = capitales.listIterator();
		
		while(iterB.hasNext()) {
			if(iterA.hasNext()) {
				iterA.next(); // salta a la siguiente posicion de paises
			}
			iterA.add(iterB.next()); // en la siguiente posicion de paises añade la primera capital (iterB esta en el inicio)	
		}
		
		System.out.println(paises); // paises con sus capitales (pais - capital)
		
		//Eliminiar posiciones pares de paises
		iterB=capitales.listIterator(); //hacemos que vuelva a su pos original
		
		while(iterB.hasNext()) {
			iterB.next();
			if(iterB.hasNext()) {
				iterB.next();
				iterB.remove(); //mira dos veces si hay un elemento siguiente (saltas de 2 en dos) --> pares
			}
		}
		
		System.out.println(capitales);
		
		//Vamos a borrar dentro de la lista de paises las capitales
		
		paises.removeAll(capitales);
		
		System.out.println(paises);
		
	}

}



