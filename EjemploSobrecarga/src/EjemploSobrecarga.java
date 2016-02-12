
public class EjemploSobrecarga {
	public static int sumar(int a, int b){
		return a + b;		
	}
	
	public static double sumar(double a, double b){
		return a + b; 
	}
	
	public static float sumar(float a, float b){
		return a + b; 
	}
	
	public static int sumar(int a, int b, int c){
		return a + b + c;
	}	
	
	public static void main(String args[]){
		System.out.println("Suma enteros: " + sumar(45,10));
		System.out.println("Suma de flotantes: " + 
				sumar(45.5f,10.6f));
		System.out.println("Suma de doubles: " + 
				sumar(45.5,10.6));
		System.out.println("Suma de 3 enteros: " + sumar(45,10,10));
	}
}
