/*
package usoThreads;

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;



public class UsoThreads_bcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame marco = new MarcoRebote();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		marco.setVisible(true);
	}

}

class PelotaHilos implements Runnable{
	public PelotaHilos(Pelota unaPelota, Component unComponente) {
		pelota=unaPelota;
		componente=unComponente;
	}
	
	
	
	@Override
	public void run() {
		
		System.out.println("Estado del hilo al comenzar: " + Thread.currentThread().isInterrupted());

		//for (int i=1; i<=3000; i++){	
		//while(!Thread.interrupted()){
		while(!Thread.currentThread().isInterrupted()){
			pelota.muevePelota(componente.getBounds());
			
			componente.paint(componente.getGraphics());
	
			try {
				Thread.sleep(4); //pausa de 4 milisegundos
			} catch (InterruptedException e) {
				//e.printStackTrace();
				//System.out.println("Hilo bloqueado. Imposible su interrupción!");
				Thread.currentThread().interrupt(); // detenga el hilo
			}
				
		}
		System.out.println("Estado del hilo al terminar: " + Thread.currentThread().isInterrupted());
	}

	//variables de instancia
	private Pelota pelota;
	private Component componente;
}

//Movimiento Pelota---------------------------------------

class Pelota{
	//Mueve la pelota invirtiendo la posicion si choca con limites
	
	public void muevePelota(Rectangle2D limites) {
		x+=dx;
		y+=dy;
		
		if(x<limites.getMinX()){
			x=limites.getMinX();
			dx=-dx;
		}
		
		if(x + TAMX>=limites.getMaxX()){
			x=limites.getMaxX() - TAMX;
			dx=-dx;
		}
		
		if(y<limites.getMinY()){
			y=limites.getMinY();
			dy=-dy;
		}
		
		if(y + TAMY>=limites.getMaxY()){
			y=limites.getMaxY()-TAMY;			
			dy=-dy;
		}
	}
	
	public Ellipse2D getShape() {
		return new Ellipse2D.Double(x,y,TAMX,TAMY);
	}
	
	private static final int TAMX = 15;
	private static final int TAMY = 15;
	private double x = 0;
	private double y = 0;
	private double dx = 1;
	private double dy = 1;
	
}


//Lamina que dibuja las pelotas----------------------------------------------------------------------


class LaminaPelota extends JPanel{
	
	//Añadimos pelota a la lámina
	
	public void add(Pelota b){	
		pelotas.add(b);
	}
	
	public void paintComponent(Graphics g){	
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		for(Pelota b: pelotas){
			g2.fill(b.getShape());
		}		
	}
	
	private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
}


//Marco con lamina y botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame{
	
	public MarcoRebote(){		
		setBounds(600,300,400,350);
		setTitle ("Rebotes");
		lamina=new LaminaPelota();
		add(lamina, BorderLayout.CENTER);
		JPanel laminaBotones=new JPanel();
		
		ponerBoton(laminaBotones, "Dale!", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				comienza_el_juego();
			}
			
		});
		
		
		ponerBoton(laminaBotones, "Salir", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				System.exit(0);
				
			}
			
		});

		// dibuja el boton de detener
		ponerBoton(laminaBotones, "Detener", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				detener();
				
			}
			
		});
		
		add(laminaBotones, BorderLayout.SOUTH);
	}
	
	
	//Ponemos botones
	
	public void ponerBoton(Container c, String titulo, ActionListener oyente){
		
		JButton boton=new JButton(titulo);
		
		c.add(boton);
		
		boton.addActionListener(oyente);
		
	}
	
	//Añade pelota y la bota 1000 veces
	
	public void comienza_el_juego (){
		
					
		Pelota pelota=new Pelota();
			
		lamina.add(pelota);
			
		//comenzamos con los pasos para la multitarea o hilos
			
		Runnable r = new PelotaHilos(pelota, lamina);
		
		//Thread t = new Thread(r);
		t = new Thread(r);
		t.start();
					
	}
	
    public void detener(){
		//t.stop();
    	t.interrupt();  // consigues detener solo el ultimo hilo creado
	}


    Thread t;
	private LaminaPelota lamina;
	
}

 */