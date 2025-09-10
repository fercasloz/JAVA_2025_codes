package clasesPropias;

public class Pareja <T> {

	private T primero;
	
	public Pareja() {
		primero = null;
	}
	
	public void setPrimero(T nuevoValor) {
		primero = nuevoValor;
	}
	
	public T getPrimero() {
		return primero;
	}
	
	public static void imprimirTrabajador(Pareja<? extends Empleado> p) {  //puede recibir empleado o cualquier subclase perteneciente a empleado
		Empleado primero = p.getPrimero();
		System.out.println(primero);
	}
	
	
	
}
