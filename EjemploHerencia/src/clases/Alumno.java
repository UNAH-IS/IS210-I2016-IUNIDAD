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
	
	//Si la clase padre tiene un constructor vacio, 
	//desde el constructor de la clase
	//no es necesario utilizar super ya que automaticamente 
	//llama al constructor vacio
	public Alumno(){}
	
	@Override
	public void matricular(){
		super.matricular();
		System.out.println("Matricular desde la clase hija (Alumno)");
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "Alumno [cuenta=" + cuenta + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", genero=" + genero + ", edad="
				+ edad + ", carrera=" + carrera + ", correo=" + correo + "]";
	}

	@Override
	public void aprobar() {
		//
	}		
}
