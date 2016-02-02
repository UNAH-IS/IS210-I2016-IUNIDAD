package clases;

public class OperadoresUnarios{
	public static void main(String[] args){
		int a = 2;
		//a++ =>  a=a+1;
		int b = 2;
		final int VALOR_MAXIMO = 100;
		System.out.println(a--); //Imprime 2
		System.out.println(--b); //Imprime 1
		System.out.print("Estado Final (a) :");
		System.out.println(a); //Imprime 3
		System.out.print("Estado Final (b) :");
		System.out.println(b); //Imprime 3
		System.out.println("Valor constante: "+VALOR_MAXIMO); //Imprime 3
		
	}
}
