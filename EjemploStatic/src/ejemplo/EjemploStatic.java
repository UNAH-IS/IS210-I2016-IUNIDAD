package ejemplo;

public class EjemploStatic {
	public EjemploStatic(){
		//Circulo c = new Circulo();
		//System.out.println(c.atributoEstatico);
		Circulo.atributoEstatico = 789;
		System.out.println(Circulo.atributoEstatico);
		
		Circulo c = new Circulo();
		System.out.println(c.atributoEstatico);
		
		System.out.println(Math.pow(2,2));
	}
	
	public static void main(String[] args) {
		new EjemploStatic();
	}

}
