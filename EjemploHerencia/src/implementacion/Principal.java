package implementacion;

import java.util.ArrayList;

import clases.Alumno;
import clases.Maestro;
import clases.Persona;

public class Principal {
	/* Por compatibilidad de clases es posible agregar
	 * objetos hijos en una coleccion en la que el RawType
	 * sea de la clase padre
	 */
	
	private ArrayList<Persona> personas;
	
	public Principal(){
		personas = new ArrayList<Persona>();
		
		//La compatibilidad de clases
		//permite crear instancias a partir de 
		//constructores de las clases hijas
		Persona p = new Alumno("Mario","Rodriguez","M",34,"Ing. Sistemas",
				"jperez@gmail.com",
				"20001232333");
		
		//Instanciar una clase hija utilizando 
		//el constructor de una clase padre no
		//es posible
		//Alumno a6 = new Persona();
		
		
		
		
		/* No se puede instanciar una clase abstracta
		 * Persona p = new Persona("Maria", "Gomez", "F",
				44,"Ing Quimica", "maria@gmail.com");*/
		
		Alumno a1 = new Alumno(
				"Juan","Perez","M",34,"Ing. Sistemas",
				"jperez@gmail.com",
				"20001232333");
		
		Alumno a2 = new Alumno(
				"Luis","Perez","M",34,"Ing. Sistemas",
				"jperez@gmail.com",
				"20001232333");
		
		Alumno a3 = new Alumno(
				"Gustavo","Perez","M",34,"Ing. Sistemas",
				"jperez@gmail.com",
				"20001232333");
		
		
		//System.out.println(a);
		
		Maestro m1 = new Maestro("Pedro", "Lainez",
				"M", 34, "Ing en Sistemas", 
				"pedro@gmail.com", 10000);
		Maestro m2 = new Maestro("Luisa", "Lainez",
				"M", 34, "Ing en Sistemas", 
				"pedro@gmail.com", 10000);
		Maestro m3 = new Maestro("Julieta", "Lainez",
				"M", 34, "Ing en Sistemas", 
				"pedro@gmail.com", 10000);
		
		//System.out.println(m);
		
		//personas.add(p);
		personas.add(a1);
		personas.add(m3);
		personas.add(a3);
		personas.add(m1);
		personas.add(a2);
		personas.add(m2);
		personas.add(p);
		
		metodoX(m1);
		mostrarAlumnos();
		mostrarMaestros();
	}
	
	public void mostrarAlumnos(){
		System.out.println("------Listado de Alumnos-------");
		for(int i=0; i< personas.size();i++){
			//El operador instanceof es un operador logico
			//objeto instanceof Clase
			if (personas.get(i) instanceof Alumno)
				System.out.println(personas.get(i).toString());
		}
	}
	
	public void mostrarMaestros(){
		System.out.println("------Listado de Maestros-------");
		for(int i=0; i< personas.size();i++){
			//El operador instanceof es un operador logico
			//objeto instanceof Clase
			if (personas.get(i) instanceof Maestro){
				System.out.println(personas.get(i).toString());
				/*Maestro x = (Maestro)personas.get(i);
				x.cobrar();*/
				//Por compatibilidad de clases es posible hacer 
				// cast o conversion de un tipo Padre a un
				// objeto de una clase hija
				((Maestro)personas.get(i)).cobrar();
			}
		}
	}
	
	public void metodoX(Persona p){
	
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
