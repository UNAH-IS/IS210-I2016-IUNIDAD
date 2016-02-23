package clases;

public class Alumno extends Persona{ //Clase persona es la clase padre
	private String cuenta;
	
	public Alumno(String nombre, String apellido, String genero, int edad,
			String carrera, String correo, String cuenta){
		//Obligatoriamente se debe llamar el constructor
		//de la clase padre desde el constructor de 
		//la clase hija
		super(nombre, apellido, genero, edad, carrera, correo);
		this.cuenta = cuenta;
	}
	
	public void matricular(){}
}
