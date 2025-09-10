package excepciones_I;

import java.io.EOFException;

import javax.swing.*;

public class compruebaEmail {
	
	public static void main (String[]args) {
		
		String miMail = JOptionPane.showInputDialog("Introduce mail");
		
		try {
			
		checkMail(miMail);
		
		}catch(mailLengthException e) {
			System.out.println("El mail es demasiado corto");
			//e.printStackTrace(); //imprime la traza del error y nos dice que clase lanza la excepcion
		}
		
		
		
		/*try {
			
			checkMail(miMail);
			
		}catch(EOFException e){
			
			System.out.println("La direccion de email no es correcta");
		
		} */
		
		
	}
	
	static void checkMail(String mail) throws mailLengthException{
		
		int arroba = 0;
		boolean punto=false;
		
	    if(mail.length()<=3) {
	    	
	    		//ArrayIndexOutOfBoundsException miExcepcion = new ArrayIndexOutOfBoundsException();
	    		//throw miExcepcion;
	    		//throw new EOFException();
	    	
	    		throw new mailLengthException("El mail no puede tener menos de 3 carácteres");
	    	
	    	}
		
		for (int i=0; i<mail.length(); i++) {
			
			if(mail.charAt(i)=='@') {
				
				arroba ++;
			}
			
			if(mail.charAt(i)=='.'){
				
				punto = true;
				
			}
		}
		
		if (arroba == 1 && punto == true) {
			
			System.out.println("El email es correcto");
		}else {
			
			System.out.println("El email no es correcto");
			
		}
	}

}



class mailLengthException extends Exception{
	
	public mailLengthException() {
		
	}
	
	public mailLengthException(String msj_error) {
		
		super(msj_error);
		
	}
	
}


