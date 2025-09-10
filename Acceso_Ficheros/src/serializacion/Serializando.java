package serializacion;

import java.io.*;  //para la serialización
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Administrador jefe = new Administrador ("Juan",80000,2005,12,15);
		
		jefe.setIncentivo(5000);
		
		Empleado [] personal = new Empleado[3]; //vamos a serializar este array
		
		personal[0]=jefe;
		personal[1]=new Empleado ("Ana",25000,2008,10,1);
		personal[2]=new Empleado ("Luis",18000,2012,9,15);
		
		
		try {
			//escribimos el objeto (de dentro hacia fuera)
			ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream
					("/Users/fernando/Desktop/0001 PROGRAMACION/04_pild_info_java/001archivos/java_serializado/empleado.dat"));
			escribiendoFichero.writeObject(personal);
			escribiendoFichero.close();
			
			//leemos el objeto (de fuera para dentro)
			ObjectInputStream recuperandoFichero = new ObjectInputStream(new FileInputStream
					("/Users/fernando/Desktop/0001 PROGRAMACION/04_pild_info_java/001archivos/java_serializado/empleado.dat"));
			Empleado[] personalRecuperado = (Empleado[])recuperandoFichero.readObject();
			recuperandoFichero.close();
			for(Empleado e:personalRecuperado) {
				System.out.println(e);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

//------------------------------------------------------------------------------------------------------
 
class Empleado implements Serializable{
	
	
	
	private static final long serialVersionUID = 9113216727639003440L;
	//variables de la clase empleado
	private String nombre;
	private double sueldos;
	private int agno,mes,dia;
	private Date fechaContrato;
	
	public Empleado(String n, double s, int agno, int mes, int dia) {
		nombre = n;
		sueldos = s;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		fechaContrato = calendario.getTime();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldos;
	}

	public void setSueldo(double sueldo) {
		this.sueldos = sueldo;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}
	
	public void subirSueldo (double porcentaje) {
		double aumento = (sueldos * porcentaje) /100;
		sueldos += aumento;		
	}
	
	public String toString() {
		return "Nombre = " + nombre + ", sueldo = " + sueldos + ", fecha de contrato = " + fechaContrato;
	}
	
}


//------------------------------------------------------------------------------------------------------

class Administrador extends Empleado{
	
	
	
	private static final long serialVersionUID = 1881056236380136510L;
	private double incentivo;
	
	public Administrador(String n, double s, int agno, int mes, int dia) {
		super(n,s,agno,mes,dia);
		incentivo = 0;
	}
	
	public double getSueldo() {
		double sueldoBase = super.getSueldo();
		return sueldoBase + incentivo;
	}
	
	public void setIncentivo(double b) {
		incentivo = b;
	}
	
	public String toString() {
		return super.toString()+ " Incentivo= " + incentivo;
	}
	
}





