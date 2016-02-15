package clases;

public class Cancion {
	private String nombreCancion;
	private int duracionSegundos;
	private Artista artista; //Composicion
	private String album;
	private String genero;
	private int tamanioBytes;
	private int anio;
	private String rutaArchivo;
	
	public Cancion(String nombreCancion, int duracionSegundos, Artista artista,
			String album, String genero, int tamanioBytes, int anio,
			String rutaArchivo) {
		this.nombreCancion = nombreCancion;
		this.duracionSegundos = duracionSegundos;
		this.artista = artista;
		this.album = album;
		this.genero = genero;
		this.tamanioBytes = tamanioBytes;
		this.anio = anio;
		this.rutaArchivo = rutaArchivo;
	}
	
	public Cancion(){}
	public String getNombreCancion() {
		return nombreCancion;
	}
	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}
	public int getDuracionSegundos() {
		return duracionSegundos;
	}
	public void setDuracionSegundos(int duracionSegundos) {
		this.duracionSegundos = duracionSegundos;
	}
	public Artista getArtista() {
		return artista;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getTamanioBytes() {
		return tamanioBytes;
	}
	public void setTamanioBytes(int tamanioBytes) {
		this.tamanioBytes = tamanioBytes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getRutaArchivo() {
		return rutaArchivo;
	}
	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}
	@Override
	public String toString() {
		return "Cancion [nombreCancion=" + nombreCancion
				+ ", duracionSegundos=" + duracionSegundos + ", artista="
				+ artista + ", album=" + album + ", genero=" + genero
				+ ", tamanioBytes=" + tamanioBytes + ", anio=" + anio
				+ ", rutaArchivo=" + rutaArchivo + "]";
	}
}
