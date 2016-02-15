package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Artista;
import clases.Cancion;

public class Principal {
	//Variables y objetos
	private ArrayList<Cancion> canciones; //<> RawType, Receptaculo
	//private Cancion canciones[]; //En caso de utilizar arreglos
	
	
	public Principal(){
		//Logica del programa
		canciones = new ArrayList<Cancion>();
		
		
		/*
		Cancion c1 = new Cancion("Triller",150,
				new Artista("Michael Jackson","Michael Jackson"),
				"Album X", "Pop", 456465, 1981,
				"C:\\Mi Musica");
		
		Cancion c2 = new Cancion("Beat it",150,
				new Artista("Michael Jackson","Michael Jackson"),
				"Album X", "Pop", 456465, 1981,
				"C:\\Mi Musica");
		
		Cancion c3 = new Cancion("The girl is mine",150,
				new Artista("Michael Jackson","Michael Jackson"),
				"Album X", "Pop", 456465, 1981,
				"C:\\Mi Musica");
		
		canciones.add(c1);//0
		canciones.add(c2);//1
		canciones.add(c3);//2
		
		
		for (int i = 0; i<canciones.size();i++)
			System.out.println(canciones.get(i).toString());
		*/
		
		Cancion c = new Cancion();
		c.setNombreCancion(
				JOptionPane.showInputDialog(
						"Ingrese el nombre de la cancion"
				)
		);
		//Conversion con wrappers o clases envolventes.
		c.setAnio(
				Integer.valueOf(JOptionPane.showInputDialog("Año cancion: "))
		);
		
		JOptionPane.showMessageDialog(null, 
				"Año: " + c.getAnio());
		
	}

	public static void main(String[] args) {
		new Principal(); //Instancia anonima+		
	}
}
