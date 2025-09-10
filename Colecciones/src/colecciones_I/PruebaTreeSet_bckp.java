package colecciones_I;

import java.util.*;

public class PruebaTreeSet_bckp {

	public static void main(String[] args) {
		
		/*TreeSet<String> ordenaPersonas = new TreeSet<String>(); //implementa la interfaz comparable (compareTo)
		
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		
		for(String s: ordenaPersonas) { //orden por defecto, orden alfabético
			System.out.println(s);
		}*/
		
		
		Articulo_bckp primero = new Articulo_bckp(1, "Primer Articulo");
		Articulo_bckp segundo = new Articulo_bckp(200, "Segundo Articulo");
		Articulo_bckp tercer  = new Articulo_bckp(3, "Tercer Articulo");
		
		TreeSet<Articulo_bckp> ordenaArticulos = new TreeSet<Articulo_bckp>();
		
		ordenaArticulos.add(tercer);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(Articulo_bckp art: ordenaArticulos) {
			System.out.println(art.getDescripcion());
		}
	
		System.out.println(" ");
		
		Articulo_bckp comparadorArticulos= new Articulo_bckp();
		TreeSet<Articulo_bckp> ordenaArticulos2 = new TreeSet<Articulo_bckp>(comparadorArticulos); //en este treeSet los objetos se ordenaran segun lo que dicte el comparador que hemos pasado como argumento
	
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercer);
		
		for(Articulo_bckp art: ordenaArticulos2) {
			System.out.println(art.getDescripcion());
		}
	}

}



class Articulo_bckp implements Comparable<Articulo_bckp>, Comparator<Articulo_bckp>{

	public Articulo_bckp() {
		
	}
	public Articulo_bckp(int num, String desc) {
		numeroArticulo=num;
		descripcion=desc;
	}
	
	@Override
	public int compareTo(Articulo_bckp o) {
		return numeroArticulo - o.numeroArticulo; //si la resta es 0 es el mismo articulo
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	private int numeroArticulo;
	private String descripcion;
	
	
	@Override
	public int compare(Articulo_bckp o1, Articulo_bckp o2) {
		String descripcionA = o1.getDescripcion();
		String descripcionB = o2.getDescripcion();
		
		return descripcionA.compareTo(descripcionB);
	}
}




