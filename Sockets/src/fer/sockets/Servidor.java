package fer.sockets;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;

public class Servidor {

public static void main(String[]args) {
		MarcoServidor mimarco = new MarcoServidor();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
} 


//permanecer cte a la escucha y mantener el puerto 9999 abierto --> para conseguir esas dos cosas al mismo tiempo --> Threads
class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor() {
		
		setBounds(1200,300,280,350);
		JPanel milamina = new JPanel();
		milamina.setLayout(new BorderLayout());
		areatexto = new JTextArea();
		milamina.add(areatexto,BorderLayout.CENTER);
		add(milamina);
		setVisible(true);
		
		Thread mihilo = new Thread(this);
		mihilo.start();
		
	}
	
	public void run() {
		
		//System.out.println("Estoy a la escucha");
		
		try {
			ServerSocket servidor = new ServerSocket(9999);
			
			//para la serialización, alamacenamos la informacion que le llega
			String nick,ip,mensaje; 
			//La instacia del paquete que envia el cliente
			PaqueteEnvio paquete_recibido;
			
			while(true) {
				Socket misocket = servidor.accept();
			
				/*
				DataInputStream flujo_entrada = new DataInputStream(misocket.getInputStream());
				String mensaje_texto = flujo_entrada.readUTF();		
				areatexto.append("\n" + mensaje_texto);
				*/
				
				ObjectInputStream paquete_datos = new ObjectInputStream(misocket.getInputStream());
				paquete_recibido = (PaqueteEnvio) paquete_datos.readObject();
				
				nick = paquete_recibido.getNick();
				ip = paquete_recibido.getIp();
				mensaje = paquete_recibido.getMensaje();
				
				areatexto.append("\n" + nick + ": " + mensaje + " para " + ip);
				
				
				
				misocket.close();
			}
			
		} catch (IOException | ClassNotFoundException e) { //dos excepciones la de conexion y la de paquete recibido
			
			e.printStackTrace();
		} 
		
	}
	
	private JTextArea areatexto;
}
