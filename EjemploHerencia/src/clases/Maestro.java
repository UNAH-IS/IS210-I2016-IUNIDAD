package clases;

public class Maestro extends Persona {
	private double sueldo;

	public Maestro(String nombre, 
			String apellido, 
			String genero, 
			int edad,
			String carrera, 
			String correo, 
			double sueldo) {
		super(nombre, apellido, genero, edad, carrera, correo);
		this.sueldo = sueldo;
	}
	
	public Maestro(){}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Maestro [sueldo=" + sueldo + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", genero=" + genero + ", edad="
				+ edad + ", carrera=" + carrera + ", correo=" + correo + "]";
	}

	@Override
	public void aprobar() {
				
	}
	
	public void cobrar(){
		System.out.println("Cobrando");
	}
}
