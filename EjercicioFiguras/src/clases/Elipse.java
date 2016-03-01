package clases;

import java.awt.Color;

public class Elipse extends Figura {
	protected int diametro1;
	protected int diametro2;
	
	
	public Elipse(int x, int y,
			int diametro1, int diametro2, Color color) {
		super(x, y, color);
		this.diametro1 = diametro1;
		this.diametro2 = diametro2;
	}
	
	public int getDiametro1() {
		return diametro1;
	}


	public void setDiametro1(int diametro1) {
		this.diametro1 = diametro1;
	}


	public int getDiametro2() {
		return diametro2;
	}


	public void setDiametro2(int diametro2) {
		this.diametro2 = diametro2;
	}


	@Override
	public void dibujar() {
		
	}

	@Override
	public void mover() {
		
	}

}
