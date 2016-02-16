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
		
		int opcion = 0;
		do{
			opcion = Integer.valueOf(JOptionPane.showInputDialog(
					"0 Salir\n"
					+ "1 Agregar una cancion\n"
					+ "2 Modificar una cancion\n"
					+ "3 Eliminar una cancion\n"
					+ "4 Mostrar la informacion guardada."));
			JOptionPane.showMessageDialog(null, "Opcion " + opcion);
			switch(opcion){
				case 0:
					System.out.println("Adios");
					break;
				case 1:
					agregarRegistro();
					break;
				case 2:
					modificarRegistro();
					break;
				case 3:
					eliminarRegistro();
					break;
				case 4:
					mostrarInformacion();
					break;
			}
			
		}while(opcion!=0);
		
	}
	
	public void agregarRegistro(){
		//Crear una instancia vacia
		Cancion c = new Cancion();
		//Solicitar informacion
		c.setNombreCancion(JOptionPane.showInputDialog("Ingrese el nombre de la cancion:"));
		c.setAlbum(JOptionPane.showInputDialog("Ingrese el nombre del Album:"));
		c.setGenero(JOptionPane.showInputDialog("Ingrese el genero de la cancion:"));
		c.setRutaArchivo(JOptionPane.showInputDialog("Ingrese la ruta del archivo:"));
		c.setAnio(Integer.valueOf(JOptionPane.showInputDialog("Año")));
		c.setDuracionSegundos(Integer.valueOf(JOptionPane.showInputDialog("Duración en segundos")));
		c.setTamanioBytes(Integer.valueOf(JOptionPane.showInputDialog("Tamaño en bytes:")));
		
		//Llenar la informacion del artista, 
		//hay que crear un objeto nuevo porque se esta 
		//usando composicion.
		Artista a = new Artista();
		a.setNombre(JOptionPane.showInputDialog("Artista"));
		a.setVocalista(JOptionPane.showInputDialog("Vocalista"));
		c.setArtista(a);
		
		//Agregar el objeto creado al ArrayList
		canciones.add(c);
		
	}
	
	public void modificarRegistro(){
		//Solicitar al usuario el indice que desea modificar
		int indiceModificar = 
				Integer.valueOf(
					JOptionPane.showInputDialog("Que registro desea modificar? del (0 al "+(canciones.size()-1)+")"));
		
		//Obtener el objeto a modificar
		Cancion c = canciones.get(indiceModificar);
		
		//Solicitar nuevamente la informacion al usuario
		c.setNombreCancion(JOptionPane.showInputDialog("Ingrese el nombre de la cancion:", c.getNombreCancion()));
		c.setAlbum(JOptionPane.showInputDialog("Ingrese el nombre del Album:", c.getAlbum()));
		c.setGenero(JOptionPane.showInputDialog("Ingrese el genero de la cancion:", c.getGenero()));
		c.setRutaArchivo(JOptionPane.showInputDialog("Ingrese la ruta del archivo:", c.getRutaArchivo()));
		c.setAnio(Integer.valueOf(JOptionPane.showInputDialog("Año", c.getAnio())));
		c.setDuracionSegundos(Integer.valueOf(JOptionPane.showInputDialog("Duración en segundos", c.getDuracionSegundos())));
		c.setTamanioBytes(Integer.valueOf(JOptionPane.showInputDialog("Tamaño en bytes:", c.getTamanioBytes())));
		//Llenar la informacion del artista, 
		//hay que crear un objeto nuevo porque se esta 
		//usando composicion.
		Artista a = new Artista();
		a.setNombre(JOptionPane.showInputDialog("Artista",c.getArtista().getNombre()));
		a.setVocalista(JOptionPane.showInputDialog("Vocalista", c.getArtista().getVocalista()));
		c.setArtista(a);
		
		
		//Actualizar el objeto en el ArrayList
		canciones.set(indiceModificar, c);
	}
	
	public void eliminarRegistro(){
		
	}
	
	public void mostrarInformacion(){
		for(int i=0; i<canciones.size();i++)
			System.out.println(canciones.get(i).toString());
	}

	public static void main(String[] args) {
		new Principal(); //Instancia anonima+		
	}
}
