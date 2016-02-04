package ejemplos;

import java.util.Scanner;

public class EjemploScanner {
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		String nombre;
		String apellido;
		int a;
		int b;
		int suma;
		System.out.print("Ingrese un numero: ");
		a = entrada.nextInt();
		System.out.print("Ingrese otro numero: ");
		b = entrada.nextInt();
		suma = a + b;
		
		entrada.nextLine();//Evitar problema del enter15
		System.out.print("Cual es su nombre: ");
		nombre = entrada.nextLine();
		System.out.print("Cual es su apellido: ");
		apellido = entrada.nextLine();
		
		
		System.out.print("Hola " + nombre +" "+ apellido + ", la suma de los numeros que ingreso es: " + suma);		
		
		entrada.close();		
	}
}