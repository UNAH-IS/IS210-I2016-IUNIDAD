package ejemplos;

public class EjemploArreglos {
	//Declaracion de variables globales
	
	
	public static void main(String args[]){
		//Declaracion de variables locales
		int otroArreglo[];
		int[] edades = new int[4];
		float[] estaturas = new float[3];
		String[] nombres = new String[2];
		double[] numeros = {1.73, 1.67, 1.56}; //Arreglo de 3 elementos
		
		edades[0] = 25;
		edades[1] = 15;
		edades[2] = 30;
		edades[3] = 80;
		//edades[4] = 55; //ArrayIndexOutOfBoundsException
		
		for (int i = 0; i<edades.length; i++)
			System.out.println("Elemento "+i+": "+edades[i]);
		
	}
}
