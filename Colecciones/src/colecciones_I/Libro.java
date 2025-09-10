package colecciones_I;

import java.util.Objects;

public class Libro {

	public Libro(String titulo, String autor, int ISBN) {
		this.titulo=titulo;
		this.autor=autor;
		this.ISBN=ISBN;
	}
	
	public String getDatos() {
		return "\nEl titulo es: " + titulo + "\nEl autor es: " 
				+ autor + "\nY el ISBN es:";
	}
	
	/*
	public boolean equals(Object obj) {
		
		if (obj instanceof Libro) {
			Libro otro=(Libro)obj;
			
			if(this.ISBN==otro.ISBN) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	*/
	
	
	private String titulo;
	
	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return ISBN == other.ISBN;
	}

	private String autor;
	private int ISBN;
}
