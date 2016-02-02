
public class OperadoresAritmeticos {

	public static void main(String[] args) {
		float a      = 12f;
		float b      = 10f;
		int suma   = (int)(a + b);
		int resta  = (int)a - (int)b;
		int mult   = (int)a * (int)b;
		float div    = a / b;
		float modulo = a % b;
		//Hay que tener cuidado al hacer conversiones con tipos incompatibles
		//boolean boleano = false;
		//System.out.println("Resultado: " + (int)boleano);//ERROR
		
		System.out.print("Suma :");
		System.out.println(suma );
		System.out.print("Resta :");
		System.out.println(resta);
		System.out.print("Multiplicacion :");
		System.out.println(mult);
		System.out.print("Division :");
		System.out.println(div);
		System.out.print("Modulo :");
		System.out.println(modulo);
	}

}
