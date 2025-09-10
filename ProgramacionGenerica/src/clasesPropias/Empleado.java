package clasesPropias;

public class Empleado {

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
