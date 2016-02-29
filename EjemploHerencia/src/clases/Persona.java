package clases;

public abstract class Persona /*extends Object*/{
	//Modificador de acceso protected es similar a private
	//la diferencia es que es posible acceder a los atributos
	//o metodos desde las clases hijas
	protected String nombre;
	protected String apellido;
	protected String genero;
	protected int edad;
	protected String carrera;
	protected String correo;
	public Persona(String nombre, String apellido, String genero, int edad,
			String carrera, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.edad = edad;
		this.carrera = carrera;
		this.correo = correo;
	}
	
	public Persona(){
		System.out.println("Ejecutando constructor de persona");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", genero=" + genero + ", edad=" + edad + ", carrera="
				+ carrera + ", correo=" + correo + "]";
	}
	
	public void matricular(){
		System.out.println("Matricular desde la clase padre(Persona)");
	}
	
	public abstract void aprobar();
	
	public void reprobar(){}
}
