package colecciones_I;

public class UsoLibro {
	
	public static void main(String[]args) {
		Libro libro1 = new Libro("P en JAVA","Juan",25);
		Libro libro2 = new Libro("P en JAVA","Juan",15);
		
		//libro1=libro2;
		
		if(libro1.equals(libro2)) {
			System.out.println("Es el mimso libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}else {
			System.out.println("No es el mimso libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}
	}

}
