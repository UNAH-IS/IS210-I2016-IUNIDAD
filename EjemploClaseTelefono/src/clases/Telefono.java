package clases;

public class Telefono {
	private String color;
	private String marca;
	private String modelo;
	private String sistemaOperativo;
	private String resolucion;
	private int capacidadMemoriaBytes;
	private int capacidadMemoriaAlmacenamientoBytes;

	public Telefono(String color, 
			String marca, 
			String modelo,
			String sistemaOperativo, 
			String resolucion,
			int capacidadMemoriaBytes, 
			int capacidadMemoriaAlmacenamientoBytes) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.sistemaOperativo = sistemaOperativo;
		this.resolucion = resolucion;
		this.capacidadMemoriaBytes = capacidadMemoriaBytes;
		this.capacidadMemoriaAlmacenamientoBytes = capacidadMemoriaAlmacenamientoBytes;
	}

	/*public Telefono(String color,
			String marca,
			String modelo,
			String sistemaOperativo,
			String resolucion,
			int capacidadMemoriaBytes,
			int capacidadMemoriaAlmacenamientoBytes){
		this.color = color;
		this.marca = marca;
		this.sistemaOperativo = sistemaOperativo;
		this.resolucion = resolucion;
		this.capacidadMemoriaBytes = capacidadMemoriaBytes;
		this.capacidadMemoriaAlmacenamientoBytes = capacidadMemoriaAlmacenamientoBytes;
	}*/
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public int getCapacidadMemoriaBytes() {
		return capacidadMemoriaBytes;
	}

	public void setCapacidadMemoriaBytes(int capacidadMemoriaBytes) {
		this.capacidadMemoriaBytes = capacidadMemoriaBytes;
	}

	public int getCapacidadMemoriaAlmacenamientoBytes() {
		return capacidadMemoriaAlmacenamientoBytes;
	}

	public void setCapacidadMemoriaAlmacenamientoBytes(
			int capacidadMemoriaAlmacenamientoBytes) {
		this.capacidadMemoriaAlmacenamientoBytes = capacidadMemoriaAlmacenamientoBytes;
	}

	public void encender(){
		System.out.println("Encendiendo...");
	}
	
	public void apagar(){
		System.out.println("Apagando...");
	}
	
	public void llamar(){}
	
	public void colgar(){}
	
	public void navegar(){}
}
