package clases;

import java.awt.Color;

public abstract class Figura {
	protected double area;
	protected double perimetro;
	protected int x;
	protected int y;
	protected Color color;
	
	public Figura(double area, double perimetro, Color color, int x, int y) {
		this.area = area;
		this.perimetro = perimetro;
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	public Figura(int x, int y, Color color) {
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	public Figura(){}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Figura [area=" + area + ", perimetro=" + perimetro + ", color="
				+ color + ", x=" + x + ", y=" + y + "]";
	}
	
	public abstract void dibujar();
	
	public abstract void mover();
}
