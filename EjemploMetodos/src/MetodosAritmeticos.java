
public class MetodosAritmeticos{
	int numeroEntero;
	
	static int sumar(int a,int b){
		return a+b;
	}
	static int restar(int a,int b){
		return a-b;
	}
	static int dividir(int a,int b){
		return a/b;
	}
	static int multiplicar(int a,int b){
		return a*b;
	}
	
	public static void main(String[] args){
		int x = 5;
		int y = 4;
		System.out.println("Suma: " + sumar(x,y));
		System.out.println("Suma: " + sumar(15,20));
		System.out.println("Resta: " + restar(x,y));
		System.out.println("Multiplicacion: " + multiplicar(x,y));
		System.out.println("Division: " + dividir(x,y));
	}
}


