package colecciones_I;

import java.util.*;

public class PruebaLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String>personas=new LinkedList<String>();
		
		personas.add("Juan");
		personas.add("Ana");
		personas.add("Maria");
		personas.add("Laura");
		
		System.out.println(personas.size());
		
		ListIterator<String> it = personas.listIterator();
		
		it.next();
		
		it.add("Fer");
		
		for (String persona : personas) {
			System.out.println(persona);
		}

	}

}
