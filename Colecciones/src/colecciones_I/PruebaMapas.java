package colecciones_I;

import java.util.*;

public class PruebaMapas {

	public static void main(String[] args) {
		
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();

		personal.put("145", new Empleado("Juan"));
		personal.put("146", new Empleado("Ana"));
		personal.put("147", new Empleado("Antonio"));
		personal.put("148", new Empleado("Sandra"));
		
		System.out.println(personal);
		
		//como eliminamos un objeto almacenado en un mapa
		
		personal.remove("147");
		
		System.out.println(personal);

		personal.put("148", new Empleado("Hola"));
		
		System.out.println(personal);

		//System.out.println(personal.entrySet());
		
		for(Map.Entry<String, Empleado> entrada : personal.entrySet()) { //accedes a las parejas de valores
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			
			System.out.println("Clave = " + clave + " , Valor = " + valor);
		}
	}

}


class Empleado{
	
	public Empleado(String n) {
		name=n;
		sueldo=2000;
	}
	
	public String toString(){
		return "[Nombre = "+ name +" , sueldo= " + sueldo + " ]";
	}
	
	private String name;
	private double sueldo;
}
