package colecciones_I;

import java.util.*;

public class PruebaTreeSet {

	public static void main(String[] args) {
		
		/*TreeSet<String> ordenaPersonas = new TreeSet<String>(); //implementa la interfaz comparable (compareTo)
		
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		
		for(String s: ordenaPersonas) { //orden por defecto, orden alfabético
			System.out.println(s);
		}*/
		
		
		Articulo primero = new Articulo(1, "Primer Articulo");
		Articulo segundo = new Articulo(200, "Segundo Articulo");
		Articulo tercer  = new Articulo(3, "Tercer Articulo");
		
		TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
		
		ordenaArticulos.add(tercer);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(Articulo art: ordenaArticulos) {
			System.out.println(art.getDescripcion());
		}
	
		System.out.println(" ");
		
		
		//Articulo comparadorArticulos = new Articulo();
		//TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulos); //en este treeSet los objetos se ordenaran segun lo que dicte el comparador que hemos pasado como argumento
	
		//ComparadorArticulos comparaArt = new ComparadorArticulos();
		
		TreeSet<Articulo> ordenaArticulos2 = new TreeSet <Articulo>(new Comparator<Articulo>() {
			public int compare(Articulo o1, Articulo o2) {
				String desc1 = o1.getDescripcion();
				String desc2 = o2.getDescripcion();
				return desc1.compareTo(desc2);
			}
		}); //Mediante clases internas anonimas, mejor método
		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercer);
		
		for(Articulo art: ordenaArticulos2) {
			System.out.println(art.getDescripcion());
		}
	}

}



class Articulo implements Comparable<Articulo>{

	
	public Articulo(int num, String desc) {
		numeroArticulo=num;
		descripcion=desc;
	}
	
	@Override
	public int compareTo(Articulo o) {
		return numeroArticulo - o.numeroArticulo; //si la resta es 0 es el mismo articulo
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	private int numeroArticulo;
	private String descripcion;
	
	
}

/*
class ComparadorArticulos implements Comparator<Articulo>{ //no obligamos a que la clase articulo implemente la interfaz comparator

	public ComparadorArticulos(){
		
	}
	
	@Override
	public int compare(Articulo o1, Articulo o2) {
		String desc1 = o1.getDescripcion();
		String desc2 = o2.getDescripcion();
		return desc1.compareTo(desc2);
	}
	
}
*/


