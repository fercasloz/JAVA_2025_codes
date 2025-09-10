package colecciones_I;

import java.util.*;

public class CuentasUsuarios {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente ("Juan Banderas","00001",200000);
		Cliente cl2 = new Cliente ("Rafael Nadal","00002",250000);
		Cliente cl3 = new Cliente ("Penelope Cruz","00003",300000);
		Cliente cl4 = new Cliente ("Julio Iglesias","00004",500000);
		Cliente cl5 = new Cliente ("Juan Banderas","00001",200000);
		
		//Para crear la coleccion habrá que ver cual tiene más sentido\\
		/* ¿Se van a repetir clientes? 
		 * ¿Vamos a tener que agrgar y borrar muchos clientes?
		 * ¿Vamos a acceder mucho a ellos?
		 * SET --> no tenemos acceso aleatorio y poca eficiencia para ordenar (Ventajas --> no se permiten duplicados y un metodo add
		 * muy eficiente)
		 */
		
		Set<Cliente>clientesBanco = new HashSet<Cliente>();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);  //no permite duplicados ¿?¿? como lo hacemos para que JAVA detecte que es el mismo objeto --> HashCode
		
		
		/*
		for (Cliente cliente : clientesBanco) {
			
			/*System.out.println(cliente.getNombre()+ " " + cliente.getnCuenta() + " "
								+cliente.getSaldo());
			if(cliente.getNombre().equals("Julio Iglesias")) {
				clientesBanco.remove(cliente);
			}
		} */
		
		
		Iterator<Cliente>it = clientesBanco.iterator();
		while(it.hasNext()) {
			String nombreCliente=it.next().getNombre();
			if(nombreCliente.equals("Julio Iglesias")) {
				it.remove();
			}
		}
		
		
		for (Cliente cliente : clientesBanco) {
			
			System.out.println(cliente.getNombre()+ " " + cliente.getnCuenta() + " "
								+cliente.getSaldo());
		}
		
		
		//recorrer coleccion con iterator (similar a usar un bucle for each (arriba))
		
		/*
		Iterator<Cliente>it = clientesBanco.iterator(); //nuestro objeto iterador
		
		while(it.hasNext()) {
			String nombreCliente=it.next().getNombre();
			System.out.println(nombreCliente);
			
			String nCuenta=it.next().getnCuenta();
		}
		*/
		
		
	}

}
