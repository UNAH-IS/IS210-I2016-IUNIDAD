package clases;

import java.awt.Color;

public class Rectangulo extends Figura{
	protected int alto;
	protected int base;
	
	
	
	public Rectangulo(int x, int y,
			int alto, int base, Color color) {
		super(x, y, color);
		this.alto = alto;
		this.base = base;
	}
	
	

	public int getAlto() {
		return alto;
	}



	public void setAlto(int alto) {
		this.alto = alto;
	}



	public int getBase() {
		return base;
	}



	public void setBase(int base) {
		this.base = base;
	}



	@Override
	public void dibujar() {
		
	}

	@Override
	public void mover() {
		
	}

}
