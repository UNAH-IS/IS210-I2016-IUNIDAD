package ejemplo;

public class EjemploMetodosString {

	public EjemploMetodosString(){
		String cadena = "Hola Pedro";
		System.out.println(cadena.length());
		System.out.println(cadena.indexOf("o"));
		System.out.println(cadena.lastIndexOf("o"));
		System.out.println(cadena.charAt(0));
		System.out.println(cadena.substring(5,10));
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());
		
		if (cadena.equalsIgnoreCase("HOla Pedro"))
			System.out.println("Si son iguales");
		
		
		String partes[] = cadena.split(" ");
		System.out.println(partes[0]);
		System.out.println(partes[1]);
		
		if (cadena.contains("Pedro"))
			System.out.println("Si esta la subcadena");
	}
	
	public static void main(String[] args) {
		new EjemploMetodosString();
	}

}
