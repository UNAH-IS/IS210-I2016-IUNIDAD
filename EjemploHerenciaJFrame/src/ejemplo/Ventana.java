package ejemplo;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
//awt: Abstract Windowing Toolkit (Deprecado)
//swing
//JavaFX


public class Ventana extends JFrame{
	public Ventana(){
		setTitle("Titulo de la ventana");
		//setBounds(100, 100, 400, 400);
		//setLocation(100,00);
		setSize(400,400);//Define el tamaño en pixels
		setLocationRelativeTo(null);//Centra la ventana en la pantalla
		
		//Agrega la funcionalidad para finalizar la aplicacion
		//cuando se de click en la X
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(new Color(123,4,150));
		g.drawRect(50, 50, 40, 40);
		g.drawLine(20, 20, 100, 200);
		g.drawRoundRect(0, 200, 100, 100, 50, 50);
		g.setColor(new Color(255,0,0));
		g.drawOval(200,	200, 100, 100);
		g.fillOval(50,	30, 100, 100);
		for (int i = 0; i< 200; i++)
			g.drawOval(200,	200+(i*5), 100+(i+20), 100);
		
		try {
			g.drawImage(ImageIO.read(new File("F:\\Teach UNAH\\Programacion II\\2016-I\\Repositorio de Ejercicios\\Unidad I\\EjemploHerenciaJFrame\\src\\ejemplo\\tbl_perfilesimagen.jpg")), 10, 40, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//FPS
	
	public static void main(String[] args) {
		new Ventana();
	}
}
