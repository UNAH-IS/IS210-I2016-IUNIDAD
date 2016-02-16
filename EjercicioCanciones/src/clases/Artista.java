package clases;

public class Artista {
	private String nombre;
	private String vocalista;
	
	public Artista(String nombre, String vocalista) {
		this.nombre = nombre;
		this.vocalista = vocalista;
	}
	
	public Artista(){}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVocalista() {
		return vocalista;
	}

	public void setVocalista(String vocalista) {
		this.vocalista = vocalista;
	}

	@Override
	public String toString() {
		return "Artista [nombre=" + nombre + ", vocalista=" + vocalista + "]";
	}
}
