package arrayList;

import java.util.*;


public class UsoEmpleado {

	public static void main(String[] args) {
		
		/*
		Empleado listaEmpleado[]=new Empleado[3];
		
		listaEmpleado[0]=new Empleado("Ana", 45, 2500);
		listaEmpleado[1]=new Empleado("Antonio", 55, 2000);
		listaEmpleado[2]=new Empleado("Maria", 25, 2600);
		*/
		
		ArrayList<Empleado>listaEmpleados = new ArrayList<Empleado>();
		
		//listaEmpleados.ensureCapacity(14); //aqui estas aprovechando mas el espacio te ahorras la copia
		
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Luisa", 45, 3500));
		listaEmpleados.add(new Empleado("Luisa", 45, 3500));
		
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Luisa", 45, 3500));
		listaEmpleados.add(new Empleado("Luisa", 45, 3500));
		
		listaEmpleados.add(new Empleado("Fernando",26,8800));
		listaEmpleados.add(new Empleado("Ana",26,1000));
		listaEmpleados.add(new Empleado("Ari",26,1000));
		listaEmpleados.add(new Empleado("Pop",26,1000));
		
		//listaEmpleados.add("Paco");
		
		//listaEmpleados.trimToSize(); //cortamos el exceso de memoria para optimizar el ahorro de memoria
		
		//listaEmpleados.add(new Empleado("Olga",25,1200));
		
		listaEmpleados.set(1,new Empleado("Olga",25,1200));
		
		//System.out.println(listaEmpleados.get(4).dameDatos());
		
		
		//System.out.println(listaEmpleados.size());
		
		/*
		for(Empleado e : listaEmpleados) {
			System.out.println(e.dameDatos());
		}
		*/
		
		//Vamos a crear un iterador
		Iterator <Empleado> miIterador = listaEmpleados.iterator(); //devuelve un objeto de tipo iterator y lo almacena en la variable
		while(miIterador.hasNext()) {
			System.out.println(miIterador.next().dameDatos());
		}
		
		/*
		for (int i=0; i<listaEmpleados.size(); i++) {
			Empleado e = listaEmpleados.get(i);
			System.out.println(e.dameDatos());
		}
		*/
		
		/*
		Empleado arrayEmpleados[]=new Empleado[listaEmpleados.size()];
		
		listaEmpleados.toArray(arrayEmpleados); //copiar lo que hay en arrayList dentro de un array normal
		
		for (Empleado e : arrayEmpleados) {
			System.out.println(e.dameDatos());
		}
		*/
		
	}

}

//--------------------------------------------------------------------------------------------------------------------

class Empleado{
	private String nombre;
	private int edad;
	private double sueldo;
	
	public Empleado(String n, int e, double s){
		nombre=n;
		edad=e;
		sueldo=s;
	}
	
	public String dameDatos() {
		return "El empleado/a se llama "+nombre+" .Tiene "+edad+" años"+ " y un salario de " + sueldo;
	}
}