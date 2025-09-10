package clasesPropias;

import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main (String [] args) {
		
		String nombres[]= {"Jose","Maria","Ana"};
		
		System.out.println(MisMatrices.getMenor(nombres));
		
		/*
		Empleado paco = new Empleado("Paco",45,2500);
		Empleado maria = new Empleado("Maria",45,2500);
		Empleado ana = new Empleado("Ana",45,2500);
		
		Empleado misEmpleados[]= {paco,maria,ana};
		System.out.println(MisMatrices.getMenor(misEmpleados));
		*/
		
		GregorianCalendar fechas[]= {new GregorianCalendar (2015,07,12),
									 new GregorianCalendar (2015,05,12),
									 new GregorianCalendar (2015,04,12)
									 };
		System.out.println(MisMatrices.getMenor(fechas));
		
	}
}



class MisMatrices{
	
	
	public static <T> String getElementos(T[]a) {  //
		
		return "El array tiene " + a.length + " elementos.";
		
	}
	
	//----------------------------------------------------------------------------------
	
	public static <T extends Comparable> T getMenor(T[]a) { //tipo hereda de comparable para implementar la interfaz comparable
															//métodos genéricos
		if(a==null||a.length==0) {
			return null;
		}
		
		T elementoMenor=a[0];
		
		
		for (int i=1; i<a.length; i++) { //se puede hacer con for each??
			
			if(elementoMenor.compareTo(a[i])>0) {
				elementoMenor=a[i];
			}
		}
		
		/*
		for (T elem : a) {
			if(elementoMenor.compareTo(elem)>0) {
				elementoMenor=elem;
			}		
		}
	   */
		return elementoMenor;
	}
}


