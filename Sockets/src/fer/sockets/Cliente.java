package fer.sockets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.*;

import javax.swing.*;
import java.net.*;

public class Cliente {

	public static void main (String[] args) {
		MarcoCliente mimarco = new MarcoCliente();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);	
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		add(milamina);
		setVisible(true);
	}	
} 

class LaminaMarcoCliente extends JPanel{
	
	public LaminaMarcoCliente() {
		
		nick = new JTextField(5);
		add(nick);
		
		JLabel texto = new JLabel("-CHAT-");
		add(texto);
		
		ip = new JTextField(8);
		add(ip);
		
		campochat = new JTextArea(12,20);
		add(campochat);
		
		campo1 = new JTextField(20);
		add(campo1);
		miboton = new JButton("Enviar");
		
		EnviaTexto mievento = new EnviaTexto();
		
		miboton.addActionListener(mievento);
		
		add(miboton);
	}
	
	private class EnviaTexto implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			//System.out.println(campo1.getText());
			
			//creamos el socket
			
			try {
				Socket misocket = new Socket("192.168.18.143",9999); //(direccion ip local,abierto el puerto 9999)
				
				PaqueteEnvio datos = new PaqueteEnvio();
				
				datos.setNick(nick.getText());
				datos.setIp(ip.getText());
				datos.setMensaje(campo1.getText());
				
				/*
				DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
				
				flujo_salida.writeUTF(campo1.getText());  //escribe en el flujo lo que hay en el campo 1
				
				flujo_salida.close();
				*/
				
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
			
		}
		
	}
	
	
	
	private JTextField campo1;
	private JButton miboton;
	
	private JTextArea campochat;
	
	private JTextField nick, ip;
	
}



class PaqueteEnvio{
	
	private String nick, ip, mensaje;

	/**
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * @param nick the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
}