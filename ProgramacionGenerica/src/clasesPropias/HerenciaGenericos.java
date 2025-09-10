package clasesPropias;

public class HerenciaGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Empleado Administrativa = new Empleado("Elena",45,1500);
		
		Jefe DirectoraComercial = new Jefe("Ana",27,3500);
		
		Empleado nuevoEmpleado = DirectoraComercial;
		*/
		
		Pareja<Empleado> administrativa = new Pareja <Empleado>();
		
		Pareja<Jefe> directoraComercial = new Pareja <Jefe>();

		//Pareja<Empleado>nuevoEmpleado = directoraComercial;
		
		Pareja.imprimirTrabajador(administrativa);
		
		Pareja.imprimirTrabajador(directoraComercial);
	}

}
